#!usr/bin/python3


from NBHttp.FileConstant import *
import os

_PACKAGE_FILE_ = "package %s.group.%s.body" % (BASE_PACKAGE_NAME, "%s")

_BODY_HEADER_ = FILE_HEADER_ % "This body need you to generate from json"

_CLASS_STR_ = """
class %s {
    
}
"""  # %s: is the class name.

_PATH_FILE_ = "%s/%s/body"  # 1: GROUP_PATH 2: some group name.


def __buildBodyStr(file_name):
    """
    :param fileName: this is the file name of http config json that write by users.
    :return:  group path, body path , all paths of body files,all contents of body files.
    """
    with open(file_name, "r", encoding="utf-8") as file:
        content = file.read()
        inter_json = eval(content)
        all_body_strs = []
        all_body_files = []
        group = str(inter_json["group"]).lower()
        body_path = _PATH_FILE_ % (GROUP_PATH, group)
        for func in inter_json["func"]:
            has_body = func["hasJsonBody"]
            if has_body:
                desc = func["desc"]
                ph = func["path"]
                body_name = getFuncName(ph) + "Body"
                body_str = _PACKAGE_FILE_ % group + FILE_HEADER_ % desc + _CLASS_STR_ % body_name
                all_body_strs.append(body_str)
                all_body_files.append(body_path + "/%s.kt" % body_name)
        return GROUP_PATH + "/" + group, body_path, all_body_files, all_body_strs


def createBodyFile(file_name):
    group_path, body_path, body_files, body_contents = __buildBodyStr(file_name)
    if os.path.exists(group_path) is False:
        os.mkdir(group_path)
    if os.path.exists(body_path) is False:
        os.mkdir(body_path)
    assert len(body_files) == len(body_contents)
    for i, body_name in enumerate(body_files):
        if os.path.exists(body_name) is False:
            with open(body_name, "w+", encoding="utf-8") as file:
                file.write(body_contents[i])
