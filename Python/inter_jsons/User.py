{
    "controller": "user",
    "v1": True,
    "desc": "用户相关接口",
    "func": [
        #接口0
        {
            "method": "POST",
            "path": "user/base-info",
            "desc":"获取用户基本信息",
             "hasItem":True,
             "isList":False,
            "params": []
        }
        ,
        #接口1
        {
            "method": "POST",
            "path": "user/bindEmail",
            "desc":"绑定邮箱",
             "hasItem":False,
             "isList":False,
            "params": [
                ["email", "String", "邮箱"],
                ["code", "String", "验证码"]
            ]
        }
        ,
        # 接口2
        {
            "method": "POST",
            "path": "user/bindGoogleCode",
            "desc": "绑定谷歌验证器",
            "hasItem":False,
            "isList":False,
            "params": [
                ["code", "String", "google验证码"],
                ["emailCode", "String", "邮箱验证码"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "user/bindNewPhone",
            "desc": "绑定新手机号",
            "hasItem":False,
            "isList":False,
            "params": [
                ["countryCode", "String", "国际电话区号"],
                ["phone", "String", "手机号"],
                ["code", "String", "短信验证码"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "user/bindPhone",
            "desc": "绑定手机号",
            "hasItem":False,
            "isList":False,
            "params": [
                ["countryCode", "String", "国家地区code"],
                ["phone", "String", "手机号"],
                ["code", "String", "短信验证码"]
            ]
        }
        ,
        # 接口5
        {
            "method": "POST",
            "path": "user/changeLoginPwd",
            "desc": "修改登录密码",
            "hasItem":False,
            "isList":False,
            "params": [
                ["oldPwd", "String", "原登录密码"],
                ["newPwd", "String", "新登录密码"],
                ["code", "String", "邮箱验证码"]
            ]
        }
        ,
        # 接口6
        {
            "method": "POST",
            "path": "user/changeTradePwd",
            "desc": "修改资金密码",
            "hasItem":False,
            "isList":False,
            "params": [
                ["oldPwd", "String", "原资金密码"],
                ["newPwd", "String", "新资金密码"],
                ["code", "String", "邮箱验证码"]
            ]
        }
        ,
        # 接口7
        {
            "method": "POST",
            "path": "user/checkOldPhoneCode",
            "desc": "修改绑定手机时，检查原手机验证码",
            "hasItem":False,
            "isList":False,
            "params": [
                ["code", "String", "验证码"]
            ]
        }
        ,
        # 接口8
        {
            "method": "GET",
            "path": "user/createGoogleCode",
            "desc": "生成谷歌验证器",
            "hasItem":True,
            "isList":False,
            "params": []
        }
        ,
        # 接口9
        {
            "method": "GET",
            "path": "user/createInvitLink",
            "desc": "获取邀请好友链接",
            "hasItem":False,
            "isList":False,
            "params": [ ]
        }
        ,
        # 接口10
        {
            "method": "GET",
            "path": "user/detail",
            "desc": "用户详情",
            "hasItem":True,
            "isList":False,
            "params": []
        }
        ,
        # 接口11
        {
            "method": "GET",
            "path": "user/getRejectReason",
            "desc": "查看KYC拒绝原因",
            "hasItem":False,
            "isList":False,
            "params": []
        }
        ,
        # 接口12
        {
            "method": "GET",
            "path": "user/getSelectData",
            "desc": "获取下拉框数据",
            "hasItem":True,
            "isList":True,
            "params": [
                ["type", "String", "获取系统指定的下拉框数据，1身份认证-证件类型；2银行卡认证-银行名称；3国家地区"]
            ]
        }
        ,
        # 接口13
        {
            "method": "GET",
            "path": "user/getUserGoogleAuth",
            "desc": "查看谷歌验证器",
            "hasItem":True,
            "isList":False,
            "params": [
                ["code", "String", "google验证码"]
            ]
        }
        ,
        # 接口14
        {
            "method": "GET",
            "path": "user/getUserRealName",
            "desc": "获取用户姓名",
            "hasItem":False,
            "isList":False,
            "params": []
        }
        ,
        # 接口15
        {
            "method": "GET",
            "path": "user/google/rule",
            "desc": "查看谷歌验证规则",
            "hasItem":True,
            "isList":False,
            "params": []
        }
        ,
        # 接口16
        {
            "method": "POST",
            "path": "user/google/updateRule",
            "desc": "修改谷歌验证规则",
            "hasItem":False,
            "isList":False,
            "params": [
                ["rule", "int", "规则类型:1添加提币地址规则,2登录规则"],
                ["isOpen", "boolean", "是否开启:false否、true是"]
            ]
        }
        ,
        # 接口17
        {
            "method": "GET",
            "path": "user/invitAuthList",
            "desc": "获取邀请的好友认证信息",
            "hasItem":True,
            "isList":False,
            "params": [
                ["rule", "int", "规则类型:1添加提币地址规则,2登录规则"],
                ["isOpen", "boolean", "是否开启:false否、true是"]
            ]
        }
        ,
        # 接口18
        {
            "method": "GET",
            "path": "user/lastLoginLog",
            "desc": "最后一次登录信息",
            "hasItem":True,
            "isList":False,
            "params": []
        }
        ,
        # 接口19
        {
            "method": "GET",
            "path": "user/login/log",
            "desc": "获取用户登录日志",
            "hasItem":True,
            "isList":False,
            "params": [
                ["offset", "long", "当前页起始行"],
                ["limit", "long", "每页显示的记录条数"]
            ]
        }
        ,
        # 接口20
        {
            "method": "GET",
            "path": "user/reSendActiveLink",
            "desc": "再次发送激活邮件",
            "hasItem":False,
            "isList":False,
            "params": []
        }
        ,
        # 接口21
        {
            "method": "GET",
            "path": "user/real-info",
            "desc": "用户认证信息",
            "hasItem":True,
            "isList":False,
            "params": []
        }
       ,
        # 接口22
        {
            "method": "POST",
            "path": "user/realName",
            "desc": "实名认证",
            "hasItem":False,
            "isList":False,
            "params": [
                ["identityType", "String", "证件类型"],
                ["firstName", "String", "名字,非身份证时,姓,名拆分存,此字段必填,反之可为空"],
                ["familyName", "String", "姓氏,证件类型为身份证时，姓名都放在此字段中"],
                ["region", "String", "国家地区"],
                ["identityNo", "String", "身份证号"],
                ["identityOnurl", "String", "证件正面照片"],
                ["identityOffurl", "String", "证件反面照片,证件类型为身份证时,必填"],
                ["identityHoldurl", "String", "证件手持照片"]
            ]
        }
        ,
        # 接口23
        {
            "method": "POST",
            "path": "user/self-center",
            "desc": "个人中心",
            "hasItem":False,
            "isList":False,
            "params": []
        }
        ,
        # 接口24
        {
            "method": "GET",
            "path": "user/sendBindEmailCode",
            "desc": "绑定邮箱",
            "hasItem":False,
            "isList":False,
            "params": [
                ["email", "String", "邮箱"]
            ]
        }
        ,
        # 接口25
        {
            "method": "GET",
            "path": "user/sendEmailVerCode",
            "desc": "发送邮箱验证码",
            "hasItem":False,
            "isList":False,
            "params": [
                ["type", "int", "操作类型:6修改密码,7修改资金密码,24绑定google,25设置资金密码"]
            ]
        }
        ,
        # 接口26
        {
            "method": "GET",
            "path": "user/sendSmsCodeByCountry",
            "desc": "根据国家地区发送手机验证码",
            "hasItem":False,
            "isList":False,
            "params": [
                ["countryCode", "String", "国家地区code"],
                ["phone", "String", "手机号"],
                ["businessCode", "int", "业务code:2绑定手机,3解绑手机"]
            ]
        }
        ,
        # 接口27
        {
            "method": "GET",
            "path": "user/sendSmsVerCode",
            "desc": "发送短信验证码",
            "hasItem":False,
            "isList":False,
            "params": [
                ["type", "int", "操作类型:2绑定手机,24绑定google,3解绑手机"]
            ]
        }
        ,
        # 接口28
        {
            "method": "POST",
            "path": "user/setTradePwd",
            "desc": "设置资金密码",
            "hasItem":False,
            "isList":False,
            "params": [
                ["pwd", "String", "新资金密码"],
                ["code", "String", "邮箱验证码"]
            ]
        }
    ]
}