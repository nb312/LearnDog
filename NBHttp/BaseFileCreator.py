#!usr/bin/python
from NBHttp.FileConstant import *
import os

_BASE_CALLBACK = """
package %s.base

import com.nb.nbhttp.inter.NBaseCallback

/**
 * Created by NieBin on 2018-07-10
 * Github: https://github.com/nb312
 * Email: niebin312@gmail.com
 * this need the user to config if the user want to some thing to handle together.
 */

open class BaseHttpCallback<BodyItem>(param: BaseHttpParam) : NBaseCallback<BodyItem>(param) {
        
}
""" % BASE_PACKAGE_NAME

_BASE_HTTP_PARAM_ = """
package %s.base

import com.nb.nbhttp.param.NBaseParam

/**
 * Created by NieBin on 2018-07-10
 * Github: https://github.com/nb312
 * Email: niebin312@gmail.com
 * this need the user to config if the user want to some thing to handle together.
 */
open class BaseHttpParam : NBaseParam() {
    init {
        hostUrl = "" //this must be inited by user 
        timeStamp = System.currentTimeMillis()
        errorFunc = {
            println("all error handle altogether")
        }
    }
}
""" % BASE_PACKAGE_NAME
_BASE_CALLBACK_FILE_ = BASE_PATH + "/BaseHttpCallback.kt"
_BASE_PARAM_FILE_ = BASE_PATH + "/BaseHttpParam.kt"


def createBaseFile():
    if os.path.exists(BASE_PATH) is False:
        os.mkdir(BASE_PATH)
    if os.path.exists(_BASE_CALLBACK_FILE_) is False:
        with open(_BASE_CALLBACK_FILE_, "w+", encoding="utf-8") as file:
            file.write(_BASE_CALLBACK)
    if os.path.exists(_BASE_PARAM_FILE_) is False:
        with open(_BASE_PARAM_FILE_, "w+", encoding="utf-8") as file:
            file.write(_BASE_HTTP_PARAM_)
