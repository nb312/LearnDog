
package coin.otc.com.network.controller.index.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：用户主页获取用户基础信息 web端的不管
 */
public class UserCenterParam {

  
/**
* 用户id
*/
private long userId;


/**
* 登录后获取的ST,未登录就不要传
*/
private String st;


public void setUserId(long userId){
this.userId = userId;
}

public long getUserId(){
 return this.userId;
}

public void setSt(String st){
this.st = st;
}

public String getSt(){
 return this.st;
}


}

