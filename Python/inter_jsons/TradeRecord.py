{
    "controller": "tradeRecord",
    "v1": True,
    "desc": "交易相关接口",
    "func": [
        #接口1
        {
            "method": "POST",
            "path": "tradeRecord/appeal",
            "desc":"申诉",
             "hasItem":False,
             "isList":False,
            "params": [
                ["tradeNo", "String", "交易订单号"],
                ["reason", "String", "原因"],
                ["reasonId", "int", "申诉原因id，非必填，当用户自己输入原因时，此值为空"]
            ]
        }
        ,
        # 接口2
        {
            "method": "POST",
            "path": "tradeRecord/buy",
            "desc": "买入",
            "hasItem":True,
            "isList":False,
            "params": [
                ["advertiseId", "long", "广告ID"],
                ["quotedPrice", "double", "广告报价、单价"],
                ["money", "double", "买入金额"],
                ["count", "double", "买入数量"],
                ["platform", "int", "交易平台1web、2app、3api"],
                ["remark", "String", "交易留言"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "tradeRecord/cancel",
            "desc": "取消",
            "hasItem":False,
            "isList":False,
            "params": [
                ["tradeNo", "String", "交易订单号"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "tradeRecord/detail",
            "desc": "交易详情",
            "hasItem":True,
            "isList":False,
            "params": [
                ["id", "long", "交易主键id"]
            ]
        }
        ,
        # 接口5
        {
            "method": "POST",
            "path": "tradeRecord/evaluation",
            "desc": "评价",
            "hasItem":False,
            "isList":False,
            "params": [
                ["tradeId", "long", "交易ID号"],
                ["level", "int", "评价级别:1好评、2中评、3差评"],
                ["content", "String", "评价内容"],
                ["requestCode", "String", "请求code"],
            ]
        }
        ,
        # 接口6
        {
            "method": "POST",
            "path": "tradeRecord/grantCoin",
            "desc": "卖家放行币",
            "hasItem":False,
            "isList":False,
            "params": [
                ["tradeNo", "String", "交易订单号"]
            ]
        }
        ,
        # 接口7
        {
            "method": "GET",
            "path": "tradeRecord/listJudge",
            "desc": "最近收到的评价",
            "hasItem":True,
            "isList":False,
            "params": [
                ["userId", "long", "用户id"],
                ["offset", "long", "当前页起始行"],
                ["limit", "long", "每页显示的记录条数"]
            ]
        }
        ,
        # 接口8
        {
            "method": "GET",
            "path": "tradeRecord/list",
            "desc": "交易列表",
            "hasItem":True,
            "isList":False,
            "params": [
                ["offset", "long", "当前页起始行"],
                ["limit", "long", "每页显示的记录条数"],
                ["type", "int", "列表类型：不传表示全部，1进行中，2已关闭"],
                ["entrustType", "int", "交易类型：0购买、1出售"]
            ]
        }
        ,
        # 接口9
        {
            "method": "POST",
            "path": "tradeRecord/payComplate",
            "desc": "买家完成付款",
            "hasItem":False,
            "isList":False,
            "params": [
                ["tradeNo", "String", "交易订单号"]
            ]
        }
        ,
        # 接口10
        {
            "method": "POST",
            "path": "tradeRecord/sell",
            "desc": "售出",
            "hasItem":True,
            "isList":False,
            "params": [
                ["advertiseId", "long", "广告ID"],
                ["quotedPrice", "double", "广告报价、单价"],
                ["money", "double", "售出金额"],
                ["count", "double", "售出数量"],
                ["platform", "int", "交易平台1web、2app、3api"],
                ["remark", "String", "交易留言"]
            ]
        }
        ,
        # 接口11
        {
            "method": "POST",
            "path": "tradeRecord/open-hosting",
            "desc": "重新开启托管：只有超时支付，系统自动取消的，才能开启",
            "hasItem":False,
            "isList":False,
            "params": [
                ["tradeNo", "String", "交易订单号"]
            ]
        }
        ,
        # 接口12
        {
            "method": "POST",
            "path": "tradeRecord/receipt",
            "desc": "查看可打印的收据",
            "hasItem":True,
            "isList":False,
            "params": [
                ["tradeNo", "String", "交易订单号"]
            ]
        }
        ,
        # 接口13
        {
            "method": "GET",
            "path": "tradeRecord/base-info",
            "desc": "基础信息",
            "hasItem":True,
            "isList":False,
            "params": [
                ["tradeNo", "String", "交易订单号"]
            ]
        }
    ]
}