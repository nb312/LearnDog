package com.haoyong.szzc.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;
import com.haoyong.szzc.network.controller.auth.item.ForgetCheckItem;

import com.haoyong.szzc.network.controller.auth.item.ForgetOverItem;


import com.haoyong.szzc.network.controller.auth.item.LoginItem;


import com.haoyong.szzc.network.controller.auth.item.RegisterItem;

import com.haoyong.szzc.network.controller.auth.item.TicketItem;



/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 认证相关接口
 */

public interface AuthModelInter extends BaseModelInter {
    
     
/**
*@param username 用户名 
*@param code 验证码 
*@return 2.忘记密码，校验验证码
*/
Subscription forgetCheck(String username,
String code,
 BaseSubscriberImpl<BaseResponseItem<ForgetCheckItem>> subscriber);


/**
*@param password 密码 
*@param id 唯一标识 
*@return 3.忘记密码，提交密码修改
*/
Subscription forgetOver(String password,
String id,
 BaseSubscriberImpl<BaseResponseItem<ForgetOverItem>> subscriber);


/**
*@param username 用户名 
*@return 1.忘记密码请求接口
*/
Subscription forgetRequest(String username,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param username 登录名：邮箱或手机 
*@param password 密码 
*@param deviceId 设备唯一表示，一般取推送平台token 
*@param deviceType 设备类型：{0:iphone,1:android,2:ios-p,3:pc} 
*@param deviceInfo 设备信息 
*@param googleCode 谷歌验证码 
*@param refereeCode 邀请码 
*@return 登录接口
*/
Subscription login(String username,
String password,
String deviceId,
int deviceType,
String deviceInfo,
String googleCode,
String refereeCode,
 BaseSubscriberImpl<BaseResponseItem<LoginItem>> subscriber);


/**
*@return 登出接口
*/
Subscription logout( BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param username 登录名：邮箱或手机 
*@param password 密码 
*@param deviceId 设备唯一表示，一般取推送平台token 
*@param deviceType 设备类型：{0:iphone,1:android,2:ios-p,3:pc} 
*@param deviceInfo 设备信息 
*@param googleCode 谷歌验证码 
*@param refereeCode 邀请码 
*@return 注册接口
*/
Subscription register(String username,
String password,
String deviceId,
int deviceType,
String deviceInfo,
String googleCode,
String refereeCode,
 BaseSubscriberImpl<BaseResponseItem<RegisterItem>> subscriber);


/**
*@param ticket TGT 
*@param service 请求的服务,可不填,后期拓展用 
*@return 获取服务调用凭证接口
*/
Subscription ticket(String ticket,
String service,
 BaseSubscriberImpl<BaseResponseItem<TicketItem>> subscriber);



}
