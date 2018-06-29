
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：绑定手机号
 */
public class BindPhoneParam {

  
/**
* 国家地区code
*/
private String countryCode;


/**
* 手机号
*/
private String phone;


/**
* 短信验证码
*/
private String code;


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

public void setCode(String code){
this.code = code;
}

public String getCode(){
 return this.code;
}


}

