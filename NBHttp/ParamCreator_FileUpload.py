#!usr/bin/python3

from NBHttp.FileConstant import *
import os

_PACKAGE_FILE_ = "package %s.group.%s.param\n" % (BASE_PACKAGE_NAME, "%s")

_IMPORT_FILE_ = "import %s.base.BaseHttpParam\n" % BASE_PACKAGE_NAME

_FILE_HEADER_ = FILE_HEADER_ % "this is created by python script. "

_CLASS_STR_ = """%s class %sParam(%s) : BaseHttpParam(){
    companion object {
        %s
    }

}
"""
_CONST_STR_ = "const val %s = \"%s\" \n"

_PARAM_COMMIT_STR = """
/**
 %s
 */

"""

_PARAM_PATH_ = GROUP_PATH + "/%s/param"
_PARAM_FILE_ = GROUP_PATH + "/%s/param/%sParam.kt"


def __buildParamStr(file_name):
    """
    :param file_name: this file is configged by user
    :return: group path, param path , param files ,param contents that pair of files.
    """
    with open(file_name, "r", encoding="utf-8") as file:
        content = file.read()
        inter_json = eval(content)
        group = str(inter_json["group"])
        file_contents = []
        param_files = []
        for func in inter_json["func"]:
            path = func["path"]
            desc = func["desc"]
            param_name = getFuncName(path)
            params = func["params"]
            p_len = len(params)
            params_str = ""
            param_commit_str = desc
            data_str = ""
            const_str = ""
            if p_len > 0:
                data_str = "data"
                params_str += "var %s:%s? %s" % (params[0][0], params[0][1], __createDefaultValue___(params[0][1]))
                const_str += _CONST_STR_ % (str(params[0][0]).upper(), params[0][0])
                param_commit_str += "\n*@param %s %s" % (params[0][0], params[0][2])
                for p in params[1:]:
                    const_str += _CONST_STR_ % (str(p[0]).upper(), p[0])
                    params_str += ",\n    var %s:%s? %s" % (p[0], p[1], __createDefaultValue___(p[1]))
                    param_commit_str += "\n *@param %s %s" % (p[0], p[2])
            commit_str = _PARAM_COMMIT_STR % param_commit_str

            file_content = _PACKAGE_FILE_ % group.lower() + \
                           _IMPORT_FILE_ + \
                           FILE_HEADER_ % desc + \
                           commit_str + \
                           _CLASS_STR_ % (data_str, param_name, params_str,
                                          const_str
                                          )
            param_file = _PARAM_FILE_ % (group.lower(), param_name)
            file_contents.append(file_content)
            param_files.append(param_file)
        return GROUP_PATH + "/" + group.lower(), _PARAM_PATH_ % group.lower(), param_files, file_contents


def __createDefaultValue___(type=""):
    re_str = ""
    if type == "Long":
        re_str = "= null"
    elif type == "String":
        re_str = "= null"
    elif type == "Int":
        re_str = "= null"
    elif type == "Boolen":
        re_str = "= null"
    elif type == "Double":
        re_str = "= null"
    else:
        re_str = "= null"
    return re_str


def createParamFilePostFile(file_name):
    group_path, param_path, param_files, param_contents = __buildParamStr(file_name)
    if os.path.exists(group_path) is False:
        os.mkdir(group_path)
    if os.path.exists(param_path) is False:
        os.mkdir(param_path)
    for index, param_file in enumerate(param_files):
        with open(param_file, "w+", encoding="utf-8") as file:
            file.write(param_contents[index])


# createParamFilePostFile("./51SZZC/FileUpload.py")
