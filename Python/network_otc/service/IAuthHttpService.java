package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.auth.item.LoginItem;
import coin.otc.com.network.controller.auth.item.RegisterItem;
import coin.otc.com.network.controller.auth.item.TicketItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:False
 * 接口说明:认证相关接口
 */
 public interface IAuthHttpService{
     
/**
* @param idenKey key
* @param password 密码
* @param type 操作类型：1找回登录密码，2找回资金密码
* @return 3.找回密码提交
*/
@GET("auth/forget-commit")
Observable<BaseResponseItem<String>> forgetCommit(
@Query("idenKey") String idenKey
,@Query("password") String password
,@Query("type") int type
);




/**
* @param email 注册邮箱地址
* @param type 操作类型：1找回登录密码，2找回资金密码
* @return 1.忘记密码请求接口
*/
@POST("auth/forget-request")
Observable<BaseResponseItem<String>> forgetRequest(
@Query("email") String email
,@Query("type") int type
);




/**
* @param niceName 用户名,注册时必填,登录时该字段没有用,传空字符串即可
* @param username 邮箱
* @param password 密码
* @param deviceId 设备唯一表示，一般取推送平台token
* @param deviceType 设备类型：{0:iphone,1:android,2:ios-p,3:pc}
* @param deviceInfo 设备信息
* @return 登录接口
*/
@POST("auth/login")
Observable<BaseResponseItem<LoginItem>> login(
@Query("niceName") String niceName
,@Query("username") String username
,@Query("password") String password
,@Query("deviceId") String deviceId
,@Query("deviceType") int deviceType
,@Query("deviceInfo") String deviceInfo
);




/**
* @return 登出接口
*/
@POST("auth/logout")
Observable<BaseResponseItem<String>> logout();




/**
* @param niceName 用户名,注册时必填,登录时该字段没有用,传空字符串即可
* @param username 邮箱
* @param password 密码
* @param deviceId 设备唯一表示，一般取推送平台token
* @param deviceType 设备类型：{0:iphone,1:android,2:ios-p,3:pc}
* @param deviceInfo 设备信息
* @return 注册接口
*/
@POST("auth/register")
Observable<BaseResponseItem<RegisterItem>> register(
@Query("niceName") String niceName
,@Query("username") String username
,@Query("password") String password
,@Query("deviceId") String deviceId
,@Query("deviceType") int deviceType
,@Query("deviceInfo") String deviceInfo
);




/**
* @return 获取请求code
*/
@GET("auth/req-code")
Observable<BaseResponseItem<String>> reqCode();




/**
* @param ticket TGT
* @param service 请求的服务,可不填,后期拓展用
* @return 获取服务调用凭证接口
*/
@POST("auth/ticket")
Observable<BaseResponseItem<TicketItem>> ticket(
@Query("ticket") String ticket
,@Query("service") String service
);




 }
