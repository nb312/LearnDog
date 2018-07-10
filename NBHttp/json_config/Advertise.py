{
    "group": "advertise",
    "v1": True,
    "desc": "我的广告列表",
    "func": [
        # 接口1
        {
            "method": "POST",
            "path": "advertise/calcPrice",
            "desc": "发布广告时，计算价格",
            "hasItem": True,
            "isList": False,
            "params": [
                ["exchangeId", "long", "交易所id"],
                ["coinId", "long", "币种id"],
                ["currency", "String", "货币"],
                ["premium", "double", "溢价"]
            ]
        }
        ,
        # 接口2
        {
            "method": "POST",
            "path": "advertise/close",
            "desc": "关闭广告",
            "hasItem": False,
            "isList": False,
            "params": [
                ["id", "long", "广告id"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "advertise/delete",
            "desc": "删除广告",
            "hasItem": False,
            "isList": False,
            "params": [
                ["id", "long", "广告id"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "advertise/get",
            "desc": "进入编辑页，获取广告信息",
            "hasItem": True,
            "isList": False,
            "params": [
                ["id", "long", "广告id"]
            ]
        }
        ,
        # 接口5
        {
            "method": "GET",
            "path": "advertise/listMyAd",
            "desc": "我的广告列表：包含全部、进行中、已关闭，用参数type区分",
            "hasItem": True,
            "isList": False,
            "params": [
                ["offset", "long", "当前页起始行"],
                ["limit", "long", "每页显示的记录条数"],
                ["type", "int", "列表类型：不传表示全部，1进行中，2已关闭"],
                ["coinId", "long", "币种id"],
                ["entrustType", "int", "广告类型：0买，1卖"],
            ]
        }
        ,
        # 接口6
        {
            "method": "POST",
            "path": "advertise/newAd",
            "desc": "发布广告",
            "hasItem": True,
            "isList": False,
            "params": [
                ["id", "long", "编辑广告时,必填"],
                ["entrustType", "int", "交易类型：0在线购买，1在线出售"],
                ["coinId", "long", "币种ID"],
                ["country", "String", "国家地区"],
                ["currency", "String", "货币"],
                ["payProvider", "long", "收款方式"],
                ["payProviderName", "String", "收款方式名称，当payProvider为其它时，此项必填"],
                ["message", "String", "交易条款"],
                ["premium", "double", "溢价,百分比格式，当非固定价格时，此项必填"],
                ["formula", "String", "计价公式，当非固定价格时，此项必填"],
                ["exchangeId", "int", "交易所ID，当非固定价格时，此项必填"],
                ["price", "double", "价格"],
                ["minAmount", "double", "最小限额"],
                ["maxAmount", "double", "最大限额"],
                ["payMinute", "int", "付款期限，仅在线购买时有此值"],
                ["isNew", "boolean", "是否是新发布广告, true新发布,false编辑"],
                ["fixedPrice", "boolean", "是否固定价格"],
                ["limitAuth", "boolean", "仅限身份验证人员"],
                ["limitTrusted", "boolean", "仅限受信任的交易者"],
                ["limitPhone", "boolean", "仅限手机验证人员"],
                ["openTimeJsonStr", "String", "开放时间Json字符串格式,id主键id(编辑时必填), week星期, startTime、endTime可以为空，为空时，默认全天开放"],
                ["requestCode", "String", "请求code"]
            ]
        }
        ,
        # 接口7
        {
            "method": "POST",
            "path": "advertise/open",
            "desc": "开启广告",
            "hasItem": False,
            "isList": False,
            "params": [
                ["id", "long", "广告id"]
            ]
        }
        ,
        # 接口8
        {
            "method": "POST",
            "path": "advertise/update-vacation-status-test",
            "desc": "广告设置 app没有用到 并且我update-vacation-status改为了update-vacation-status-test",
            "hasItem": False,
            "isList": False,
            "params": [
                ["buyVacation", "boolean", "买家是否休假 默认true"],
                ["sellVacation", "boolean", "卖家是否休假 默认false"]
            ]
        }
        ,
        # 接口9
        {
            "method": "POST",
            "path": "advertise/updateVacationStatus",
            "desc": "广告设置",
            "hasItem": False,
            "isList": False,
            "params": [
                ["vacation", "boolean", "是否休假 默认true"],
                ["entrustType", "int", "交易类型"]
            ]
        }
        ,
        # 接口10
        {
            "method": "GET",
            "path": "advertise/userAd",
            "desc": "用户主页：发布的广告",
            "hasItem": True,
            "isList": False,
            "params": [
                ["offset", "long", "当前页起始行"],
                ["limit", "long", "每页显示的记录条数"],
                ["userId", "long", "用户id"],
                ["entrustType", "int", "广告类型：0购买、1出售"]
            ]
        }
    ]
}
