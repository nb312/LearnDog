{
    "controller": "UserRelation",
    "v1": True,
    "desc": "用户关系",
    "func": [
        #接口1
        {
            "method": "POST",
            "path": "user-relation/detail",
            "desc":"用户交易统计信息",
             "hasItem":True,
             "isList":False,
            "params": []
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "user-relation/list-trust",
            "desc": "信任我的人、我信任的人、我屏蔽的人",
            "hasItem":True,
            "isList":False,
            "params": [
                ["offset", "long", "当前页起始行"],
                ["limit", "long", "每页显示的记录条数"],
                ["type", "int", "查询类型：1信任我的人，2我信任的人，3我屏蔽的人"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "user-relation/shield",
            "desc": "屏蔽、取消屏蔽",
            "hasItem":False,
            "isList":False,
            "params": [
                ["relationUserId", "long", "被屏蔽的用户id"],
                ["shield", "int", "0屏蔽、1取消屏蔽"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "user-relation/trust",
            "desc": "信任、取消信任",
            "hasItem":False,
            "isList":False,
            "params": [
                ["relationUserId", "long", "被信任的用户id"],
                ["trustType", "int", "0信任、1取消信任"]
            ]
        }
    ]
}