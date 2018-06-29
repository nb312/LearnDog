
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：修改绑定手机时，检查原手机验证码
 */
public class CheckOldPhoneCodeParam {

  
/**
* 验证码
*/
private String code;


public void setCode(String code){
this.code = code;
}

public String getCode(){
 return this.code;
}


}

