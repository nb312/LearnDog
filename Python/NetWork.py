# user/python
import os, sys
a = {
    "controller": "advertise",
    "v1": True,
    "desc": "我的广告列表",
    "func": [
        #接口1
        {
            "method": "POST",
            "hasItem":True,
            "isList": True,
            "path": "advertise/updateVacationStatus",
            "desc":"广告设置"
            ,
            "params": [
                ["vacation", "boolean", "是否休假"],
                ["entrustType", "int", "交易类型"],
            ]
        }
        ,
        # 接口2
        {
            "method": "POST",
            "path": "advertise/newAd",
            "desc": "发布广告",
            "hasItem":False,
            "isList":False
            ,
            "params": [
                ["entrustType", "int", "交易类型：0在线购买，1在线出售"],
                ["coinId", "long", "币种ID"],
                ["country", "String", "国家地区"],
                ["currency", "String", "货币"],
                ["payProvider", "long", "收款方式"],
                ["payProviderName", "String", "收款方式名称，当payProvider为其它时，此项必填"],
                ["message", "String", "交易条款"],
                ["premium", "double", "溢价,百分比格式，当非固定价格时，此项必填"],
                ["formula", "String", "计价公式，当非固定价格时，此项必填"],
                ["exchangeId", "int", "交易所ID，当非固定价格时，此项必填"],
                ["price", "double", "价格"],
                ["minAmount", "double", "最小限额"],
                ["maxAmount", "double", "最大限额"],
                ["payMinute", "int", "付款期限，仅在线购买时有此值"],
            ]
        }
    ]
}
service_default = """package  %s;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包
%s

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:%s
 * 接口说明:%s
 */
 public interface %s{
     %s
 }
"""
item_head_default="""
package %s;

import com.nb.libcommon.view.inter.IBaseItem;

/**
 * Created by NieBin on 2018/1/5.
 * GitHub: https://github.com/nb312
 * %s
 */
public class %s implements IBaseItem {\n\n}
"""
param_head_default="""
package %s;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：%s
 */
public class %s {\n
  %s
\n}

"""
view_inter_default="""package %s;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

%s

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: %s
 */

public interface %s extends BaseViewInter {
     %s
}
"""
model_inter_default="""package %s;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;
%s

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: %s
 */

public interface %s extends BaseModelInter {
    
     %s

}
"""
model_default="""package %s;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;
%s

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：%s
 */

public class %s extends BaseModelImpl implements %s {
    %s
}
"""
presenter_inter_default="""package %s.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;
%s

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：%s
 */

public interface %s extends BasePresenterInter {
    %s
}
"""
presenter_default="""package %s.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
%s

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * %s 
 */
public class %s extends BasePresenterImpl<%s> implements %s {
    public %s(%s modelInter) {
        super(modelInter);
    }
    
    %s
    
    %s
    
}
"""
service_suffix= "I%sHttpService"
item_suffix= "%sItem"
param_suffix= "%sParam"
viewinter_suffix= "%sViewInter"

model_inter_suffix= "%sModelInter"
model_suffix= "%sModel"

presenter_suffix= "%sPresenter"
presenter_inter_suffix= "%sPresenterInter"
subscriber_suffix = "%sSubscriber"
success_suffix= "on%sSuccess(%s item)"

BaseFile = "network"
SERVICE_PATH = "Service"
Model_PATH = "Model"
presenter_path = "Presenter"
CONTROLLER_PATH = "Controller"
PKG = "coin.otc.com"
INTER = "inter"

def create_service(package, inter_json):
    iService = service_suffix % (getUpperFirst(inter_json["controller"])) # 生成类名
    package_str = package + "." + SERVICE_PATH.lower()  # 生成包名
    file_body=""
    item_imp=""
    for fuc in inter_json["func"]:
        file_body+= createServiceFunc(fuc) + "\n\n"
        last_path=getLastMethod(fuc["path"])
        if(fuc["hasItem"]):
            item_imp+="\nimport %s.%s;"%(package+".controller."+str(inter_json["controller"]).lower()+".item",
                                    item_suffix%(getUpperFirst(last_path)))

    content= service_default % (package_str,item_imp, inter_json["v1"], inter_json["desc"], iService, file_body)
    iServiceFile = open(getFile(SERVICE_PATH.lower(),getJavaFile(iService)), "w+",encoding='utf-8')
    try:
        iServiceFile.write(content)
        iServiceFile.close()
    except IOError:
        print()



