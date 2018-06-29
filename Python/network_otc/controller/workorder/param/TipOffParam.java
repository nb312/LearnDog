
package coin.otc.com.network.controller.workorder.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：举报
 */
public class TipOffParam {

  
/**
* 广告id
*/
private long advertiseId;


/**
* 举报内容
*/
private String content;


/**
* 附件,多附件文件路径以逗号隔开
*/
private String fileStr;


/**
* 请求code
*/
private String requestCode;


public void setAdvertiseId(long advertiseId){
this.advertiseId = advertiseId;
}

public long getAdvertiseId(){
 return this.advertiseId;
}

public void setContent(String content){
this.content = content;
}

public String getContent(){
 return this.content;
}

public void setFileStr(String fileStr){
this.fileStr = fileStr;
}

public String getFileStr(){
 return this.fileStr;
}

public void setRequestCode(String requestCode){
this.requestCode = requestCode;
}

public String getRequestCode(){
 return this.requestCode;
}


}

