
package coin.otc.com.network.controller.auth.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：注册接口
 */
public class RegisterParam {

  
/**
* 用户名,注册时必填,登录时该字段没有用,传空字符串即可
*/
private String niceName;


/**
* 邮箱
*/
private String username;


/**
* 密码
*/
private String password;


/**
* 设备唯一表示，一般取推送平台token
*/
private String deviceId;


/**
* 设备类型：{0:iphone,1:android,2:ios-p,3:pc}
*/
private int deviceType;


/**
* 设备信息
*/
private String deviceInfo;


public void setNiceName(String niceName){
this.niceName = niceName;
}

public String getNiceName(){
 return this.niceName;
}

public void setUsername(String username){
this.username = username;
}

public String getUsername(){
 return this.username;
}

public void setPassword(String password){
this.password = password;
}

public String getPassword(){
 return this.password;
}

public void setDeviceId(String deviceId){
this.deviceId = deviceId;
}

public String getDeviceId(){
 return this.deviceId;
}

public void setDeviceType(int deviceType){
this.deviceType = deviceType;
}

public int getDeviceType(){
 return this.deviceType;
}

public void setDeviceInfo(String deviceInfo){
this.deviceInfo = deviceInfo;
}

public String getDeviceInfo(){
 return this.deviceInfo;
}


}

