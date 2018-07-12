#!usr/bin/python3
from NBHttp.FileConstant import *
import os

_PACKAGE_NAME_ = "package %s.group.%s\n" % (BASE_PACKAGE_NAME, "%s\n")

_IMPORT_PARAM_ = "import %s.group.%s.param.%sParam\n" % (BASE_PACKAGE_NAME, "%s", "%s")
_IMPORT_BODY_ = "import %s.group.%s.body.%sBody\n" % (BASE_PACKAGE_NAME, "%s", "%s")

_CONFIG_HEADER_ = FILE_HEADER_ % "this was created by user."
_CLASS_STR_ = """
interface I%sConfig {
    var %sParam: %sParam
    fun on%sSuccess(body: %s?)
}
"""
_CONFIG_FILE_ = GROUP_PATH + "/%s/I%sConfig.kt"


def buildConfigStr(file_name):
    """
    :param file_name: this file is created by user.
    :return: group path , config files ,config contents that pair to files
    """
    with open(file_name, "r", encoding="utf-8") as file:
        content = file.read()
        inter_json = eval(content)
        group = str(inter_json["group"]).lower()
        config_files = []
        config_contents = []
        for func in inter_json["func"]:
            path = func["path"]
            desc = func["desc"]
            is_list = func["isList"]
            func_name = getFuncName(path)
            param_import = _IMPORT_PARAM_ % (group, func_name)
            body_import = ""
            body_str = "String"
            if func["hasJsonBody"]:
                body_str = "%sBody" % func_name
                body_import = _IMPORT_BODY_ % (group.lower(), func_name)
            if is_list:
                body_str = "MutableList<%s>" % body_str
            class_str = _CLASS_STR_ % (func_name,
                                       func_name[0].lower() + func_name[1:], func_name,
                                       func_name, body_str
                                       )
            config_content = _PACKAGE_NAME_ % group + \
                             param_import + body_import + \
                             FILE_HEADER_ % desc + \
                             class_str
            config_contents.append(config_content)
            config_file = _CONFIG_FILE_ % (group, func_name)
            config_files.append(config_file)
        return GROUP_PATH + "/%s" % group.lower(), config_files, config_contents


def creatConfigFile(file_name):
    group_path, config_files, config_contents = buildConfigStr(file_name)
    assert len(config_files) == len(config_contents)
    if os.path.exists(group_path) is False:
        os.mkdir(group_path)
    for index, config_file in enumerate(config_files):
        with open(config_file, "w+", encoding="utf-8") as file:
            file.write(config_contents[index])


creatConfigFile("./json_config/Advertise.py")
