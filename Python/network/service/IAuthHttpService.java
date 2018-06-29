package  com.haoyong.szzc.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import com.haoyong.szzc.network.controller.auth.item.ForgetCheckItem;
import com.haoyong.szzc.network.controller.auth.item.ForgetOverItem;
import com.haoyong.szzc.network.controller.auth.item.LoginItem;
import com.haoyong.szzc.network.controller.auth.item.RegisterItem;
import com.haoyong.szzc.network.controller.auth.item.TicketItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:False
 * 接口说明:认证相关接口
 */
 public interface IAuthHttpService{
     
/**
* @param username 用户名
* @param code 验证码
* @return 2.忘记密码，校验验证码
*/
@POST("auth/forget-check")
Observable<BaseResponseItem<ForgetCheckItem>> forgetCheck(
@Query("username") String username
,@Query("code") String code
);




/**
* @param password 密码
* @param id 唯一标识
* @return 3.忘记密码，提交密码修改
*/
@POST("auth/forget-over")
Observable<BaseResponseItem<ForgetOverItem>> forgetOver(
@Query("password") String password
,@Query("id") String id
);




/**
* @param username 用户名
* @return 1.忘记密码请求接口
*/
@POST("auth/forget-request")
Observable<BaseResponseItem<String>> forgetRequest(
@Query("username") String username
);




/**
* @param username 登录名：邮箱或手机
* @param password 密码
* @param deviceId 设备唯一表示，一般取推送平台token
* @param deviceType 设备类型：{0:iphone,1:android,2:ios-p,3:pc}
* @param deviceInfo 设备信息
* @param googleCode 谷歌验证码
* @param refereeCode 邀请码
* @return 登录接口
*/
@POST("auth/login")
Observable<BaseResponseItem<LoginItem>> login(
@Query("username") String username
,@Query("password") String password
,@Query("deviceId") String deviceId
,@Query("deviceType") int deviceType
,@Query("deviceInfo") String deviceInfo
,@Query("googleCode") String googleCode
,@Query("refereeCode") String refereeCode
);




/**
* @return 登出接口
*/
@POST("auth/logout")
Observable<BaseResponseItem<String>> logout();




/**
* @param username 登录名：邮箱或手机
* @param password 密码
* @param deviceId 设备唯一表示，一般取推送平台token
* @param deviceType 设备类型：{0:iphone,1:android,2:ios-p,3:pc}
* @param deviceInfo 设备信息
* @param googleCode 谷歌验证码
* @param refereeCode 邀请码
* @return 注册接口
*/
@POST("auth/register")
Observable<BaseResponseItem<RegisterItem>> register(
@Query("username") String username
,@Query("password") String password
,@Query("deviceId") String deviceId
,@Query("deviceType") int deviceType
,@Query("deviceInfo") String deviceInfo
,@Query("googleCode") String googleCode
,@Query("refereeCode") String refereeCode
);




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
