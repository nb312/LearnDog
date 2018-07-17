# usr/bin/python

from NBHttp.FileConstant import *
import os

_PACKAGE_ = "package %s.controller\n" % BASE_PACKAGE_NAME

"""

import com.nb.nbhttp.inter.BaseController
import com.nb.nbhttp.inter.BaseServiceCreator
import io.reactivex.disposables.Disposable
import nbhttp.controller.inter.ITestController
import nbhttp.group.test.callback.TestConfigCallBack
import nbhttp.group.test.ITestConfig
import nbhttp.service.ITestService
"""

_IMP_BASE_ = """
import com.nb.nbhttp.file.NBaseFileController
import com.nb.nbhttp.inter.BaseServiceCreator
import com.nb.nbhttp.inter.NBParamBuilder
import io.reactivex.disposables.Disposable
"""

_IMP_CONTROLLER_ = """
import %s.controller.inter.I%sController
import %s.service.I%sService
"""

_IMP_CONFIG_ = "import %s.group.%s.I%sConfig\n"

_IMP_CALLBACK_ = "import %s.group.%s.callback.%sConfigCallBack\n"

_IMP_PARAM = "import %s.group.%s.param.%sParam\n"
"""
class TestController : BaseController(), ITestController {

    override fun test(iTestConfig: ITestConfig): Disposable {
        if (iTestConfig.testParam.isCanceled) {
            return null
        }
        var serviceCreator = BaseServiceCreator(iTestConfig.testParam)
        var service = serviceCreator.createService(ITestService::class.java)
        var disposable = serviceCreator.onSubscribe(service.test(iTestConfig.testParam.time), TestConfigCallBack(iTestConfig))
        addDisposable(disposable)

        return disposable
    }
}

"""

_CLASS_STR_ = """
class %sController : NBaseFileController(), I%sController {
     %s
}
"""

_FUNC_STR_ = """
 /**
  *%s
  */
 override fun %s(i%sConfig: I%sConfig): Disposable? {
        if (i%sConfig.%sParam._isCanceled_) {
            return null
        }
        var serviceCreator = BaseServiceCreator(i%sConfig.%sParam)
        var service = serviceCreator.createService(I%sService::class.java)
        %s
        var disposable = serviceCreator.onSubscribe(service.%s(bodyMap, parts), %sConfigCallBack(this,i%sConfig))
        addDisposable(disposable)
        return disposable
    }
    \n
"""
_CONTROLLER_FILE_ = CONTROLLER_PATH + "/I%sController.kt"

_PARAM_STR = """
        var param = i%sConfig.%sParam

        var bodyMap = NBParamBuilder()
                 %s
                .build()
        %s
"""
_ADD_PARAM_STR = "\n.addTextParam(%sParam.%s,param.%s)"
_PART_STR_ = """
 var parts = files2Parts(param.%s
                , i%sConfig.%sParam?._progressListener_)
"""


def __buildControllerStr(file_name):
    """
    :param file_name:
    :return: controller file name with path, controller file content.
    """
    with open(file_name, "r", encoding="utf-8") as file:
        content = file.read()
        inter_json = eval(content)
        group = str(inter_json["group"])
        desc = inter_json["desc"]
        imp_contr = _IMP_CONTROLLER_ % (BASE_PACKAGE_NAME, getWithFirstUpper(group),
                                        BASE_PACKAGE_NAME, getWithFirstUpper(group))
        imp_config = ""
        imp_callback = ""
        funcs_str = ""
        imp_param = ""
        contr_file = _CONTROLLER_FILE_ % getWithFirstUpper(group)
        for func in inter_json["func"]:
            func_name = getFuncName(func["path"])
            desc = func["desc"]

            param_str = ""
            # if len(func["params"]) > 0:
            # param_str += _ADD_PARAM_STR % (getWithFirstUpper(func_name), func["params"][0][0], func["params"][0][0])
            # param_str += "\ni%sConfig.%sParam.%s" % (func_name, getWithFirstLower(func_name), func["params"][0][0])
            part_str = ""
            add_param = ""
            for param in func["params"]:
                # param_str += ",\ni%sConfig.%sParam.%s" % (func_name, getWithFirstLower(func_name), param[0])
                if param[2] != "isFile":
                    add_param += _ADD_PARAM_STR % (getWithFirstUpper(func_name), str(param[0]).upper(), param[0])
                else:
                    part_str += _PART_STR_ % (param[0], getWithFirstUpper(func_name),
                                              getWithFirstLower(func_name))

            param_str = _PARAM_STR % (getWithFirstUpper(func_name), getWithFirstLower(func_name),
                                      add_param, part_str)
            imp_config += _IMP_CONFIG_ % (BASE_PACKAGE_NAME, group.lower(), func_name)
            imp_callback += _IMP_CALLBACK_ % (BASE_PACKAGE_NAME, group.lower(), func_name)
            imp_param += _IMP_PARAM % (BASE_PACKAGE_NAME, group.lower(), func_name)
            funcs_str += _FUNC_STR_ % (desc,
                                       getWithFirstLower(func_name), func_name, func_name,
                                       func_name, getWithFirstLower(func_name),
                                       func_name, getWithFirstLower(func_name),
                                       getWithFirstUpper(group),
                                       param_str,
                                       getWithFirstLower(func_name), func_name, func_name)
        class_str = _CLASS_STR_ % (getWithFirstUpper(group), getWithFirstUpper(group), funcs_str)

        file_content = _PACKAGE_ + _IMP_BASE_ + imp_contr + imp_config + imp_param + imp_callback + FILE_HEADER_ % desc + class_str

        return contr_file, file_content


def createControllerFilePostFile(file_name):
    contr_file, contr_content = __buildControllerStr(file_name)
    if os.path.exists(CONTROLLER_PATH) is False:
        os.mkdir(CONTROLLER_PATH)
    with open(contr_file, "w+", encoding="utf-8") as file:
        file.write(contr_content)

# createControllerFilePostFile("./51SZZC/FileUpload.py")
