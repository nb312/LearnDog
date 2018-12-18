{
    "group": "InsurancePolicy",
    "desc": "保单相关接口",
    "func": [
        # 接口1
        {
            "method": "POST",
            "path": "/v1/insurance/policy/exercise",
            "desc": "行权",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["id", "Long", "保单id"]
            ]
        }
        ,
        # 接口2
        {
            "method": "POST",
            "path": "/v1/insurance/policy/list-page",
            "desc": "获取保单列表",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["status", "Int", "状态"],
                ["offset", "Int", "offset"],
                ["limit", "Int", "limit"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "/v1/insurance/policy/temp",
            "desc": "临时方法",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["date", "String", "时间 yyyy-mm-dd"]
            ]
        }
    ]
}
