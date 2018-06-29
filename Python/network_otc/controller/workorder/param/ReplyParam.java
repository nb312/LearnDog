
package coin.otc.com.network.controller.workorder.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：回复工单
 */
public class ReplyParam {

  
/**
* 工单id
*/
private long id;


/**
* 回复内容
*/
private String content;


/**
* 附件,多附件文件路径以逗号隔开
*/
private String fileStr;


public void setId(long id){
this.id = id;
}

public long getId(){
 return this.id;
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


}

