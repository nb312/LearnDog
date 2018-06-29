
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：根据国家地区发送手机验证码
 */
public class SendSmsCodeByCountryParam {

  
/**
* 国家地区code
*/
private String countryCode;


/**
* 手机号
*/
private String phone;


/**
* 业务code:2绑定手机,3解绑手机
*/
private int businessCode;


public void setCountryCode(String countryCode){
this.countryCode = countryCode;
}

public String getCountryCode(){
 return this.countryCode;
}

public void setPhone(String phone){
this.phone = phone;
}

public String getPhone(){
 return this.phone;
}

public void setBusinessCode(int businessCode){
this.businessCode = businessCode;
}

public int getBusinessCode(){
 return this.businessCode;
}


}

