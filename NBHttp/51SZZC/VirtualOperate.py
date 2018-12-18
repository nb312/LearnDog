{
    "group": "VirtualOperate",
    "desc": "虚拟币提币相关接口",
    "func": [
        # 接口1
        {
            "method": "POST",
            "path": "/v1/virtual/operate/add",
            "desc": "新增提币申请接口",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["coinId", "Long", "币种简称"],
                ["address", "String", "地址"],
                ["amount", "String", "提出数量"],
                ["fees", "String", "手续费"],
                ["minerFees", "String", "矿工费"],
                ["relAmount", "String", "实际到账"],
                ["addressLabel", "String", "地址标签"]
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "/v1/virtual/operate/calc-fee",
            "desc": "计算实际到帐金额、手续费",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["amount", "String", "提币数量"],
                ["coinId", "Long", "币种ID"],
                ["minerFees", "String", "矿工费"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "/v1/virtual/operate/cancel",
            "desc": "取消提币申请接口",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["operateId", "Long", "提出记录ID"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "/v1/virtual/operate/delete",
            "desc": "删除提币申请接口",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["operateId", "Long", "提出记录ID"]
            ]
        }
        ,
        # 接口5
        {
            "method": "GET",
            "path": "/v1/virtual/operate/get-RejectReason",
            "desc": "查看提现拒绝原因",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["id", "Long", "流水记录id"]
            ]
        }
        ,
        # 接口6
        {
            "method": "POST",
            "path": "/v1/virtual/operate/send-affirm-mail",
            "desc": "重新发送邮件",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["id", "Long", "流水记录id"]
            ]
        }
        ,
        # 接口7
        {
            "method": "GET",
            "path": "/v1/virtual/operate/show-balance",
            "desc": "虚拟币提现时，显示余额、费率、提现银行卡信息",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["coinId", "Long", "币种ID"]
            ]
        }
    ]
}
