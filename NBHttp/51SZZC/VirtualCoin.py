{
    "group": "VirtualCoin",
    "desc": "货币相关接口",
    "func": [
        # 接口1
        {
            "method": "GET",
            "path": "/v1/coin/detail-by-mapping",
            "desc": "获取币种详细信息",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["mappingId", "Long", "mappingId"]
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "/v1/coin/getActiveCoin",
            "desc": "获取可用的币种",
            "isList": True,
            "hasJsonBody": True,
            "params": [
                ["type", "Int", "类型1.充值,2.提现"]
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "/v1/coin/getCoinDetail",
            "desc": "获取币种信息",
            "isList": True,
            "hasJsonBody": True,
            "params": [
                ["coinId", "Long", "币种ID"]
            ]
        }
    ]
}
