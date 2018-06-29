{
    "controller": "auth",
    "v1": False,
    "desc": "认证相关接口",
    "func": [
        #接口1
        {
            "method": "GET",
            "path": "auth/forget-commit",
            "desc":"3.找回密码提交",
             "hasItem":False,
             "isList":False,
            "params": [
                ["idenKey", "String", "key"],
                ["password", "String", "密码"],
                ["type", "int", "操作类型：1找回登录密码，2找回资金密码"]
            ]
        }
        ,
        #接口2
        {
            "method": "POST",
            "path": "auth/forget-request",
            "desc":"1.忘记密码请求接口",
             "hasItem":False,
             "isList":False,
            "params": [
                ["email", "String", "注册邮箱地址"],
                ["type", "int", "操作类型：1找回登录密码，2找回资金密码"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "auth/login",
            "desc": "登录接口",
            "hasItem":True,
            "isList":False,
            "params": [
                ["niceName", "String", "用户名,注册时必填,登录时该字段没有用,传空字符串即可"],
                ["username", "String", "邮箱"],
                ["password", "String", "密码"],
                ["deviceId", "String", "设备唯一表示，一般取推送平台token"],
                ["deviceType", "int", "设备类型：{0:iphone,1:android,2:ios-p,3:pc}"],
                ["deviceInfo", "String", "设备信息"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "auth/logout",
            "desc": "登出接口",
            "hasItem":False,
            "isList":False,
            "params": []
        }
        ,
        # 接口5
        {
            "method": "POST",
            "path": "auth/register",
            "desc": "注册接口",
            "hasItem":True,
            "isList":False,
            "params": [
                ["niceName", "String", "用户名,注册时必填,登录时该字段没有用,传空字符串即可"],
                ["username", "String", "邮箱"],
                ["password", "String", "密码"],
                ["deviceId", "String", "设备唯一表示，一般取推送平台token"],
                ["deviceType", "int", "设备类型：{0:iphone,1:android,2:ios-p,3:pc}"],
                ["deviceInfo", "String", "设备信息"]
            ]
        }
        ,
        # 接口6
        {
            "method": "GET",
            "path": "auth/req-code",
            "desc": "获取请求code",
            "hasItem":False,
            "isList":False,
            "params": []
        }
        ,
        # 接口7
        {
            "method": "POST",
            "path": "auth/ticket",
            "desc": "获取服务调用凭证接口",
            "hasItem":True,
            "isList":False,
            "params": [
                ["ticket", "String", "TGT"],
                ["service", "String", "请求的服务,可不填,后期拓展用"]
            ]
        }
    ]
}