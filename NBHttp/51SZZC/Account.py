{
    "group": "Account",
    "desc": "资产相关接口",
    "func": [
        # 接口1
        {
            "method": "GET",
            "path": "/v1/account/assets",
            "desc": "获取资产列表",
            "isList": False,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "/v1/account/delist",
            "desc": "退市资产列表",
            "isList": True,
            "hasJsonBody": True,
            "params": [
            ]
        }
    ]
}