def createServiceFunc(func_json):
    """创建service里面的方法
    func_json 格式如下
    {
            "method": "POST",
            "path": "advertise/updateVacationStatus",
            "params":[
                ["vacation","boolean","是否休假"],
                ["entrustType","int","交易类型"],
            ]
        }

    创建如下
    /**
     * @param vacation    是否休假
     * @param entrustType 交易类型
     * @return 广告更新状态
     */
    @POST("advertise/updateVacationStatus")
    Observable<BaseResponseItem<String>> advUpdateVacationStatus(
            @Query("vacation") boolean vacation,
            @Query("entrustType") int entrustType
    );

    """
    # 1. 写注释
    annotation = getWhiteSpace()+"\n/**\n"
    for param in func_json["params"]:
        annotation +=getWhiteSpace()+ "* @param " + param[0]+" "+param[2]+"\n"
    annotation+="* @return %s\n"%(func_json["desc"])
    annotation+="*/\n"
    # 2. 写注解
    func_note =getWhiteSpace()+"@"+func_json["method"]+"(\""+func_json["path"]+"\")\n"

    # 3. 写方法体
    func_name = getLastMethod(func_json["path"])
    itemClass = "String"
    if func_json["hasItem"] :
        itemClass=item_suffix%(getUpperFirst(func_name))
    if func_json["isList"]:
        itemClass="List<%s>"%(itemClass)
    func_body =getWhiteSpace()+ "Observable<BaseResponseItem<%s>> "%(itemClass)+func_name+"(\n"
    for param in func_json["params"]:
        func_body +="@Query(\""+param[0]+"\") "+ param[1] +" " +param[0]+"\n,"
    func_body= func_body[0:len(func_body)-1]
    func_body+=");\n\n"
    return annotation+func_note+func_body

def createItem(package,func_json,controller_name):
    """创建网返回的item"""
    func =getLastMethod(func_json["path"])
    name=item_suffix%(getUpperFirst(func))
    itemClassContent=item_head_default%(package+"."+CONTROLLER_PATH.lower()+"."+str(controller_name).lower()+".item",func_json["desc"],name)
    itemFile = open(getFile(CONTROLLER_PATH.lower()+"\\"+str(controller_name).lower()+"\\item",name+".java"),"w+",encoding="utf-8")
    itemFile.write(itemClassContent)

def createParam(package,func_json,controller_name):
    """创建方法的输入参数"""
    func =getLastMethod(func_json["path"])  # 获取最后一个方法
    name = param_suffix%(getUpperFirst(func)) #类名
    desc = func_json["desc"] # 描述
    package+="."+CONTROLLER_PATH.lower()+"."+str(controller_name).lower()+".param" # 包名
    body = ""
    for param in func_json["params"]:
        anno ="""
/**
* %s
*/\n"""
        body+=anno%(param[2])
        body+="private "+param[1]+" "+param[0]+";\n\n"
    for param in func_json["params"]:
        method=param[0][0].upper() + param[0][1:]
        type = param[1]
        var_name=param[0]
        body+= getSetMethonString(method,type,var_name)
        body+= getGetMethodStr(type,method,var_name)
    param_content = param_head_default%(package,desc,name,body)

    file_name=getFile(CONTROLLER_PATH.lower()+"\\"+str(controller_name).lower()+"\\param",name+".java")
    param_file=open(file_name,"w+",encoding="utf-8")
    param_file.write(param_content)

def getGetMethodStr(type,method,param):
    """获取get方法对的字符串"""
    if(type == "boolean"):
        return "\npublic %s is%s(){\n return this.%s;\n}\n"%(type,method,param)
    else:
        return "\npublic %s get%s(){\n return this.%s;\n}\n"%(type,method,param)
