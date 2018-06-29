package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.user.view.BaseInfoViewInter;
import coin.otc.com.network.controller.user.view.BindEmailViewInter;
import coin.otc.com.network.controller.user.view.BindGoogleCodeViewInter;
import coin.otc.com.network.controller.user.view.BindNewPhoneViewInter;
import coin.otc.com.network.controller.user.view.BindPhoneViewInter;
import coin.otc.com.network.controller.user.view.ChangeLoginPwdViewInter;
import coin.otc.com.network.controller.user.view.ChangeTradePwdViewInter;
import coin.otc.com.network.controller.user.view.CheckOldPhoneCodeViewInter;
import coin.otc.com.network.controller.user.view.CreateGoogleCodeViewInter;
import coin.otc.com.network.controller.user.view.CreateInvitLinkViewInter;
import coin.otc.com.network.controller.user.view.DetailViewInter;
import coin.otc.com.network.controller.user.view.GetRejectReasonViewInter;
import coin.otc.com.network.controller.user.view.GetSelectDataViewInter;
import coin.otc.com.network.controller.user.view.GetUserGoogleAuthViewInter;
import coin.otc.com.network.controller.user.view.GetUserRealNameViewInter;
import coin.otc.com.network.controller.user.view.GoogleRuleViewInter;
import coin.otc.com.network.controller.user.view.UpdateRuleViewInter;
import coin.otc.com.network.controller.user.view.InvitAuthListViewInter;
import coin.otc.com.network.controller.user.view.LastLoginLogViewInter;
import coin.otc.com.network.controller.user.view.LoginLogViewInter;
import coin.otc.com.network.controller.user.view.ReSendActiveLinkViewInter;
import coin.otc.com.network.controller.user.view.RealInfoViewInter;
import coin.otc.com.network.controller.user.view.RealNameViewInter;
import coin.otc.com.network.controller.user.view.SelfCenterViewInter;
import coin.otc.com.network.controller.user.view.SendBindEmailCodeViewInter;
import coin.otc.com.network.controller.user.view.SendEmailVerCodeViewInter;
import coin.otc.com.network.controller.user.view.SendSmsCodeByCountryViewInter;
import coin.otc.com.network.controller.user.view.SendSmsVerCodeViewInter;
import coin.otc.com.network.controller.user.view.SetTradePwdViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：用户相关接口
 */

public interface UserPresenterInter extends BasePresenterInter {
    
    /**
    * 获取用户基本信息
    */
    void baseInfo(BaseInfoViewInter viewInter);

    
    /**
    * 绑定邮箱
    */
    void bindEmail(BindEmailViewInter viewInter);

    
    /**
    * 绑定谷歌验证器
    */
    void bindGoogleCode(BindGoogleCodeViewInter viewInter);

    
    /**
    * 绑定新手机号
    */
    void bindNewPhone(BindNewPhoneViewInter viewInter);

    
    /**
    * 绑定手机号
    */
    void bindPhone(BindPhoneViewInter viewInter);

    
    /**
    * 修改登录密码
    */
    void changeLoginPwd(ChangeLoginPwdViewInter viewInter);

    
    /**
    * 修改资金密码
    */
    void changeTradePwd(ChangeTradePwdViewInter viewInter);

    
    /**
    * 修改绑定手机时，检查原手机验证码
    */
    void checkOldPhoneCode(CheckOldPhoneCodeViewInter viewInter);

    
    /**
    * 生成谷歌验证器
    */
    void createGoogleCode(CreateGoogleCodeViewInter viewInter);

    
    /**
    * 获取邀请好友链接
    */
    void createInvitLink(CreateInvitLinkViewInter viewInter);

    
    /**
    * 用户详情
    */
    void detail(DetailViewInter viewInter);

    
    /**
    * 查看KYC拒绝原因
    */
    void getRejectReason(GetRejectReasonViewInter viewInter);

    
    /**
    * 获取下拉框数据
    */
    void getSelectData(GetSelectDataViewInter viewInter);

    
    /**
    * 查看谷歌验证器
    */
    void getUserGoogleAuth(GetUserGoogleAuthViewInter viewInter);

    
    /**
    * 获取用户姓名
    */
    void getUserRealName(GetUserRealNameViewInter viewInter);

    
    /**
    * 查看谷歌验证规则
    */
    void googleRule(GoogleRuleViewInter viewInter);

    
    /**
    * 修改谷歌验证规则
    */
    void updateRule(UpdateRuleViewInter viewInter);

    
    /**
    * 获取邀请的好友认证信息
    */
    void invitAuthList(InvitAuthListViewInter viewInter);

    
    /**
    * 最后一次登录信息
    */
    void lastLoginLog(LastLoginLogViewInter viewInter);

    
    /**
    * 获取用户登录日志
    */
    void loginLog(LoginLogViewInter viewInter);

    
    /**
    * 再次发送激活邮件
    */
    void reSendActiveLink(ReSendActiveLinkViewInter viewInter);

    
    /**
    * 用户认证信息
    */
    void realInfo(RealInfoViewInter viewInter);

    
    /**
    * 实名认证
    */
    void realName(RealNameViewInter viewInter);

    
    /**
    * 个人中心
    */
    void selfCenter(SelfCenterViewInter viewInter);

    
    /**
    * 绑定邮箱
    */
    void sendBindEmailCode(SendBindEmailCodeViewInter viewInter);

    
    /**
    * 发送邮箱验证码
    */
    void sendEmailVerCode(SendEmailVerCodeViewInter viewInter);

    
    /**
    * 根据国家地区发送手机验证码
    */
    void sendSmsCodeByCountry(SendSmsCodeByCountryViewInter viewInter);

    
    /**
    * 发送短信验证码
    */
    void sendSmsVerCode(SendSmsVerCodeViewInter viewInter);

    
    /**
    * 设置资金密码
    */
    void setTradePwd(SetTradePwdViewInter viewInter);

    
}
