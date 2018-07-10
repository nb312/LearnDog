#!user/bin/python37

import os

ROOT_PATH = "./nbhttp/"  # this is root path for  create your own files.
BASE_PATH = ROOT_PATH + "base/"
SERVICE_PATH = ROOT_PATH + "service/"
CONTROLLER_PATH = ROOT_PATH + "controller/"
GROUP_PATH = ROOT_PATH + "group/"

CALLBACK_PATH = CONTROLLER_PATH + "callback/"
CONTROLLER_INTER = CONTROLLER_PATH + "inter/"

INTER_FOLDER_NAME = "inter"
BASE_PACKAGE_NAME = "com.nb.base"


def getFuncName(path=""):
    ps = path.split("/")
    func_name = ""
    l_p = len(ps)
    if l_p > 1:
        for p in ps[l_p - 2:l_p]:
            func_name += p[0].upper() + p[1:]
    else:
        func_name = ps
    return func_name
