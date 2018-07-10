{
    "controller": "FileUpload",
    "v1": True,
    "desc": "文件上传相关接口",
    "func": [
        #接口1
        {
            "method": "POST",
            "path": "file/avatar-app",
            "desc":"上传用户头像-app专用"
            ,
             "hasItem":False,
             "isList":False,
            "params": [
                ["file", "String", "文件url"]
            ]
        }
        ,
        # 接口2
        {
            "method": "POST",
            "path": "file/avatar-img",
            "desc": "上传用户头像",
            "hasItem":True,
            "isList":False,
            "params": [
                ["file", "String", "file-Url"]
            ]
        }
        ,
        # 接口3
        {
            "method": "GET",
            "path": "file/getFileSts",
            "desc": "文件上传时，获取临时授权sts",
            "hasItem":True,
            "isList":False,
            "params": []
        }
        ,
        # 接口4
        {
            "method": "GET",
            "path": "file/getFileStyle",
            "desc": "kyc图片水印处理",
            "hasItem":True,
            "isList":False,
            "params": [
                ["fileUrl", "String", "文件url"],
                ["code", "String", "上传业务类型，1banner，2kyc图片,不传，默认为2"]
            ]
        }
        ,
        # 接口5
        {
            "method": "GET",
            "path": "file/kyc-img",
            "desc": "上传kyc照片",
            "hasItem":True,
            "isList":False,
            "params": [
                ["file", "String", "file文件url"]
            ]
        }
        ,
        # 接口6
        {
            "method": "POST",
            "path": "file/upload",
            "desc": "上传文件",
            "hasItem":False,
            "isList":False,
            "params": [
                ["file", "String", "file文件url"],
                ["group", "int", "类型：9工单文件"],
            ]
        }
    ]
}