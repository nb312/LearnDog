#!user/bin/python37

ROOT_PATH = "./nbhttp/"  # this is root path for  create your own files.
BASE_PATH = ROOT_PATH + "base"
SERVICE_PATH = ROOT_PATH + "service"
CONTROLLER_PATH = ROOT_PATH + "controller"
GROUP_PATH = ROOT_PATH + "group"

CALLBACK_PATH = CONTROLLER_PATH + "callback"
CONTROLLER_INTER = CONTROLLER_PATH + "inter"

INTER_FOLDER_NAME = "inter"
BASE_PACKAGE_NAME = "com.nb.base"

FILE_HEADER_ = """
/**
 * Created by NieBin on 2018-07-10
 * Github: https://github.com/nb312
 * Email: niebin312@gmail.com
 * %s 
 */
 \n
"""


def getFuncName(path=""):
    ps = path.split("/")
    func_name = ""
    l_p = len(ps)
    if l_p > 1:
        for p in ps[l_p - 2:l_p]:
            temp = ""
            if "-" in p:
                for letter in p.split("-"):
                    temp += letter[0].upper() + letter[1:]
            else:
                temp = p
            func_name += temp[0].upper() + temp[1:]
    else:
        func_name = ps
    return func_name[0].upper() + func_name[1:]
