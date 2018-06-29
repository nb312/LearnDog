
package coin.otc.com.network.controller.publicad.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：获取下拉框数据
 */
public class MultipleSelectParam {

  
/**
* 数据类型，如果需要多个，则以逗号分割 获取系统指定的下拉框数据，1身份认证-证件类型；2货币；3国家地区；4付款方式；5交易所；6买家申诉原因；7卖家申诉原因
*/
private String type;


public void setType(String type){
this.type = type;
}

public String getType(){
 return this.type;
}


}

