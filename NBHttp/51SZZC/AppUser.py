{
    "group": "AppUser",
    "desc": "用户相关接口",
    "func": [
        # 接口1
        {
            "method": "POST",
            "path": "/v1/user/bankCardVer",
            "desc": "银行卡认证",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["coinId", "Long", "法币id"],
                ["bankFile", "String", "银行文件"],
                ["bankName", "String", "银行名称"],
                ["bankNumber", "String", "银行账号"],
                ["address", "String", "银行地址"],
                ["code", "String", "验证码"],
                ["bankCountry", "String", "银行所在国家"],
                ["swiftCode", "String", "银行国际代码"],
                ["beneficiaryName", "String", "收款人姓名"],
                ["beneficiaryAddress", "String", "收款人地址"],
                ["coinCode", "String", "法币code"],
                ["postcode", "String", "邮政编码"]
            ]
        }
        ,
        # 接口2
        {
            "method": "POST",
            "path": "/v1/user/bindEmail",
            "desc": "输入邮箱、验证码进行绑定",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["email", "String", "邮箱"],
                ["code", "String", "短信验证码"]
            ]
        }
        ,
        # 接口3
        {
            "method": "POST",
            "path": "/v1/user/bindGoogleCode",
            "desc": "根据在手机端输入的验证码，绑定google验证器",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["code", "String", "google验证码"],
                ["emailCode", "String", "邮箱验证码"]
            ]
        }
        ,
        # 接口4
        {
            "method": "POST",
            "path": "/v1/user/changeLoginPwd",
            "desc": "输入原登录密码、新密码进行修改",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["oldPwd", "String", "原登录密码"],
                ["newPwd", "String", "新登录密码"],
                ["code", "String", "邮箱验证码"]
            ]
        }
        ,
        # 接口5
        {
            "method": "GET",
            "path": "/v1/user/createGoogleCode",
            "desc": "点击google认证，生成谷歌验证器",
            "isList": False,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口6
        {
            "method": "GET",
            "path": "/v1/user/createInvitLink",
            "desc": "获取邀请好友链接",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }
        ,
        # 接口7
        {
            "method": "GET",
            "path": "/v1/user/detail",
            "desc": "获取用户详细信息",
            "isList": False,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口8
        {
            "method": "POST",
            "path": "/v1/user/enterprise-auth",
            "desc": "企业帐号认证",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["firstName", "String", "名字"],
                ["familyName", "String", "姓氏"],
                ["region", "String", "国家地区"],
                ["identityNo", "String", "身份证号"],
                ["identityOnurl", "String", "证件正面照片"],
                ["identityHoldurl", "String", "证件手持照片"],
                ["companyName", "String", "公司名称"],
                ["regNumber", "String", "注册登记证号"],
                ["accountAgreenmentUrl", "String", "注册协议文件url"],
                ["passbookHomeUrl", "String", "公司帐号流水或存折首页照片"],
                ["phoneAreaCode", "String", "董事电话区号"],
                ["phoneNumber", "String", "董事电话"],
                ["directorEmail", "String", "董事邮箱"]
            ]
        }
        ,
        # 接口9
        {
            "method": "GET",
            "path": "/v1/user/getCommissionInfo",
            "desc": "获取佣金数据, activityState为true时表示活动进行中显示活动时间，否则显示“长期有效",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }
        ,
        # 接口10
        {
            "method": "GET",
            "path": "/v1/user/getInviteInfo",
            "desc": "获取邀请好友链接",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }
        ,
        # 接口11
        {
            "method": "GET",
            "path": "/v1/user/getInviteQRImage",
            "desc": "好友邀请二维码图片",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["width", "Int", "二维码图片宽度,默认200px"],
                ["height", "Int", "二维码图片高度,默认200px"]
            ]
        }
        ,
        # 接口12
        {
            "method": "GET",
            "path": "/v1/user/getRejectReason",
            "desc": "查看KYC拒绝原因",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }

        ,
        # 接口13
        {
            "method": "GET",
            "path": "/v1/user/getSelectData",
            "desc": "获取系统指定的下拉框数据，1身份认证-证件类型；2银行卡认证-银行名称；3国家地区",
            "isList": True,
            "hasJsonBody": True,
            "params": [
                ["type", "String", "数据类型"]
            ]
        }
        ,
        # 接口14
        {
            "method": "GET",
            "path": "/v1/user/getUserBank",
            "desc": "获取用户银行卡",
            "isList": True,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口15
        {
            "method": "GET",
            "path": "/v1/user/getUserGoogleAuth",
            "desc": "点击google查看之后，输入google验证码查看详细信息",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["code", "String", "google验证码"]
            ]
        }
        ,
        # 接口16
        {
            "method": "GET",
            "path": "/v1/user/getUserRealName",
            "desc": "获取用户姓名",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }
        ,
        # 接口17
        {
            "method": "GET",
            "path": "/v1/user/google-rule",
            "desc": "查看用户谷歌验证规则",
            "isList": False,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口18
        {
            "method": "POST",
            "path": "/v1/user/google-update-rule",
            "desc": "获取邀请好友链接",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["rule", "Int", "规则类型:1添加提币地址规则,2登录规则,3交易规则"],
                ["isOpen", "Boolean", "是否开启:false否、true是"]
            ]
        }
        ,
        # 接口19
        {
            "method": "GET",
            "path": "/v1/user/invitAuthList",
            "desc": "获取邀请的好友认证信息",
            "isList": False,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口20
        {
            "method": "GET",
            "path": "/v1/user/kyc-info",
            "desc": "查看KYC信息",
            "isList": False,
            "hasJsonBody": True,
            "params": [
            ]
        }
        ,
        # 接口21
        {
            "method": "GET",
            "path": "/v1/user/lastLoginLog",
            "desc": "最后一次登录信息",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }
        ,
        # 接口22
        {
            "method": "GET",
            "path": "/v1/user/listCommission",
            "desc": "分页显示用户佣金列表",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["offset", "Int", "当前页起始行"],
                ["limit", "Int", "每页显示的记录条数"]
            ]
        }
        ,
        # 接口23
        {
            "method": "GET",
            "path": "/v1/user/login/log",
            "desc": "分页获取用户的登录日志",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["offset", "Int", "当前页起始行"],
                ["limit", "Int", "每页显示的记录条数"]
            ]
        }
        ,
        # 接口24
        {
            "method": "GET",
            "path": "/v1/user/reSendActiveLink",
            "desc": "未激活用户登录后，点击再次发送，获取激活链接",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }
        ,
        # 接口25
        {
            "method": "POST",
            "path": "/v1/user/realName",
            "desc": "实名认证",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["firstName", "String", "名字"],
                ["familyName", "String", "姓氏"],
                ["region", "String", "国家地区"],
                ["identityType", "String", "证件类型:01身份证，02驾照，03护照"],
                ["identityNo", "String", "证件号"],
                ["identityOnurl", "String", "证件正面照片"],
                ["identityOffurl", "String", "证件反面照片"],
                ["identityHoldurl", "String", "证件手持照片"]
            ]
        }
        ,
        # 接口26
        {
            "method": "GET",
            "path": "/v1/user/sendBindCardCode",
            "desc": "绑定银行卡时，发送邮件验证码",
            "isList": False,
            "hasJsonBody": False,
            "params": [
            ]
        }
        ,
        # 接口27
        {
            "method": "GET",
            "path": "/v1/user/sendBindEmailCode",
            "desc": "绑定邮箱时发送邮箱验证码",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["email", "String", "邮箱"]
            ]
        }
        ,
        # 接口28
        {
            "method": "GET",
            "path": "/v1/user/sendVerCode",
            "desc": "发送验证码",
            "isList": False,
            "hasJsonBody": False,
            "params": [
                ["type", "Int", "操作类型:6修改密码,24绑定google"]
            ]
        }
    ]
}
