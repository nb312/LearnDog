{
    "group": "AppLegal",
    "desc": "法币充提相关接口",
    "func": [
        # 接口1
        {
            "method": "GET",
            "path": "/v1/legal/calc-fee",
            "desc": "计算实际到帐金额、手续费",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["money", "Double", "提现金额"],
                ["coinId", "Long", "提现币种"]
            ]
        }
        ,
        # 接口2
        {
            "method": "GET",
            "path": "/v1/legal/cancel-in",
            "desc": "法币取消充值",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["id", "Long", "流水记录id"]
            ]
        }
        ,
        # 接口3
        {
            "method": "GET",
            "path": "/v1/legal/cancel-out",
            "desc": "法币取消提现",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["id", "Long", "流水记录id"]
            ]
        }
        ,
        # 接口4
        {
            "method": "GET",
            "path": "/v1/legal/confirm-in-amount",
            "desc": "用户确认充值金额",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["id", "Long", "流水记录id"]
            ]
        }
        ,
        # 接口5
        {
            "method": "GET",
            "path": "/v1/legal/delete",
            "desc": "删除充、提记录",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["id", "Long", "流水记录id"],
                ["type", "Long", "操作类型1删除充值，2删除提现"]
            ]
        }
        ,
        # 接口6
        {
            "method": "GET",
            "path": "/v1/legal/get-RejectReason",
            "desc": "查看(充、提)拒绝原因",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["id", "Long", "流水记录id"]
            ]
        }
        ,
        # 接口7
        {
            "method": "POST",
            "path": "/v1/legal/in-add",
            "desc": "法币充值上传凭证，国际站是上传转款凭证，生成充值流水；泰国站是根据id上传转款信息，进行实转金额的操作",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["id", "Long", "充值流水id"],
                ["coinId", "Long", "币种id"],
                ["tradeNo", "String", "交易ID"],
                ["money", "Double", "充值金额"],
                ["transferUrl", "String", "转款记录单"]
            ]
        }
        ,
        # 接口8
        {
            "method": "GET",
            "path": "/v1/legal/in-out-record",
            "desc": "财务中心-充提记录",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["offset", "Long", "当前页起始行"],
                ["limit", "Long", "每页显示的记录条数"]
            ]
        }
        ,
        # 接口9
        {
            "method": "GET",
            "path": "/v1/legal/out-add",
            "desc": "法币提现",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["money", "Double", "提现金额"],
                ["coinId", "Long", "提现币种"]
            ]
        }
        ,
        # 接口10
        {
            "method": "GET",
            "path": "/v1/legal/show-balance",
            "desc": "法币提现时，显示余额、费率、提现银行卡信息",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["coinId", "Long", "提现币种id"]
            ]
        }
        ,
        # 接口11
        {
            "method": "GET",
            "path": "/v1/legal/show-rechange-money",
            "desc": "待转账时，查看平台收款银行信息、充值金额信息，当前仅泰国站有作用",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["coinId", "Long", "充值流水id"]
            ]
        }
        ,
        # 接口12
        {
            "method": "POST",
            "path": "/v1/legal/show-sys-bank",
            "desc": "法币充值时，显示平台的收款银行卡信息，money是泰国站充值申请金额，当前仅泰国站有作用",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["coinId", "Long", "充值币种"],
                ["money", "Double", "充值金额,泰国站申请金额"]
            ]
        }
        ,
        # 接口13
        {
            "method": "POST",
            "path": "/v1/legal/switch-config",
            "desc": "币种开放充值、提现配置",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["coinCode", "String", "币种code"]
            ]
        }
    ]
}
