{
    "group": "Trade",
    "desc": "交易相关接口",
    "func": [
        # 接口1
        {
            "method": "POST",
            "path": "/v1/trade/add-portfolio",
            "desc": "自选",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["symbol", "String", "交易对"]
            ]
        }
        ,
        # 接口2
        {
            "method": "POST",
            "path": "/v1/trade/batchCancel",
            "desc": "撤销订单 状态为 1、2时可操作",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["tradeType", "Int", "类型 0 买单 1 卖单 不传表示.所有"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "/v1/trade/buyLimit",
            "desc": "限价买入，参数为价格、数量 钱包接口未接入",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["mappingId", "Long", "法币匹配 SC_CNY"],
                ["price", "Double", "价格"],
                ["account", "Double", "数量"],
                ["hedging", "Int", "是否缴纳保证金"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "/v1/trade/buyMarket",
            "desc": "市价买入，参数为金额 钱包接口未接入",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["mappingId", "Long", "法币匹配id"],
                ["amount", "Double", "金额"],
                ["hedging", "Int", "是否缴纳保证金0:false,1:true"]
            ]
        }
        ,
        # 接口5
        {
            "method": "POST",
            "path": "/v1/trade/cancel",
            "desc": "撤销订单 状态为 1、2时可操作",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["entrustId", "Long", "委托单id"]
            ]
        }
        ,
        # 接口6
        {
            "method": "GET",
            "path": "/v1/trade/config",
            "desc": "获取 最小交易单价、最小交易金额、最小交易数量、单价小数位、数量小数位、手续费率等信息",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["mappingId", "Long", "交易匹配ID"]
            ]
        }
        ,
        # 接口7
        {
            "method": "POST",
            "path": "/v1/trade/delete-portfolio",
            "desc": "取消自选",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["symbol", "String", "交易对"]
            ]
        }
        ,
        # 接口8
        {
            "method": "GET",
            "path": "/v1/trade/entrustDepth",
            "desc": "获取委托深度",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["mappingId", "Long", "法币匹配id"],
                ["size", "Int", "获取档位"],
                ["depth", "Int", "深度小数位 0表示整数"],
            ]
        }
        ,
        # 接口9
        {
            "method": "GET",
            "path": "/v1/trade/entrustDepth-chart",
            "desc": "获取委托深度图数据",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["mappingId", "Long", "法币匹配id"]
            ]
        }
        ,
        # 接口10
        {
            "method": "GET",
            "path": "/v1/trade/exchange-rate",
            "desc": "返回汇率信息",
            "isList": False,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口11
        {
            "method": "POST",
            "path": "/v1/trade/get-favorites-flag",
            "desc": "获取交易对的自选标识位",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["symbol", "String", "交易对"]
            ]
        }
        ,
        # 接口12
        {
            "method": "POST",
            "path": "/v1/trade/is-show-trade-google",
            "desc": "交易委托前，是否需要显示谷歌验证框",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }
        ,
        # 接口13
        {
            "method": "GET",
            "path": "/v1/trade/kline",
            "desc": "获取K线 [[时间,开盘价,最高价,最低价,收盘价,成交量]]",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["mappingId", "Long", "交易匹配id"],
                ["size", "Int", "条数，默认传0"],
                ["stepTime", "String", "时间段 1m,5m,15m,30m,1h,1d,1w"]
            ]
        }
        ,
        # 接口14
        {
            "method": "GET",
            "path": "/v1/trade/listEntrust",
            "desc": "获取用户委托记录",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["type", "Int", "类型 1 当前委托 2历史委托 0.所有委托"],
                ["tradeType", "Int", "类型 0 买单 1 卖单 不传表示.所有"],
                ["limit", "Long", "每页显示行数"],
                ["offset", "Long", "起始位置"],
                ["mappingId", "Long", "法币匹配id"]
            ]
        }
        ,
        # 接口15
        {
            "method": "GET",
            "path": "/v1/trade/listEntrustRec",
            "desc": "获取用户委托交易明细",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["entrustId", "Long", "委托记录id"]
            ]
        }
        ,
        # 接口16
        {
            "method": "GET",
            "path": "/v1/trade/listTradeRec",
            "desc": "获取成交记录",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["type", "Int", "类型 :0买入,1卖出"],
                ["legalId", "Long", "法币id"],
                ["startDate", "String", "开始日期"],
                ["endDate", "String", "结束日期"],
                ["offset", "Long", "起始位置"],
                ["limit", "Long", "每页行数"]
            ]
        }
        ,
        # 接口17
        {
            "method": "GET",
            "path": "/v1/trade/mapping",
            "desc": "获取交易匹配列表",
            "isList": True,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口18
        {
            "method": "POST",
            "path": "/v1/trade/move-portfolio",
            "desc": "自选拖动排序",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["symbol", "String", "交易对"],
                ["displaceNO", "Int", "位移偏量(当前位置 减去目标位置,ps：当前排序5 移动到8,偏移量-3)"]

            ]
        }
        ,
        # 接口19
        {
            "method": "GET",
            "path": "/v1/trade/quotation",
            "desc": "单个交易匹配行情: 获取 涨跌幅、最新价、最高、最低、成交额等相关信息",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["mappingId", "String", "交易匹配ID"]
            ]
        }
        ,
        # 接口20
        {
            "method": "GET",
            "path": "/v1/trade/recommend-mapping",
            "desc": "获取推荐交易对列表",
            "isList": True,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口21
        {
            "method": "POST",
            "path": "/v1/trade/sellLimit",
            "desc": "限价卖出 钱包接口未接入",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["mappingId", "Long", "法币匹配id"],
                ["price", "Double", "价格"],
                ["account", "Double", "数量"],
                ["hedging", "Int", "是否缴纳保证金 0:false,1:True"]
            ]
        }
        ,
        # 接口22
        {
            "method": "POST",
            "path": "/v1/trade/sellMarket",
            "desc": "市价卖出，参数为金额",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["mappingId", "Long", "法币匹配id"],
                ["account", "Double", "数量"],
                ["hedging", "Int", "是否缴纳保证金 0:false,1:True"]
            ]
        }
        ,
        # 接口23
        {
            "method": "POST",
            "path": "/v1/trade/verify-google-code",
            "desc": "交易委托验证谷歌验证码",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["googleCode", "String", "谷歌验证码"]
            ]
        }

    ]
}
