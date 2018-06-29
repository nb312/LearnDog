package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.user.item.BaseInfoItem;
import coin.otc.com.network.controller.user.item.CreateGoogleCodeItem;
import coin.otc.com.network.controller.user.item.DetailItem;
import coin.otc.com.network.controller.user.item.GetSelectDataItem;
import coin.otc.com.network.controller.user.item.GetUserGoogleAuthItem;
import coin.otc.com.network.controller.user.item.GoogleRuleItem;
import coin.otc.com.network.controller.user.item.InvitAuthListItem;
import coin.otc.com.network.controller.user.item.LastLoginLogItem;
import coin.otc.com.network.controller.user.item.LoginLogItem;
import coin.otc.com.network.controller.user.item.RealInfoItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:用户相关接口
 */
 public interface IUserHttpService{
     
/**
* @return 获取用户基本信息
*/
@POST("user/base-info")
Observable<BaseResponseItem<BaseInfoItem>> baseInfo();




/**
* @param email 邮箱
* @param code 验证码
* @return 绑定邮箱
*/
@POST("user/bindEmail")
Observable<BaseResponseItem<String>> bindEmail(
@Query("email") String email
,@Query("code") String code
);




/**
* @param code google验证码
* @param emailCode 邮箱验证码
* @return 绑定谷歌验证器
*/
@POST("user/bindGoogleCode")
Observable<BaseResponseItem<String>> bindGoogleCode(
@Query("code") String code
,@Query("emailCode") String emailCode
);




/**
* @param countryCode 国际电话区号
* @param phone 手机号
* @param code 短信验证码
* @return 绑定新手机号
*/
@POST("user/bindNewPhone")
Observable<BaseResponseItem<String>> bindNewPhone(
@Query("countryCode") String countryCode
,@Query("phone") String phone
,@Query("code") String code
);




/**
* @param countryCode 国家地区code
* @param phone 手机号
* @param code 短信验证码
* @return 绑定手机号
*/
@POST("user/bindPhone")
Observable<BaseResponseItem<String>> bindPhone(
@Query("countryCode") String countryCode
,@Query("phone") String phone
,@Query("code") String code
);




/**
* @param oldPwd 原登录密码
* @param newPwd 新登录密码
* @param code 邮箱验证码
* @return 修改登录密码
*/
@POST("user/changeLoginPwd")
Observable<BaseResponseItem<String>> changeLoginPwd(
@Query("oldPwd") String oldPwd
,@Query("newPwd") String newPwd
,@Query("code") String code
);




/**
* @param oldPwd 原资金密码
* @param newPwd 新资金密码
* @param code 邮箱验证码
* @return 修改资金密码
*/
@POST("user/changeTradePwd")
Observable<BaseResponseItem<String>> changeTradePwd(
@Query("oldPwd") String oldPwd
,@Query("newPwd") String newPwd
,@Query("code") String code
);




/**
* @param code 验证码
* @return 修改绑定手机时，检查原手机验证码
*/
@POST("user/checkOldPhoneCode")
Observable<BaseResponseItem<String>> checkOldPhoneCode(
@Query("code") String code
);




/**
* @return 生成谷歌验证器
*/
@GET("user/createGoogleCode")
Observable<BaseResponseItem<CreateGoogleCodeItem>> createGoogleCode();




/**
* @return 获取邀请好友链接
*/
@GET("user/createInvitLink")
Observable<BaseResponseItem<String>> createInvitLink();




/**
* @return 用户详情
*/
@GET("user/detail")
Observable<BaseResponseItem<DetailItem>> detail();




/**
* @return 查看KYC拒绝原因
*/
@GET("user/getRejectReason")
Observable<BaseResponseItem<String>> getRejectReason();




/**
* @param type 获取系统指定的下拉框数据，1身份认证-证件类型；2银行卡认证-银行名称；3国家地区
* @return 获取下拉框数据
*/
@GET("user/getSelectData")
Observable<BaseResponseItem<List<GetSelectDataItem>>> getSelectData(
@Query("type") String type
);




/**
* @param code google验证码
* @return 查看谷歌验证器
*/
@GET("user/getUserGoogleAuth")
Observable<BaseResponseItem<GetUserGoogleAuthItem>> getUserGoogleAuth(
@Query("code") String code
);




/**
* @return 获取用户姓名
*/
@GET("user/getUserRealName")
Observable<BaseResponseItem<String>> getUserRealName();




/**
* @return 查看谷歌验证规则
*/
@GET("user/google/rule")
Observable<BaseResponseItem<GoogleRuleItem>> googleRule();




/**
* @param rule 规则类型:1添加提币地址规则,2登录规则
* @param isOpen 是否开启:false否、true是
* @return 修改谷歌验证规则
*/
@POST("user/google/updateRule")
Observable<BaseResponseItem<String>> updateRule(
@Query("rule") int rule
,@Query("isOpen") boolean isOpen
);




/**
* @param rule 规则类型:1添加提币地址规则,2登录规则
* @param isOpen 是否开启:false否、true是
* @return 获取邀请的好友认证信息
*/
@GET("user/invitAuthList")
Observable<BaseResponseItem<InvitAuthListItem>> invitAuthList(
@Query("rule") int rule
,@Query("isOpen") boolean isOpen
);




/**
* @return 最后一次登录信息
*/
@GET("user/lastLoginLog")
Observable<BaseResponseItem<LastLoginLogItem>> lastLoginLog();




/**
* @param offset 当前页起始行
* @param limit 每页显示的记录条数
* @return 获取用户登录日志
*/
@GET("user/login/log")
Observable<BaseResponseItem<LoginLogItem>> loginLog(
@Query("offset") long offset
,@Query("limit") long limit
);




/**
* @return 再次发送激活邮件
*/
@GET("user/reSendActiveLink")
Observable<BaseResponseItem<String>> reSendActiveLink();




/**
* @return 用户认证信息
*/
@GET("user/real-info")
Observable<BaseResponseItem<RealInfoItem>> realInfo();




/**
* @param identityType 证件类型
* @param firstName 名字,非身份证时,姓,名拆分存,此字段必填,反之可为空
* @param familyName 姓氏,证件类型为身份证时，姓名都放在此字段中
* @param region 国家地区
* @param identityNo 身份证号
* @param identityOnurl 证件正面照片
* @param identityOffurl 证件反面照片,证件类型为身份证时,必填
* @param identityHoldurl 证件手持照片
* @return 实名认证
*/
@POST("user/realName")
Observable<BaseResponseItem<String>> realName(
@Query("identityType") String identityType
,@Query("firstName") String firstName
,@Query("familyName") String familyName
,@Query("region") String region
,@Query("identityNo") String identityNo
,@Query("identityOnurl") String identityOnurl
,@Query("identityOffurl") String identityOffurl
,@Query("identityHoldurl") String identityHoldurl
);




/**
* @return 个人中心
*/
@POST("user/self-center")
Observable<BaseResponseItem<String>> selfCenter();




/**
* @param email 邮箱
* @return 绑定邮箱
*/
@GET("user/sendBindEmailCode")
Observable<BaseResponseItem<String>> sendBindEmailCode(
@Query("email") String email
);




/**
* @param type 操作类型:6修改密码,7修改资金密码,24绑定google,25设置资金密码
* @return 发送邮箱验证码
*/
@GET("user/sendEmailVerCode")
Observable<BaseResponseItem<String>> sendEmailVerCode(
@Query("type") int type
);




/**
* @param countryCode 国家地区code
* @param phone 手机号
* @param businessCode 业务code:2绑定手机,3解绑手机
* @return 根据国家地区发送手机验证码
*/
@GET("user/sendSmsCodeByCountry")
Observable<BaseResponseItem<String>> sendSmsCodeByCountry(
@Query("countryCode") String countryCode
,@Query("phone") String phone
,@Query("businessCode") int businessCode
);




/**
* @param type 操作类型:2绑定手机,24绑定google,3解绑手机
* @return 发送短信验证码
*/
@GET("user/sendSmsVerCode")
Observable<BaseResponseItem<String>> sendSmsVerCode(
@Query("type") int type
);




/**
* @param pwd 新资金密码
* @param code 邮箱验证码
* @return 设置资金密码
*/
@POST("user/setTradePwd")
Observable<BaseResponseItem<String>> setTradePwd(
@Query("pwd") String pwd
,@Query("code") String code
);




 }
