
package com.haoyong.szzc.network.controller.auth.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：登录接口
 */
public class LoginParam {

  
/**
* 登录名：邮箱或手机
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


/**
* 谷歌验证码
*/
private String googleCode;


/**
* 邀请码
*/
private String refereeCode;


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

public void setGoogleCode(String googleCode){
this.googleCode = googleCode;
}

public String getGoogleCode(){
 return this.googleCode;
}

public void setRefereeCode(String refereeCode){
this.refereeCode = refereeCode;
}

public String getRefereeCode(){
 return this.refereeCode;
}


}

