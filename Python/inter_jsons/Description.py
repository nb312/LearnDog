{
    "controller": "description",
    "v1": True,
    "desc": "提示文案、公告相关",
    "func": [
        #接口1
        {
            "method": "POST",
            "path": "desc-public/get-announce",
            "desc":"获取公告详情",
             "hasItem":True,
             "isList":False,
            "params": [
                ["id", "long", "id"]
            ]
        }
        ,
        # 接口2
        {
            "method": "POST",
            "path": "desc-public/get-desc",
            "desc": "获取提示文案",
            "hasItem":True,
            "isList":False,
            "params": [
                ["coinId", "long", "币种ID"],
                ["lang", "int", "语言:1简体中文,2繁体中文,3英语"]
            ]
        }
        ,
        # 接口3
        {
            "method": "GET",
            "path": "desc-public/list-announce",
            "desc": "公告列表",
            "hasItem":True,
            "isList":False,
            "params": [
                ["offset", "long", "当前页起始行"],
                ["limit", "long", "每页显示的记录条数"]
            ]
        }
    ]
}