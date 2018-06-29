
package coin.otc.com.network.controller.auth.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：1.忘记密码请求接口
 */
public class ForgetRequestParam {

  
/**
* 注册邮箱地址
*/
private String email;


/**
* 操作类型：1找回登录密码，2找回资金密码
*/
private int type;


public void setEmail(String email){
this.email = email;
}

public String getEmail(){
 return this.email;
}

public void setType(int type){
this.type = type;
}

public int getType(){
 return this.type;
}


}