def getSetMethonString(method,type,param):
    """获取set方法的字符串"""
    return "\npublic void set%s(%s %s){\nthis.%s = %s;\n}\n"%(method,type,param,param,param)
def createItems(package,inter_json):
    """创建 item 和 param"""
    funcs=inter_json["func"] #获取方法列表
    for func in funcs:
        if(func["hasItem"] is True): #
           createItem(package,func,inter_json["controller"])
        if(len(func["params"])>0):
            createParam(package,func,inter_json["controller"])
def createViewInters(package,inter_json):
    for func in inter_json["func"]:
        createViewInter(package,inter_json["controller"],func)

def createViewInter(package,controller,func_json):
    """创建view_inter 一个接口对应一个view_inter"""
    body=""
    imp_item=""
    imp_param=""
    param=""
    lastPath=getLastMethod(func_json["path"])
    if(len(func_json["params"])>0):
        param = param_suffix % (getUpperFirst(lastPath))
        body+="\n%s get%s();\n"%(param,param)
    item="String"
    if(func_json["hasItem"]):
        item= item_suffix % (getUpperFirst(lastPath))

    controller_pak="%s.controller.%s"%(package,str(controller).lower())
    if (param != ""):
        imp_param = "import %s.param.%s;\n"%(controller_pak, param)
    if (item != "" and func_json["hasItem"]):
        imp_item = "import %s.item.%s;\n"%(controller_pak, item)

    if(func_json["isList"]):
        item="List<%s>"%(item)
    success="void %s;\n"%(success_suffix%(getUpperFirst(lastPath), item))
    body+=success




    file_content=view_inter_default%(controller_pak+".view",imp_item+imp_param,func_json["desc"],viewinter_suffix%(getUpperFirst(lastPath)),body)
    view_inter_file=open(getFile("%s\\%s\\view"%(CONTROLLER_PATH.lower(),controller),
                                 getJavaFile(viewinter_suffix%(getUpperFirst(lastPath)))),"w+",encoding="utf-8")
    view_inter_file.write(file_content)
    view_inter_file.close()

def createModelInter(package,inter_json):
    """创建model_inter接口"""
    package_str="%s.model.inter"%(package)
    file_bodys=""
    item_imps=""
    for func_json in inter_json["func"]:
        body,item_imp=createModelInterFunc(package,inter_json["controller"],func_json)
        file_bodys+=body+"\n"
        item_imps+=item_imp+"\n"
    file_name=model_inter_suffix%(getUpperFirst(inter_json["controller"]))
    file_content=model_inter_default%(package_str,
                                      item_imps,
                                      inter_json["desc"],
                                      file_name
                                      ,
                                      file_bodys)
    writeContent("\\model\\inter",file_name,file_content)


def createModelInterFunc(package,controller,func_json):
    """创建model inter的单个方法"""
    func_str="""
/**
%s
*/
Subscription %s(%s BaseSubscriberImpl<BaseResponseItem<%s>> subscriber);
"""
    items_import_str=""
    anno=""
    last_path=getLastMethod(func_json["path"])
    func_name=getUpperFirst(last_path)
    params_str=""
    if(len(func_json["params"])==0):
        anno="*@return %s"%(func_json["desc"])
    else:
        for param in func_json["params"]:
            anno+="*@param %s %s \n"%(param[0],param[2])
            params_str+="%s %s,\n"%(param[1],param[0])
        anno +="*@return %s" % (func_json["desc"])
    item_str="String"
    if(func_json["hasItem"]):
        package+="."+CONTROLLER_PATH.lower()+"."+str(controller).lower()+".item"
        items_import_str+="import %s.%s;\n"%(package,item_suffix%(func_name))
        item_str=item_suffix%(func_name)
    if(func_json["isList"]):
        item_str="List<%s>"%(item_str)
    func_str_result=func_str%(anno,last_path,params_str,item_str)
    return func_str_result,items_import_str

