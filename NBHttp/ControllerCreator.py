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
import com.nb.nbhttp.inter.BaseController
import com.nb.nbhttp.inter.BaseServiceCreator
import io.reactivex.disposables.Disposable
"""

_IMP_CONTROLLER_ = """
import %s.controller.inter.I%sController
import %s.service.I%sService
"""

_IMP_CONFIG_ = "import %s.group.%s.I%sConfig\n"

_IMP_CALLBACK_ = "import %s.group.%s.callback.%sConfigCallBack\n"

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
class %sController : BaseController(), I%sController {
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
        var disposable = serviceCreator.onSubscribe(service.%s(%s), %sConfigCallBack(this,i%sConfig))
        addDisposable(disposable)
        return disposable
    }
    \n
"""
_CONTROLLER_FILE_ = CONTROLLER_PATH + "/I%sController.kt"


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
        contr_file = _CONTROLLER_FILE_ % getWithFirstUpper(group)
        for func in inter_json["func"]:
            func_name = getFuncName(func["path"])
            desc = func["desc"]

            param_str = ""
            if len(func["params"]) > 0:
                param_str += "\ni%sConfig.%sParam?.%s" % (func_name, getWithFirstLower(func_name), func["params"][0][0])
            for param in func["params"][1:]:
                param_str += ",\ni%sConfig.%sParam?.%s" % (func_name, getWithFirstLower(func_name), param[0])
            imp_config += _IMP_CONFIG_ % (BASE_PACKAGE_NAME, group.lower(), func_name)
            imp_callback += _IMP_CALLBACK_ % (BASE_PACKAGE_NAME, group.lower(), func_name)
            funcs_str += _FUNC_STR_ % (desc,
                                       getWithFirstLower(func_name), func_name, func_name,
                                       func_name, getWithFirstLower(func_name),
                                       func_name, getWithFirstLower(func_name),
                                       getWithFirstUpper(group),
                                       getWithFirstLower(func_name), param_str, func_name, func_name)
        class_str = _CLASS_STR_ % (getWithFirstUpper(group), getWithFirstUpper(group), funcs_str)

        file_content = _PACKAGE_ + _IMP_BASE_ + imp_contr + imp_config + imp_callback + FILE_HEADER_ % desc + class_str

        return contr_file, file_content


def createControllerFile(file_name):
    contr_file, contr_content = __buildControllerStr(file_name)
    if os.path.exists(CONTROLLER_PATH) is False:
        os.mkdir(CONTROLLER_PATH)
    with open(contr_file, "w+", encoding="utf-8") as file:
        file.write(contr_content)
