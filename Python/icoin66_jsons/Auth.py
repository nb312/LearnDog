{
    "controller": "Auth",
    "v1": False,
    "desc": "认证相关接口",
    "func": [
        #接口1
        {
            "method": "POST",
            "path": "auth/forget-check",
            "desc":"2.忘记密码，校验验证码",
             "hasItem":True,
             "isList":False,
            "params": [
                ["username", "String", "用户名"],
                ["code", "String", "验证码"]
            ]
        }
        ,
        {
            "method": "POST",
            "path": "auth/forget-over",
            "desc": "3.忘记密码，提交密码修改",
            "hasItem": True,
            "isList": False,
            "params": [
                ["password", "String", "密码"],
                ["id", "String", "唯一标识"]
            ]
        }
        ,
        {
            "method": "POST",
            "path": "auth/forget-request",
            "desc": "1.忘记密码请求接口",
            "hasItem": False,
            "isList": False,
            "params": [
                ["username", "String", "用户名"]
            ]
        }
        ,
        {
            "method": "POST",
            "path": "auth/login",
            "desc": "登录接口",
            "hasItem": True,
            "isList": False,
            "params": [
                ["username", "String", "登录名：邮箱或手机"],
                ["password", "String", "密码"],
                ["deviceId", "String", "设备唯一表示，一般取推送平台token"],
                ["deviceType", "int", "设备类型：{0:iphone,1:android,2:ios-p,3:pc}"],
                ["deviceInfo", "String", "设备信息"],
                ["googleCode", "String", "谷歌验证码"],
                ["refereeCode", "String", "邀请码"]
            ]
        }
        ,
        {
            "method": "POST",
            "path": "auth/logout",
            "desc": "登出接口",
            "hasItem": False,
            "isList": False,
            "params": [
            ]
        }
        ,
        {
            "method": "POST",
            "path": "auth/register",
            "desc": "注册接口",
            "hasItem": True,
            "isList": False,
            "params": [
                ["username", "String", "登录名：邮箱或手机"],
                ["password", "String", "密码"],
                ["deviceId", "String", "设备唯一表示，一般取推送平台token"],
                ["deviceType", "int", "设备类型：{0:iphone,1:android,2:ios-p,3:pc}"],
                ["deviceInfo", "String", "设备信息"],
                ["googleCode", "String", "谷歌验证码"],
                ["refereeCode", "String", "邀请码"]
            ]
        }
        ,
        {
            "method": "POST",
            "path": "auth/ticket",
            "desc": "获取服务调用凭证接口",
            "hasItem": True,
            "isList": False,
            "params": [
                ["ticket", "String", "TGT"],
                ["service", "String", "请求的服务,可不填,后期拓展用"]
            ]
        }

    ]
}