def createModel(package,inter_json):
    """创建model"""
    package_str=""
    import_str=""
    desc_str=""
    class_str=""
    interface_str=""
    body_str=""

    controller_str=inter_json["controller"]
    package_str=package+".model"
    import_str+="\nimport %s.%s;"%(package+".service",service_suffix%(getUpperFirst(controller_str)))
    import_str+="\nimport %s.%s;"%(package+".model.inter",model_inter_suffix%(getUpperFirst(controller_str)))
    for func_json in inter_json["func"]:
        if(func_json["hasItem"]):
            last_path=getLastMethod(func_json["path"])
            import_str+="\nimport %s.%s;"%(package+".controller."+str(controller_str).lower()+".item",
                                          item_suffix%(getUpperFirst(last_path))
                                                       )
        body_str+= createModelFunc(package,func_json,controller_str,inter_json["v1"])+"\n"
    desc_str=inter_json["desc"]
    class_str = model_suffix%(getUpperFirst(controller_str))
    interface_str =model_inter_suffix%(getUpperFirst(controller_str))
    file_content=model_default%(package_str,import_str,desc_str,class_str,interface_str,body_str)

    writeContent(Model_PATH.lower(),
                 model_suffix%(getUpperFirst(controller_str)),
                 file_content)

def createModelFunc(package,func_json,controller,isV1):
    """创建单个方法"""
    func_str = """
    @Override
    public Subscription %s(%s BaseSubscriberImpl<BaseResponseItem<%s>> subscriber) {
        return normalSubscribe(%s(%s.class).%s(%s), subscriber);
    }\n
    """
    fun_name="" # 方法名
    param_input_str=""
    item_str="String"
    http_func_str=""
    service_str=""
    param_str=""

    fun_name=getLastMethod(func_json["path"])
    if(len(func_json["params"]) > 0):
        for param in func_json["params"]:
            param_input_str+="%s %s,"%(param[1],param[0])
            param_str+=param[0]+","
    param_str=param_str[:len(param_str)-1]
    if(func_json["hasItem"]):
        item_str=item_suffix%(getUpperFirst(fun_name))
    if(func_json["isList"]):
        item_str="List<%s>"%(item_str)
    if(isV1):
        http_func_str="getVersionHttpService"
    else:
        http_func_str="getHttpService"
    service_str=service_suffix%(getUpperFirst(controller))
    fun_body=func_str%(fun_name,
                   param_input_str,
                   item_str,
                   http_func_str,
                   service_str,
                   fun_name,
                   param_str
                   )
    return fun_body
def createPresenterInter(package,inter_json):
    """创建presenter 接口"""
    package_str=package
    import_str=""
    desc_str=inter_json["desc"]
    interface_str=presenter_inter_suffix%(getUpperFirst(inter_json["controller"]))
    body_str=""
    body_func="""
    /**
    * %s
    */
    void %s(%s viewInter);\n
    """
    file_name=getUpperFirst(inter_json["controller"])
    for func_json in inter_json["func"]:
        last_path=getLastMethod(func_json["path"])
        import_str+="\nimport %s.%s;"%(package_str+".controller"+"."+str(inter_json["controller"]).lower()+".view",
                                       viewinter_suffix%(getUpperFirst(last_path)))
        body_str+=body_func%(func_json["desc"],last_path,viewinter_suffix%(getUpperFirst(last_path)))
    file_content=presenter_inter_default%(package_str,import_str,desc_str,interface_str,body_str)
    writeContent(presenter_path.lower()+"\\inter",presenter_inter_suffix%(file_name),file_content)
def createPresenter(package,inter_json):
    """"创建presenter"""
    package_str=package
    import_str=createPresenterImport(package,inter_json)
    desc_str=inter_json["desc"]
    contrUpper=getUpperFirst(inter_json["controller"])
    class_str=presenter_suffix%(contrUpper)
    model_inter_str=model_inter_suffix%(contrUpper)
    presenter_inter_str=presenter_inter_suffix%(contrUpper)
    func_str=createPresenterFunc(inter_json)
    sub_str=createPresenterSubscriber(inter_json)
    file_content =presenter_default%(package_str,
                                     import_str,
                                     desc_str,
                                     class_str,
                                     model_inter_str,
                                     presenter_inter_str,
                                     class_str,
                                     model_inter_str,
                                     func_str,
                                     sub_str)
    writeContent("presenter",class_str,file_content)

