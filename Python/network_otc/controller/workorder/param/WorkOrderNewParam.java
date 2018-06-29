
package coin.otc.com.network.controller.workorder.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：提交工单
 */
public class WorkOrderNewParam {

  
/**
* 工单类型:0举报,1反馈,2问题,3咨询,99其它
*/
private int category;


/**
* 工单内容
*/
private String content;


/**
* 关联的工单号
*/
private String associateNo;


/**
* 附件,多附件文件路径以逗号隔开
*/
private String fileStr;


/**
* 请求code
*/
private String requestCode;


public void setCategory(int category){
this.category = category;
}

public int getCategory(){
 return this.category;
}

public void setContent(String content){
this.content = content;
}

public String getContent(){
 return this.content;
}

public void setAssociateNo(String associateNo){
this.associateNo = associateNo;
}

public String getAssociateNo(){
 return this.associateNo;
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

