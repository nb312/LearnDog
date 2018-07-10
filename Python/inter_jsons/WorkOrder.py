{
    "controller": "WorkOrder",
    "v1": True,
    "desc": "工单",
    "func": [
        #接口0
        {
            "method": "GET",
            "path": "work-order/detail",
            "desc":"工单详情",
             "hasItem":True,
             "isList":False,
            "params": [
                ["id", "long", "工单id"]
            ]
        }
        ,
        #接口1
        {
            "method": "GET",
            "path": "work-order/list",
            "desc":"我的工单列表",
             "hasItem":True,
             "isList":False,
            "params": [
                ["offset", "long", "当前页起始行"],
                ["limit", "long", "每页显示的记录条数"]
            ]
        }
        ,
        # 接口2
        {
            "method": "POST",
            "path": "work-order/new",
            "desc": "提交工单",
            "hasItem":False,
            "isList":False,
            "params": [
                ["group", "int", "工单类型:0举报,1反馈,2问题,3咨询,99其它"],
                ["content", "String", "工单内容"],
                ["associateNo", "String", "关联的工单号"],
                ["fileStr", "String", "附件,多附件文件路径以逗号隔开"],
                ["requestCode", "String", "请求code"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "work-order/reply",
            "desc": "回复工单",
            "hasItem":False,
            "isList":False,
            "params": [
                ["id", "long", "工单id"],
                ["content", "String", "回复内容"],
                ["fileStr", "String", "附件,多附件文件路径以逗号隔开"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "work-order/tipOff",
            "desc": "举报",
            "hasItem":False,
            "isList":False,
            "params": [
                ["advertiseId", "long", "广告id"],
                ["content", "String", "举报内容"],
                ["fileStr", "String", "附件,多附件文件路径以逗号隔开"],
                ["requestCode", "String", "请求code"]
            ]
        }
    ]
}