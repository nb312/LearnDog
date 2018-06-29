
package com.haoyong.szzc.network.controller.auth.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：3.忘记密码，提交密码修改
 */
public class ForgetOverParam {

  
/**
* 密码
*/
private String password;


/**
* 唯一标识
*/
private String id;


public void setPassword(String password){
this.password = password;
}

public String getPassword(){
 return this.password;
}

public void setId(String id){
this.id = id;
}

public String getId(){
 return this.id;
}


}

