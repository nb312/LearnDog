{
    "group": "Index",
    "desc": "首页相关接口",
    "func": [
        # 接口1
        {
            "method": "GET",
            "path": "/index/banner",
            "desc": "首页获取banner",
            "isList": True,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "/index/coin/favorites",
            "desc": "首页自选行情",
            "isList": True,
            "hasJsonBody": True,
            "params": [
                ["mappingIdStr", "String", "未登录时，缓存在本地的mapppingId集合"],
                ["st", "String", "登录后获取的ST,未登录就不要传"],
            ]
        }
        ,
        # 接口3
        {
            "method": "GET",
            "path": "/index/coin/list",
            "desc": "获取交易的虚拟币",
            "isList": True,
            "hasJsonBody": True,
            "params": [
                ["legalId", "Long", "法币ID"],
                ["mappingIdStr", "String", "未登录时，缓存在本地的mapppingId集合"],
                ["st", "String", "登录后获取的ST,未登录就不要传"],
                ["field", "String", "排序字段 {lastPrice 最新价 floating 涨跌幅}"],
                ["sort", "Int", "顺序 {0:正序 1:倒序}"]
            ]
        }
        ,
        # 接口4
        {
            "method": "GET",
            "path": "/index/home-quotation",
            "desc": "首页交易对",
            "isList": True,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口5
        {
            "method": "GET",
            "path": "/index/legal/list",
            "desc": "获取交易的法币",
            "isList": True,
            "hasJsonBody": True,
            "params": [
            ]
        }

        ,
        # 接口6
        {
            "method": "GET",
            "path": "/index/list-language",
            "desc": "查询所有语言所有翻译",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }
        ,
        # 接口7
        {
            "method": "GET",
            "path": "/index/notices",
            "desc": "首页获取公告",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["offset", "Int", "offset"],
                ["limit", "Int", "limit"],
                ["refresh", "Boolean", "是否刷新缓存"]
            ]
        }
        ,
        # 接口8
        {
            "method": "GET",
            "path": "/index/rank-list",
            "desc": "排行榜",
            "isList": True,
            "hasJsonBody": True,
            "params": [
                ["type", "Int", "类型{1:交易量 2：涨幅 3：跌幅}"],
                ["limit", "Int", "行数"],
                ["refresh", "Boolean", "是否刷新缓存"]
            ]
        }
        ,
        # 接口9
        {
            "method": "GET",
            "path": "/index/reSendActiveEmail",
            "desc": "未登录用户发送激活链接，接口返回resultDto中包含msg(发送成功或发送失败)，直接提示即可，无需国际化",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["email", "String", "邮箱地址"]
            ]
        }
    ]
}
