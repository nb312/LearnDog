package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;


import coin.otc.com.network.controller.auth.item.LoginItem;


import coin.otc.com.network.controller.auth.item.RegisterItem;


import coin.otc.com.network.controller.auth.item.TicketItem;



/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 认证相关接口
 */

public interface AuthModelInter extends BaseModelInter {
    
     
/**
*@param idenKey key 
*@param password 密码 
*@param type 操作类型：1找回登录密码，2找回资金密码 
*@return 3.找回密码提交
*/
Subscription forgetCommit(String idenKey,
String password,
int type,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param email 注册邮箱地址 
*@param type 操作类型：1找回登录密码，2找回资金密码 
*@return 1.忘记密码请求接口
*/
Subscription forgetRequest(String email,
int type,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param niceName 用户名,注册时必填,登录时该字段没有用,传空字符串即可 
*@param username 邮箱 
*@param password 密码 
*@param deviceId 设备唯一表示，一般取推送平台token 
*@param deviceType 设备类型：{0:iphone,1:android,2:ios-p,3:pc} 
*@param deviceInfo 设备信息 
*@return 登录接口
*/
Subscription login(String niceName,
String username,
String password,
String deviceId,
int deviceType,
String deviceInfo,
 BaseSubscriberImpl<BaseResponseItem<LoginItem>> subscriber);


/**
*@return 登出接口
*/
Subscription logout( BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param niceName 用户名,注册时必填,登录时该字段没有用,传空字符串即可 
*@param username 邮箱 
*@param password 密码 
*@param deviceId 设备唯一表示，一般取推送平台token 
*@param deviceType 设备类型：{0:iphone,1:android,2:ios-p,3:pc} 
*@param deviceInfo 设备信息 
*@return 注册接口
*/
Subscription register(String niceName,
String username,
String password,
String deviceId,
int deviceType,
String deviceInfo,
 BaseSubscriberImpl<BaseResponseItem<RegisterItem>> subscriber);


/**
*@return 获取请求code
*/
Subscription reqCode( BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param ticket TGT 
*@param service 请求的服务,可不填,后期拓展用 
*@return 获取服务调用凭证接口
*/
Subscription ticket(String ticket,
String service,
 BaseSubscriberImpl<BaseResponseItem<TicketItem>> subscriber);



}
