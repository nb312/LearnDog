
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：绑定邮箱
 */
public class BindEmailParam {

  
/**
* 邮箱
*/
private String email;


/**
* 验证码
*/
private String code;


public void setEmail(String email){
this.email = email;
}

public String getEmail(){
 return this.email;
}

public void setCode(String code){
this.code = code;
}

public String getCode(){
 return this.code;
}


}

