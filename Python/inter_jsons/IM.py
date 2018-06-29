{
    "controller": "IM",
    "v1": True,
    "desc": "im相关接口",
    "func": [
        #接口1
        {
            "method": "GET",
            "path": "im/login-info",
            "desc":"获取im登录相关字段",
             "hasItem":True,
             "isList":False,
            "params": []
        }
        ,
        #接口2
        {
            "method": "GET",
            "path": "im/get-accid",
            "desc":"获取账户accid",
             "hasItem":True,
             "isList":False,
            "params":[
                ["userId","long","用户id"]

                       ]
        }
    ]
}