{
    "group": "Auth",
    "desc": "认证相关接口",
    "func": [
        # 接口1
        {
            "method": "POST",
            "path": "/auth/forget-check",
            "desc": "忘记密码，校验验证码",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["username", "String", "用户名"],
                ["code", "String", "验证码"]
            ]
        }
        ,
        # 接口2
        {
            "method": "POST",
            "path": "/auth/forget-over",
            "desc": "忘记密码，提交密码修改",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["password", "String", "密码"],
                ["id", "String", "唯一标识"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "/auth/forget-request",
            "desc": "忘记密码接口，输入邮箱或手机号，发送验证码",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["username", "String", "用户名"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "/auth/login",
            "desc": "认证登录，返回TicketGrantTicket,以下简称TGT",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["username", "String", "登录名：邮箱或手机"],
                ["password", "String", "密码"],
                ["deviceId", "String", "设备唯一表示，一般取推送平台token"],
                ["deviceType", "Int", "设备类型：{0:iphone,1:android,2:ios-p,3:pc}"],
                ["deviceInfo", "String", "设备信息"],
                ["googleCode", "String", "谷歌验证码"],
                ["refereeCode", "String", "邀请码"]
            ]
        }
        ,
        # 接口5
        {
            "method": "POST",
            "path": "/auth/logout",
            "desc": "登出",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }
        ,
        # 接口6
        {
            "method": "POST",
            "path": "/auth/register",
            "desc": "注册接口，新版根据邮箱注册",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["username", "String", "登录名：邮箱或手机"],
                ["password", "String", "密码"],
                ["deviceId", "String", "设备唯一表示，一般取推送平台token"],
                ["deviceType", "Int", "设备类型：{0:iphone,1:android,2:ios-p,3:pc}"],
                ["deviceInfo", "String", "设备信息"],
                ["googleCode", "String", "谷歌验证码"],
                ["refereeCode", "String", "邀请码"]
            ]
        }
        ,
        # 接口7
        {
            "method": "POST",
            "path": "/auth/ticket",
            "desc": "传入TGT，返回serviceTicket,以下简称ST-1002：令牌失效，请重新登录！",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["ticket", "String", "TGT"],
                ["service", "String", "请求的服务,可不填,后期拓展用"]
            ]
        }
    ]
}
