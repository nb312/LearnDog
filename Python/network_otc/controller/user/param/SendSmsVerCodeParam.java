
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：发送短信验证码
 */
public class SendSmsVerCodeParam {

  
/**
* 操作类型:2绑定手机,24绑定google,3解绑手机
*/
private int type;


public void setType(int type){
this.type = type;
}

public int getType(){
 return this.type;
}


}

