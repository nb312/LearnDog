{
    "group": "FileUpload",
    "desc": "文件上传相关接口",
    "file": True,
    "func": [
        # 接口1
        {
            "method": "POST",
            "path": "v1/file/img-upload",
            "desc": "上传业务图片",
            "isList": False,
            "hasJsonBody": True,
            "params": [
                ["file", "String", "isFile"],
                ["code", "String", "上传业务类型"]
            ]
        }
    ]
}
