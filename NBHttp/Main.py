#!python/bin

import os

from NBHttp.FileConstant import *
from NBHttp.BaseFileCreator import *
from NBHttp.BodyCreator import *
from NBHttp.CallbackCreator import *
from NBHttp.ConfigCreator import *
from NBHttp.ControllerCreator import *
from NBHttp.InterfaceControllerCreator import *
from NBHttp.ParamCreator import *
from NBHttp.ServiceCreator import *

json_path = "./json_config"


def getFilePaths(file_dir):
    """
    :param file_dir:
    :return: the files with path .
    """
    paths = []
    for root, dirs, files in os.walk(file_dir):
        print(root)  # 当前目录路径
        print(dirs)  # 当前路径下所有子目录
        print(files)  # 当前路径下所有非目录子文件
        for file in files:
            paths.append(file_dir + "/" + file)
    return paths


def createDefaultFolder():
    if os.path.exists(ROOT_PATH) is False:
        os.mkdir(ROOT_PATH)
    if os.path.exists(BASE_PATH) is False:
        os.mkdir(BASE_PATH)
    if os.path.exists(CONTROLLER_PATH) is False:
        os.mkdir(CONTROLLER_PATH)
    if os.path.exists(GROUP_PATH) is False:
        os.mkdir(GROUP_PATH)
    if os.path.exists(SERVICE_PATH) is False:
        os.mkdir(SERVICE_PATH)
    if os.path.exists(CONTROLLER_INTER) is False:
        os.mkdir(CONTROLLER_INTER)


def createWithOneJson(file_name):
    createDefaultFolder()
    createBaseFile()
    create_service_file(file_name)

    createControllerInterfaceFile(file_name)
    createControllerFile(file_name)

    createBodyFile(file_name)
    createParamFile(file_name)
    createCallbackFile(file_name)
    creatConfigFile(file_name)


def createWithJson(file_dir):
    files = getFilePaths(file_dir)
    for file in files:
        createWithOneJson(file)


createWithJson(json_path)
