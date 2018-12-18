{
    "group": "test",
    "desc": "测试工具",
    "func": [
        # 接口1
        {
            "method": "GET",
            "path": "gen-sign",
            "desc": "根据time和参数生成sign",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["time", "String", "时间戳"],
                ["param", "String", "参数列表"]
            ]
        }
    ]
}
