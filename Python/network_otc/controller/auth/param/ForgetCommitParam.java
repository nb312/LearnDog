
package coin.otc.com.network.controller.auth.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：3.找回密码提交
 */
public class ForgetCommitParam {

  
/**
* key
*/
private String idenKey;


/**
* 密码
*/
private String password;


/**
* 操作类型：1找回登录密码，2找回资金密码
*/
private int type;


public void setIdenKey(String idenKey){
this.idenKey = idenKey;
}

public String getIdenKey(){
 return this.idenKey;
}

public void setPassword(String password){
this.password = password;
}

public String getPassword(){
 return this.password;
}

public void setType(int type){
this.type = type;
}

public int getType(){
 return this.type;
}


}

