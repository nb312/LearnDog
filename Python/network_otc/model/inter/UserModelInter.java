package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;
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
 * 相应接口: 用户相关接口
 */

public interface UserModelInter extends BaseModelInter {
    
     
/**
*@return 获取用户基本信息
*/
Subscription baseInfo( BaseSubscriberImpl<BaseResponseItem<BaseInfoItem>> subscriber);


/**
*@param email 邮箱 
*@param code 验证码 
*@return 绑定邮箱
*/
Subscription bindEmail(String email,
String code,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param code google验证码 
*@param emailCode 邮箱验证码 
*@return 绑定谷歌验证器
*/
Subscription bindGoogleCode(String code,
String emailCode,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param countryCode 国际电话区号 
*@param phone 手机号 
*@param code 短信验证码 
*@return 绑定新手机号
*/
Subscription bindNewPhone(String countryCode,
String phone,
String code,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param countryCode 国家地区code 
*@param phone 手机号 
*@param code 短信验证码 
*@return 绑定手机号
*/
Subscription bindPhone(String countryCode,
String phone,
String code,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param oldPwd 原登录密码 
*@param newPwd 新登录密码 
*@param code 邮箱验证码 
*@return 修改登录密码
*/
Subscription changeLoginPwd(String oldPwd,
String newPwd,
String code,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param oldPwd 原资金密码 
*@param newPwd 新资金密码 
*@param code 邮箱验证码 
*@return 修改资金密码
*/
Subscription changeTradePwd(String oldPwd,
String newPwd,
String code,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param code 验证码 
*@return 修改绑定手机时，检查原手机验证码
*/
Subscription checkOldPhoneCode(String code,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@return 生成谷歌验证器
*/
Subscription createGoogleCode( BaseSubscriberImpl<BaseResponseItem<CreateGoogleCodeItem>> subscriber);


/**
*@return 获取邀请好友链接
*/
Subscription createInvitLink( BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@return 用户详情
*/
Subscription detail( BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber);


/**
*@return 查看KYC拒绝原因
*/
Subscription getRejectReason( BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param type 获取系统指定的下拉框数据，1身份认证-证件类型；2银行卡认证-银行名称；3国家地区 
*@return 获取下拉框数据
*/
Subscription getSelectData(String type,
 BaseSubscriberImpl<BaseResponseItem<List<GetSelectDataItem>>> subscriber);


/**
*@param code google验证码 
*@return 查看谷歌验证器
*/
Subscription getUserGoogleAuth(String code,
 BaseSubscriberImpl<BaseResponseItem<GetUserGoogleAuthItem>> subscriber);


/**
*@return 获取用户姓名
*/
Subscription getUserRealName( BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@return 查看谷歌验证规则
*/
Subscription googleRule( BaseSubscriberImpl<BaseResponseItem<GoogleRuleItem>> subscriber);


/**
*@param rule 规则类型:1添加提币地址规则,2登录规则 
*@param isOpen 是否开启:false否、true是 
*@return 修改谷歌验证规则
*/
Subscription updateRule(int rule,
boolean isOpen,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param rule 规则类型:1添加提币地址规则,2登录规则 
*@param isOpen 是否开启:false否、true是 
*@return 获取邀请的好友认证信息
*/
Subscription invitAuthList(int rule,
boolean isOpen,
 BaseSubscriberImpl<BaseResponseItem<InvitAuthListItem>> subscriber);


/**
*@return 最后一次登录信息
*/
Subscription lastLoginLog( BaseSubscriberImpl<BaseResponseItem<LastLoginLogItem>> subscriber);


/**
*@param offset 当前页起始行 
*@param limit 每页显示的记录条数 
*@return 获取用户登录日志
*/
Subscription loginLog(long offset,
long limit,
 BaseSubscriberImpl<BaseResponseItem<LoginLogItem>> subscriber);


/**
*@return 再次发送激活邮件
*/
Subscription reSendActiveLink( BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@return 用户认证信息
*/
Subscription realInfo( BaseSubscriberImpl<BaseResponseItem<RealInfoItem>> subscriber);


/**
*@param identityType 证件类型 
*@param firstName 名字,非身份证时,姓,名拆分存,此字段必填,反之可为空 
*@param familyName 姓氏,证件类型为身份证时，姓名都放在此字段中 
*@param region 国家地区 
*@param identityNo 身份证号 
*@param identityOnurl 证件正面照片 
*@param identityOffurl 证件反面照片,证件类型为身份证时,必填 
*@param identityHoldurl 证件手持照片 
*@return 实名认证
*/
Subscription realName(String identityType,
String firstName,
String familyName,
String region,
String identityNo,
String identityOnurl,
String identityOffurl,
String identityHoldurl,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@return 个人中心
*/
Subscription selfCenter( BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param email 邮箱 
*@return 绑定邮箱
*/
Subscription sendBindEmailCode(String email,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param type 操作类型:6修改密码,7修改资金密码,24绑定google,25设置资金密码 
*@return 发送邮箱验证码
*/
Subscription sendEmailVerCode(int type,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param countryCode 国家地区code 
*@param phone 手机号 
*@param businessCode 业务code:2绑定手机,3解绑手机 
*@return 根据国家地区发送手机验证码
*/
Subscription sendSmsCodeByCountry(String countryCode,
String phone,
int businessCode,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param type 操作类型:2绑定手机,24绑定google,3解绑手机 
*@return 发送短信验证码
*/
Subscription sendSmsVerCode(int type,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param pwd 新资金密码 
*@param code 邮箱验证码 
*@return 设置资金密码
*/
Subscription setTradePwd(String pwd,
String code,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);



}
