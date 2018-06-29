
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：绑定谷歌验证器
 */
public class BindGoogleCodeParam {

  
/**
* google验证码
*/
private String code;


/**
* 邮箱验证码
*/
private String emailCode;


public void setCode(String code){
this.code = code;
}

public String getCode(){
 return this.code;
}

public void setEmailCode(String emailCode){
this.emailCode = emailCode;
}

public String getEmailCode(){
 return this.emailCode;
}


}