def createPresenterSubscriber(inter_json):
    """创建subscriber"""

    sub_str="""
    /**
     * 网络回调: %s
     */
    class %s extends OTCResponseSubscriber<%s, %s> {

        public %s(%s mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(%s item) {
            super.onStateSuccess(item);
            mViewInter.%s(item);
        }
    }
    """
    subscriber_all=""
    for func_json in inter_json["func"]:
        desc_str=func_json["desc"]
        last_path=getLastMethod(func_json["path"])
        func_name=getUpperFirst(last_path)
        class_str=subscriber_suffix%(func_name)
        item_str="String"
        if(func_json["hasItem"]):
            item_str=item_suffix%(func_name)
        if(func_json["isList"]):
            item_str="List<%s>"%(item_str)
        view_str=viewinter_suffix%(func_name)
        success_str="on%sSuccess"%(func_name)
        subscriber_all+=sub_str%(desc_str,
                                 class_str,
                                 item_str,
                                 view_str,
                                 class_str,
                                 view_str,
                                 item_str,
                                 success_str
                                 )+"\n"
        test=subscriber_all
    return subscriber_all
def createPresenterFunc(inter_json):
    """创建presenter 的方法"""
    method_str="""
    @Override
    public void %s(%s viewInter) {
        %s
        addSubscription(mModelInter.%s(%s new %s(viewInter, getFucName())));
    }\n
    """
    methods_str=""
    for func_json in inter_json["func"]:
        last_path = getLastMethod(func_json["path"])
        func_name=last_path
        view_str=viewinter_suffix%(getUpperFirst(last_path))
        param_str= param_suffix%(getUpperFirst(last_path))
        params_str=""
        param_get_str=""
        if(len(func_json["params"])!=0):
            for param in func_json["params"]:
                if param[1]=="boolean":
                    params_str += "param.is%s()," % (getUpperFirst(param[0]))
                else:
                    params_str+="param.get%s(),"%(getUpperFirst(param[0]))
            param_get_str="%s param = viewInter.get%s();"%(param_str,param_str)
        sub_str=subscriber_suffix%(getUpperFirst(func_name))

        methods_str+=method_str%(func_name,view_str,param_get_str,func_name,params_str,sub_str)
    return methods_str
def createPresenterImport(package,inter_json):
    """创建presenter import"""
    controller_str=inter_json["controller"]
    model_imp="import %s.%s;\n"%(package+".model.inter",model_inter_suffix%(getUpperFirst(controller_str)))
    presenter_imp="import %s.%s;\n"%(package+".presenter.inter",presenter_inter_suffix%(getUpperFirst(controller_str)))
    view_import=""
    param_import=""
    item_imp=""
    for func in inter_json["func"]:
        last_path = getLastMethod(func["path"])
        controller_base_pack = package+"."+CONTROLLER_PATH.lower()+"."+str(controller_str).lower()
        view_import+="\nimport %s.%s;"%(controller_base_pack+".view",
                                         viewinter_suffix%(getUpperFirst(last_path)))
        if(len(func["params"])>0):
            param_str=param_suffix%(getUpperFirst(last_path))
            param_import+="\nimport %s.%s;"%(controller_base_pack+".param",
                                              param_str)
        if(func["hasItem"]):
            item_imp+="\nimport %s.%s;"%(controller_base_pack+".item",item_suffix%(getUpperFirst(last_path)))
    import_str=model_imp+presenter_imp+view_import+param_import+item_imp
    return import_str
def getFile(path,file):
    return os.getcwd()+"\\"+BaseFile+"\\"+path+"\\"+file
def getWhiteSpace():
    return ""

