# usr/bin/python37
from NBHttp.FileConstant import *
import os

_PACKAGE_IN_CONTROLLER_ = "package %s.controller.inter\n" % BASE_PACKAGE_NAME

_IMPORT_CONTRS = """
import io.reactivex.disposables.Disposable
%s
"""
_INTERFACE_STR_ = """
interface I%sController {
    %s
}
"""
_FUNC_STR = """
 /**
 * %s
 */
  fun %s(i%sConfig:I%sConfig):Disposable\n
"""

_CONTROLLER_FILE_PATH_ = CONTROLLER_PATH + "/inter"


def buildControllerStr(file_name):
    with open(file_name, "r", encoding="utf-8") as file:
        content = file.read()
        inter_json = eval(content)
        group = str(inter_json["group"]).lower()
        imp_str = ""
        funcs_str = ""
        for func in inter_json["func"]:
            desc = func["desc"]
            func_name = getFuncName(func["path"])
            imp_str += "import %s.group.%s.I%sConfig\n" % (BASE_PACKAGE_NAME, group, func_name)
            funcs_str += _FUNC_STR % (desc, getWithFirstLower(func_name), func_name, func_name)
        interface_str = _INTERFACE_STR_ % (getWithFirstUpper(group), funcs_str)
        controll_file_content = _PACKAGE_IN_CONTROLLER_ + _IMPORT_CONTRS % imp_str + interface_str
        return _CONTROLLER_FILE_PATH_, _CONTROLLER_FILE_PATH_ + "/I%sController.kt" % getWithFirstUpper(
            group), controll_file_content


def createControllerFile(file_name):
    controller_path, controller_file, file_content = buildControllerStr(file_name)
    if os.path.exists(controller_path) is False:
        os.mkdir(controller_path)
    with open(controller_file, "w+", encoding="utf-8") as file:
        file.write(file_content)


createControllerFile("./json_config/Advertise.py")
