{
    "group": "PriceWarn",
    "desc": "价格提醒相关接口",
    "func": [
        # 接口1
        {
            "method": "GET",
            "path": "/v1/price-warn/detail",
            "desc": "配置详情,根据mappingId获取",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["mappingId", "Long", "法币匹配"]
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "/v1/price-warn/list",
            "desc": "获取提醒设置列表",
            "isList": False,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "/v1/price-warn/save",
            "desc": "保存价格提醒设置",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["mappingId", "Long", "匹配id"],
                ["highPrice", "Double", "价格上限"],
                ["lowPrice", "Double", "价格下限"],
                ["isOpen", "Boolean", "是否开启 boolean"]
            ]
        }

    ]
}
