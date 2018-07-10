{
    "controller": "coinOperation",
    "v1": True,
    "desc": "币种相关接口",
    "func": [
        #接口1
        {
            "method": "POST",
            "path": "coin/add",
            "desc":"新增提币申请接口"
            ,
             "hasItem": False,
             "isList": False,
            "params": [
                ["coinId", "long", "币种id"],
                ["address", "String", "地址"],
                ["amount", "double", "提出数量"],
                ["fees", "double", "手续费,2期,不要传值"],
                ["minerFees", "double", "矿工费,2期,不要传值"],
                ["relAmount", "String", "实际到账"],
                ["tradePwd", "String", "资金密码"],
                ["remark", "String", "备注"]
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "coin/assets",
            "desc": "我的资产",
            "hasItem":True,
            "isList":True,
            "params": [
                ["coinId","long","币种ID"]
            ]
        }
        ,
        # 接口2+1
        {
            "method": "GET",
            "path": "coin/balance-change",
            "desc": "交易明细",
            "hasItem":True,
            "isList":False,
            "params": [
                ["offset","long","当前页起始行"],
                ["limit","long","每页显示的记录条数"],
                ["group","int","类型：0全部，1网络转入转出，2交易买入卖出"],
                ["operationType","int","操作类型：group=2时，可选值:0买，1卖；group=1时，可选值:1充，2提"],
                ["coinId","long","币种ID"]
            ]
        }
        ,
        # 接口2+2
        {
            "method": "GET",
            "path": "coin/balance-tj",
            "desc": "交易明细页面：收到、发送统计",
            "hasItem":True,
            "isList":False,
            "params": [
                ["coinId", "long", "币种ID"],
                ["yearMonth","String","统计月份"]
            ]
        }
        ,
        # 接口3
        {
            "method": "GET",
            "path": "coin/calc-fee",
            "desc": "计算实际到帐金额、手续费",
            "hasItem":True,
            "isList":False,
            "params": [
                ["amount", "double", "提币数量"],
                ["coinId", "long", "币种ID"],
                ["minerFees", "double", "矿工费,2期,不要传值"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "coin/cancel",
            "desc": "取消提币申请接口",
            "hasItem":False,
            "isList":False,
            "params": [
                ["operateId", "long", "提出记录ID"]
            ]
        }
        ,
        # 接口5
        {
            "method": "POST",
            "path": "coin/delete",
            "desc": "删除提币申请接口",
            "hasItem":False,
            "isList":False,
            "params": [
                ["operateId", "long", "提出记录ID"]
            ]
        }
        ,
        # 接口6
        {
            "method": "GET",
            "path": "coin/get-RejectReason",
            "desc": "查看提现拒绝原因",
            "hasItem":False,
            "isList":False,
            "params": [
                ["id", "long", "流水记录id"]
            ]
        }
        ,
        # 接口7
        {
            "method": "GET",
            "path": "coin/list",
            "desc": "分页获取充提记录接口",
            "hasItem":True,
            "isList":False,
            "params": [
                ["offset", "long", "当前页起始行"],
                ["limit", "long", "每页显示的记录条数"],
                ["operationType", "int", "操作类型：1充入、2提出"]
            ]
        }
        ,
        # 接口8
        {
            "method": "POST",
            "path": "coin/send-affirm-mail",
            "desc": "重新发送邮件",
            "hasItem":False,
            "isList":False,
            "params": [
                ["id", "long", "提出记录ID"]
            ]
        }
        ,
        # 接口9
        {
            "method": "GET",
            "path": "coin/show-balance",
            "desc": "虚拟币提现时,显示余额、费率信息",
            "hasItem":True,
            "isList":False,
            "params": [
                ["coinId", "long", "币种ID"]
            ]
        }
    ]
}