def getUpperFirst(_str):
    """将传入的单词 首字母大写"""
    return str(_str)[0].upper()+str(_str)[1:]

def getJavaFile(file_name):
    """获取java文件夹"""
    return file_name+".java"

def getLastMethod(_path):
    """获取路径中的最后一个参数"""
    p_s=str(_path).split("/")
    l =len(p_s)
    if l >=2:
        if len(p_s[l-1]) <5:
          _path=p_s[l-2]+getUpperFirst(p_s[l-1])
        else:
            _path = p_s[l-1]

    _ps=str(_path).split("-")
    _p =""
    if(len(_ps)>1):
        _p+=_ps[0]
        for p in _ps[1:]:
            _p+=getUpperFirst(p)
    else:_p=_path
    return _p

def createFileFolder():
    """创建需要的文件夹"""
    service=os.getcwd()+"\\"+BaseFile+"\\"+SERVICE_PATH.lower()
    presenter=os.getcwd()+"\\"+BaseFile+"\\"+presenter_path.lower()
    presenter_inter=os.getcwd()+"\\"+BaseFile+"\\"+presenter_path.lower()+"\\"+INTER
    model=os.getcwd()+"\\"+BaseFile+"\\"+Model_PATH.lower()
    model_inter=os.getcwd()+"\\"+BaseFile+"\\"+Model_PATH.lower()+"\\"+INTER
    controller=os.getcwd()+"\\"+BaseFile+"\\"+CONTROLLER_PATH.lower()
    if(os.path.exists(service) is False):
        os.makedirs(service)
    if(os.path.exists(presenter) is False):
        os.makedirs(presenter)
    if(os.path.exists(model) is False):
        os.makedirs(model)
    if(os.path.exists(controller) is False):
        os.makedirs(controller)
    if(os.path.exists(model_inter) is False):
        os.makedirs(model_inter)
    if(os.path.exists(presenter_inter) is False):
        os.makedirs(presenter_inter)
def createController(inter_json):
    """为controller文件创建相应的文件 """
    controller_name=inter_json["controller"]
    ctr= os.getcwd()+"\\"+BaseFile+"\\"+CONTROLLER_PATH.lower()+"\\"+str(controller_name).lower()
    view =ctr+"\\view"
    param=ctr+"\\param"
    item=ctr+"\\item"
    if (os.path.exists(ctr) is False):
        os.makedirs(ctr)
    if (os.path.exists(view) is False):
        os.makedirs(view)
    if (os.path.exists(param) is False):
        os.makedirs(param)
    if (os.path.exists(item) is False):
        os.makedirs(item)

def writeContent(folder,file_name,content):
    """向指定文件写入string"""
    with open(getFile(folder,getJavaFile(file_name)),"w+",encoding="utf-8") as file:
        file.write(content)



def getFilePaths(file_dir):
    paths=[]
    for root, dirs, files in os.walk(file_dir):
        print(root) #当前目录路径
        print(dirs) #当前路径下所有子目录
        print(files) #当前路径下所有非目录子文件
        for file in files:
            paths.append(file_dir+"\\"+file)
    return paths



def wirteSingleFile(file_name):
    with open(file_name, "r", encoding="utf-8") as file:
        content = file.read()
        inter_json = eval(content)
        createController(inter_json)
        base_package = PKG + "." + BaseFile.lower()
        create_service(base_package, inter_json)  # 创建service
        createItems(base_package, inter_json)  # 创建item 和param
        createViewInters(base_package, inter_json)  # 创建 view inter
        createModelInter(base_package, inter_json)  # 创建model inter
        createModel(base_package, inter_json)
        createPresenterInter(base_package, inter_json)
        createPresenter(base_package, inter_json)

def writeAllFile():
    """"读取配置文件并生成接口文件"""
    createFileFolder()
    file_paths= getFilePaths(os.getcwd() + "\\inter_jsons")
    # file_paths= getFilePaths(os.getcwd() + "\\test_json")
    for file  in file_paths:
        wirteSingleFile(file)

writeAllFile()





