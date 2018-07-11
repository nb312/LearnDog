# usr/bin/python3
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


def buildServiceContent(fileName):
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
            func_name = getFuncName(path)
            params_in_func = ""
            body_str = "%sBody" % func_name
            if func["hasItem"]:
                import_str += "import %s.controller.%s.%s\n" % (BASE_PACKAGE_NAME, group.lower(), body_str)
                params = list(func["params"])
                params_in_func += "@Query(\"%s\") %s:%s" % (params[0][0], params[0][0], params[0][1])
                for param in params[1:]:
                    params_commit += "*@param %s %s \n     " % (param[0], param[2])
                params_in_func += ",     \n@Query(\"%s\") %s:%s" % (param[0], param[0], param[1])
            else:
                body_str = "String"

            funcs_str += _FUNC_STR_ % (params_commit, method, path, func_name, params_in_func, body_str)
        _SERVICE_FIlE = _PACKAGE_ + _IMPORT_ % import_str + FILE_HEADER_ % desc_group + _SERVICE_CLASS_ % (
            group, funcs_str)
        return _SERVICE_FIlE


print(buildServiceContent("./json_config/Advertise.py"))
