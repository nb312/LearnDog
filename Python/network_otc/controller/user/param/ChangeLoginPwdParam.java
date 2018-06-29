
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：修改登录密码
 */
public class ChangeLoginPwdParam {

  
/**
* 原登录密码
*/
private String oldPwd;


/**
* 新登录密码
*/
private String newPwd;


/**
* 邮箱验证码
*/
private String code;


public void setOldPwd(String oldPwd){
this.oldPwd = oldPwd;
}

public String getOldPwd(){
 return this.oldPwd;
}

public void setNewPwd(String newPwd){
this.newPwd = newPwd;
}

public String getNewPwd(){
 return this.newPwd;
}

public void setCode(String code){
this.code = code;
}

public String getCode(){
 return this.code;
}


}

