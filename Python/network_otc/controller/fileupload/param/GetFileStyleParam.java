
package coin.otc.com.network.controller.fileupload.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：kyc图片水印处理
 */
public class GetFileStyleParam {

  
/**
* 文件url
*/
private String fileUrl;


/**
* 上传业务类型，1banner，2kyc图片,不传，默认为2
*/
private String code;


public void setFileUrl(String fileUrl){
this.fileUrl = fileUrl;
}

public String getFileUrl(){
 return this.fileUrl;
}

public void setCode(String code){
this.code = code;
}

public String getCode(){
 return this.code;
}


}

