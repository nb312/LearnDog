
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：设置资金密码
 */
public class SetTradePwdParam {

  
/**
* 新资金密码
*/
private String pwd;


/**
* 邮箱验证码
*/
private String code;


public void setPwd(String pwd){
this.pwd = pwd;
}

public String getPwd(){
 return this.pwd;
}

public void setCode(String code){
this.code = code;
}

public String getCode(){
 return this.code;
}


}

