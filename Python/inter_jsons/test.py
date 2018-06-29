{
    "controller": "test",
    "v1": False,
    "desc": "我的广告列表",
    "func": [
        #接口1
        {
            "method": "GET",
            "path": "gen-sign",
            "desc":"根据time和参数生成sign"
            ,
             "hasItem":False,
             "isList":False,
            "params": [
                ["time", "String", "时间戳"],
                ["param", "String", "参数列表"],
            ]
        }

    ]
}