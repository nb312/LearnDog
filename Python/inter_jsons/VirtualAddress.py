{
    "controller": "VirtualAddress",
    "v1": True,
    "desc": "虚拟币地址相关接口",
    "func": [
        #接口1
        {
            "method": "POST",
            "path": "virtual/address/in/add",
            "desc":"新增充币地址",
             "hasItem":True,
             "isList":False,
            "params": [
                ["coinId", "long", "币种ID"]
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "virtual/address/in/detail",
            "desc": "获取充币地址",
            "hasItem":True,
            "isList":False,
            "params": [
                ["coinId", "long", "币种简称"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "virtual/address/out/add",
            "desc": "新增提币地址",
            "hasItem":False,
            "isList":False,
            "params": [
                ["address", "String", "提币地址"],
                ["tradePwd", "String", "资金密码"],
                ["coinId", "long", "币种ID"],
                ["remark", "String", "备注"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "virtual/address/out/delete",
            "desc": "删除提币地址",
            "hasItem":False,
            "isList":False,
            "params": [
                ["ids", "String", "id 组"]
            ]
        }
        ,
        # 接口5
        {
            "method": "GET",
            "path": "virtual/address/out/list",
            "desc": "获取提币地址列表",
            "hasItem":True,
            "isList":True,
            "params": [
                ["coinId","long","币种ID"]
            ]
        }
        ,
        # 接口6
        {
            "method": "POST",
            "path": "virtual/address/out/modify/remark",
            "desc": "修改提币备注",
            "hasItem": False,
            "isList": False,
            "params": [
                ["id", "long", "提币地址ID"],
                ["remark", "String", "提币地址备注"]
            ]
        }
    ]
}