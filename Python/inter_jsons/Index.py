{
    "controller": "index",
    "v1": True,
    "desc": "提示文案、公告相关",
    "func": [
        #接口1
        {
            "method": "GET",
            "path": "index/coin/list",
            "desc":"获取虚拟币",
             "hasItem":True,
             "isList":True,
            "params": []
        }
        ,
        #接口2
        {
            "method": "GET",
            "path": "index/reSendActiveEmail",
            "desc":"未登录用户发送激活链接",
             "hasItem":False,
             "isList":False,
            "params": [
                ["email", "String", "邮箱地址"]
            ]
        }
        ,
        #接口3
        {
            "method": "GET",
            "path": "index/user-center",
            "desc":"用户主页获取用户基础信息 web端的不管",
             "hasItem":True,
             "isList":False,
            "params": [
                ["userId", "long", "用户id"],
                ["st", "String", "登录后获取的ST,未登录就不要传"]
            ]
        }
    ]
}