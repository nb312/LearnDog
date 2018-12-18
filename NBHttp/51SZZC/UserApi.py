{
    "group": "UserApi",
    "desc": "用户api相关接口",
    "func": [
        # 接口1
        {
            "method": "GET",
            "path": "/v1/user/api/api-list",
            "desc": "查看API列表",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["offset", "Long", "起始位置"],
                ["limit", "Long", "每页显示数"]
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "/v1/user/api/create-api",
            "desc": "创建API",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["code", "String", "验证码"],
                ["remark", "String", "备注"],
                ["type", "Int", "验证码分类：1google,2邮箱,3手机"]
            ]
        }
        ,
        # 接口3
        {
            "method": "GET",
            "path": "/v1/user/api/delete-api",
            "desc": "删除API",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["code", "String", "验证码"],
                ["remark", "String", "备注"],
                ["type", "Int", "验证码分类：1google,2邮箱,3手机"],
                ["id", "Long", "编号"]
            ]
        }
        ,
        # 接口4
        {
            "method": "GET",
            "path": "/v1/user/api/send-api-code",
            "desc": "创建或API时发送验证码，返回值包含验证码分类，若绑定google无需调此接口",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["codeType", "Int", "验证码分类：1google,2邮箱,3手机"],
                ["operationType", "Int", "操作类型：1创建api时发送,2查看api时发送 3:删除api时发送"]
            ]
        }
        ,
        # 接口5
        {
            "method": "GET",
            "path": "/v1/user/api/view-api",
            "desc": "查看API",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["code", "String", "验证码"],
                ["type", "Int", "验证码分类：1 google,2邮箱,3手机"],
                ["id", "Long", "编号"]
            ]
        }
    ]
}
