{
    "controller": "message",
    "v1": True,
    "desc": "消息",
    "func": [
        #接口1
        {
            "method": "POST",
            "path": "message/deleted",
            "desc":"单条消息删除"
            ,
             "hasItem":False,
             "isList":False,
            "params": [
                ["id", "long", "消息id"]
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "message/detail",
            "desc": "消息详情",
            "hasItem":True,
            "isList":False,
            "params": [
                ["id", "long", "消息id"]
            ]
        }
        ,
        # 接口3
        {
            "method": "GET",
            "path": "message/list",
            "desc": "我的消息列表",
            "hasItem":True,
            "isList":False,
            "params": [
                ["offset", "long", "当前页起始行"],
                ["limit", "long", "每页显示的记录条数"],
                ["group", "int", "消息类型:0交易,1客服,2系统,3评价,4聊天,不传则查全部"]

            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "message/readed",
            "desc": "消息已读",
            "hasItem":False,
            "isList":False,
            "params": [
                ["id", "long", "消息id"]
            ]
        }
        ,
        # 接口5
        {
            "method": "GET",
            "path": "message/unRead-num",
            "desc": "我的未读消息数",
            "hasItem":False,
            "isList":False,
            "params": [ ]
        }
        ,
        # 接口6
        {
            "method": "GET",
            "path": "message/unRead-num-group",
            "desc": "根据消息类型查询未读消息数",
            "hasItem":False,
            "isList":False,
            "params": [
                ["group", "int", "消息类型:0交易,1客服,2系统,3评价,4聊天"]
            ]
        }
        ,
        # 接口7
        {
            "method": "GET",
            "path": "message/unRead-num-group",
            "desc": "分组获取所有类型的未读消息数",
            "hasItem":True,
            "isList":True,
            "params": []
        }
    ]
}