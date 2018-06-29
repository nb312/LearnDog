
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：发送邮箱验证码
 */
public class SendEmailVerCodeParam {

  
/**
* 操作类型:6修改密码,7修改资金密码,24绑定google,25设置资金密码
*/
private int type;


public void setType(int type){
this.type = type;
}

public int getType(){
 return this.type;
}


}

