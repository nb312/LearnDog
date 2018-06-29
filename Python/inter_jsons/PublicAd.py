{
    "controller": "publicAd",
    "v1": True,
    "desc": "广告公共接口",
    "func": [
        #接口1
        {
            "method": "GET",
            "path": "ad-public/calc",
            "desc":"买入、售出计算"
            ,
             "hasItem":True,
             "isList":False,
            "params": [
                ["id", "long", "广告id"],
                ["type", "int", "传递的数字计算类型:1金额、2数量"],
                ["num", "double", "数字"]
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "ad-public/detail",
            "desc":"买入、售出详情页信息"
            ,
             "hasItem":True,
             "isList":False,
            "params": [
                ["id", "long", "广告id"]
            ]
        }
        ,
        # 接口3
        {
            "method": "GET",
            "path": "ad-public/list",
            "desc": "在线出售、购买列表",
            "hasItem":True,
            "isList":False,
            "params": [
                ["offset", "long", "当前页起始行"],
                ["limit", "long", "每页显示的记录条数"],
                ["coinId", "long", "币种id"],
                ["entrustType", "int", "交易类型:0买，1卖"],
                ["countryCode", "String", "国家"],
                ["currency", "String", "货币"],
                ["payProvider", "long", "付款方式"],
                ["needPhone", "boolean", "需手机验证"],
                ["needRealName", "boolean", "需身份验证"],
                ["niceName", "String", "用户昵称"],
                ["minPrice", "double", "价格区间:小"],
                ["maxPrice", "double", "价格区间:大"],
                ["sort", "String", "排序字段: 价格price，交易次数tradeNum，注：不区分大小写"],
                ["order", "String", "升降序: asc，desc"]
            ]
        }
        ,
        # 接口4
        {
            "method": "GET",
            "path": "ad-public/multiple-select",
            "desc": "获取下拉框数据",
            "hasItem":True,
            "isList":False,
            "params": [
                ["type", "String", "数据类型，如果需要多个，则以逗号分割 获取系统指定的下拉框数据，1身份认证-证件类型；2货币；3国家地区；4付款方式；5交易所；6买家申诉原因；7卖家申诉原因"]
            ]
        }
        ,
        # 接口5
        {
            "method": "GET",
            "path": "ad-public/pay-minute",
            "desc": "选择支付方式后，获取支付分钟限制范围",
            "hasItem":True,
            "isList":False,
            "params": [
                ["id", "long", "支付方式Id"]
            ]
        }
    ]
}