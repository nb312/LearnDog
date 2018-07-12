#!usr/bin/python37

from NBHttp.FileConstant import *
import os

_PACKAGE_CALL_ = "package %s.group.%s.callback\n\n" % (BASE_PACKAGE_NAME, "%s")

_IMPORT_CALL_BASE_ = "import com.nb.nbhttp.param.NBaseResponse\n"
_IMPORT_CALL_BACK_ = "import %s.base.BaseHttpCallback\n" % BASE_PACKAGE_NAME
_IMPORT_CONFIG_ = "import %s.group.%s.I%sConfig\n" % (BASE_PACKAGE_NAME, "%s", "%s")
_IMPORT_BODY_ = "import %s.group.%s.body.%sBody\n" % (BASE_PACKAGE_NAME, "%s", "%s")

_CALL_HEADER_ = FILE_HEADER_ % "this was created by script."
_CLASS_STR_ = """
class %sConfigCallBack(var i%sConfig: I%sConfig) : BaseHttpCallback<%s>(i%sConfig.%sParam) {
    override fun onSuccessState(nBaseResponse: NBaseResponse<%s>) {
        i%sConfig.on%sSuccess(nBaseResponse.body)
    }
}

"""
_CALLBACK_FILE_ = GROUP_PATH + "/%s/callback/%sCallback.kt"
_CALL_BACK_PATH = GROUP_PATH + "/%s/callback"


def buildCallbackStr(file_name):
    """
    :param file_name: this is a config file with user.
    :return: group path, callback path, callback files,callback contents.
    """
    with open(file_name, "r", encoding="utf-8") as file:
        content = file.read()
        inter_json = eval(content)
        group = str(inter_json["group"]).lower()
        callback_files = []
        callback_contents = []
        for func in inter_json["func"]:
            func_name = getFuncName(func["path"])
            desc = func["desc"]
            isList = bool(func["isList"])
            package = _PACKAGE_CALL_ % group
            imp_config = _IMPORT_CONFIG_ % (group, func_name)
            body_str = "String"
            imp_body = ""
            if func["hasJsonBody"]:
                imp_body = _IMPORT_BODY_ % (group, func_name)
                body_str = "%sBody" % func_name
            if isList:
                body_str = "MutableList<%s>" % body_str
            class_str = _CLASS_STR_ % (
                func_name, getWithFirstLower(func_name), func_name, body_str, func_name,
                getWithFirstLower(func_name),
                body_str,
                func_name, func_name)
            callback_content = package + \
                               _IMPORT_CALL_BASE_ + _IMPORT_CALL_BACK_ + imp_config + imp_body + \
                               FILE_HEADER_ % desc + \
                               class_str
            callback_contents.append(callback_content)
            callback_file = _CALLBACK_FILE_ % (group, func_name)
            callback_files.append(callback_file)
        return GROUP_PATH + "/" + group, _CALL_BACK_PATH % (group), callback_files, callback_contents


def createCallbackFile(file_name):
    group_path, callback_path, callback_files, callback_contents = buildCallbackStr(file_name)
    assert len(callback_files) == len(callback_contents)
    if os.path.exists(group_path) is False:
        os.mkdir(group_path)
    if os.path.exists(callback_path) is False:
        os.mkdir(callback_path)
    for index, cb_file in enumerate(callback_files):
        with open(cb_file, "w+", encoding="utf-8") as file:
            file.write(callback_contents[index])


createCallbackFile("./json_config/Advertise.py")
