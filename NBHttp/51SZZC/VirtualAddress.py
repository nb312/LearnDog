{
    "group": "VirtualAddress",
    "desc": "虚拟币地址相关接口",
    "func": [
        # 接口1
        {
            "method": "POST",
            "path": "/v1/virtual/address/in/add",
            "desc": "新增充币地址",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["coinId", "Long", "币种ID"]
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "/v1/virtual/address/in/detail",
            "desc": "获取充币地址",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["coinId", "Long", "币种简称"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "/v1/virtual/address/out/add",
            "desc": "新增提币地址",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["address", "String", "提币地址"],
                ["code", "String", "邮箱验证码"],
                ["coinId", "Long", "币种ID"],
                ["remark", "String", "备注"],
                ["addressLabel", "String", "地址标签"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "/v1/virtual/address/out/delete",
            "desc": "删除提币地址",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["ids", "String", "a lot of id:1,2,3,4"]
            ]
        }
        ,
        # 接口5
        {
            "method": "GET",
            "path": "/v1/virtual/address/out/list",
            "desc": "获取提币地址列表",
            "isList": True,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口6
        {
            "method": "POST",
            "path": "/v1/virtual/address/out/modify/remark",
            "desc": "修改提币备注",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["id", "Long", "提币地址ID"],
                ["remark", "String", "提币地址备注"]
            ]
        }
        ,
        # 接口7
        {
            "method": "GET",
            "path": "/v1/virtual/address/sendEmailCode",
            "desc": "新增提币地址时发送邮箱验证码",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }
    ]
}
