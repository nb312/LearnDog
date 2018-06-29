
package coin.otc.com.network.controller.virtualaddress.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：修改提币备注
 */
public class RemarkParam {

  
/**
* 提币地址ID
*/
private long id;


/**
* 提币地址备注
*/
private String remark;


public void setId(long id){
this.id = id;
}

public long getId(){
 return this.id;
}

public void setRemark(String remark){
this.remark = remark;
}

public String getRemark(){
 return this.remark;
}


}

