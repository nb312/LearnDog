
package com.haoyong.szzc.network.controller.auth.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：2.忘记密码，校验验证码
 */
public class ForgetCheckParam {

  
/**
* 用户名
*/
private String username;


/**
* 验证码
*/
private String code;


public void setUsername(String username){
this.username = username;
}

public String getUsername(){
 return this.username;
}

public void setCode(String code){
this.code = code;
}

public String getCode(){
 return this.code;
}


}

