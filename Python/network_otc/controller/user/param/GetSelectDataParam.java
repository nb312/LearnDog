
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：获取下拉框数据
 */
public class GetSelectDataParam {

  
/**
* 获取系统指定的下拉框数据，1身份认证-证件类型；2银行卡认证-银行名称；3国家地区
*/
private String type;


public void setType(String type){
this.type = type;
}

public String getType(){
 return this.type;
}


}

