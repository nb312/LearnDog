# usr/bin/python3

import os
from NBHttp.FileConstant import *

_PACKAGE_ = "package %s.nbhttp.service \n" % BASE_PACKAGE_NAME

_IMPORT_ = """
import com.nb.nbhttp.param.NBaseResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.POST
%s
\n
"""

_SERVICE_CLASS_ = """\n
interface I%sService {\n
   %s \n
}
\n
"""

_FUNC_STR_ = """\n
    /**
     %s
     * */
    @%s("/%s")
    fun %s(%s): Observable<NBaseResponse<%s>>
    \n
"""

_SERVICE_FILE_NAME_ = SERVICE_PATH + "/I%sService.kt"


def buildServiceContent(fileName):
    """
    :param fileName: json config file of service
    :return: service file name with the entire path, the  content of the service.
    """
    with open(fileName, "r", encoding="utf-8") as file:
        content = file.read()
        inter_json = eval(content)
        group = str(inter_json["group"])
        group = group[0].upper() + group[1:]
        desc_group = inter_json["desc"]
        print(inter_json["group"])
        funcs_str = ""
        import_str = ""
        for func in inter_json["func"]:
            desc = "*%s\n     " % func["desc"]
            params_commit = desc
            method = func["method"]
            path = func["path"]
            is_list = func["isList"]
            func_name = getFuncName(path)
            params_in_func = ""

            body_str = "String"
            params = list(func["params"])
            param_len = len(params)
            if param_len > 0:
                params_in_func += "@Query(\"%s\") %s:%s" % (params[0][0], params[0][0], params[0][1])
                for param in params[1:]:
                    params_commit += "*@param %s %s \n     " % (param[0], param[2])
                params_in_func += ",     \n@Query(\"%s\") %s:%s" % (param[0], param[0], param[1])
            if func["hasJsonBody"]:
                body_str = "%sBody" % func_name
                import_str += "import %s.group.%s.body.%s\n" % (BASE_PACKAGE_NAME, group.lower(), body_str)
            if is_list is True:
                body_str = "MutableList<%s>" % body_str
            funcs_str += _FUNC_STR_ % (params_commit, method, path, func_name, params_in_func, body_str)
        _SERVICE_FIlE = _PACKAGE_ + _IMPORT_ % import_str + FILE_HEADER_ % desc_group + _SERVICE_CLASS_ % (
            group, funcs_str)
        return _SERVICE_FILE_NAME_ % group, _SERVICE_FIlE


def create_service_file(file_name):
    """
    :param file_name: service file name
    :return: none
    """
    service_name, content = buildServiceContent(file_name)
    if os.path.exists(SERVICE_PATH) is False:
        os.mkdir(SERVICE_PATH)
    with open(service_name, "w+", encoding="utf-8") as file:
        file.write(content)
