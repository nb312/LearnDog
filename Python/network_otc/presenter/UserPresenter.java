package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.UserModelInter;
import coin.otc.com.network.presenter.inter.UserPresenterInter;

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
import coin.otc.com.network.controller.user.param.BindEmailParam;
import coin.otc.com.network.controller.user.param.BindGoogleCodeParam;
import coin.otc.com.network.controller.user.param.BindNewPhoneParam;
import coin.otc.com.network.controller.user.param.BindPhoneParam;
import coin.otc.com.network.controller.user.param.ChangeLoginPwdParam;
import coin.otc.com.network.controller.user.param.ChangeTradePwdParam;
import coin.otc.com.network.controller.user.param.CheckOldPhoneCodeParam;
import coin.otc.com.network.controller.user.param.GetSelectDataParam;
import coin.otc.com.network.controller.user.param.GetUserGoogleAuthParam;
import coin.otc.com.network.controller.user.param.UpdateRuleParam;
import coin.otc.com.network.controller.user.param.InvitAuthListParam;
import coin.otc.com.network.controller.user.param.LoginLogParam;
import coin.otc.com.network.controller.user.param.RealNameParam;
import coin.otc.com.network.controller.user.param.SendBindEmailCodeParam;
import coin.otc.com.network.controller.user.param.SendEmailVerCodeParam;
import coin.otc.com.network.controller.user.param.SendSmsCodeByCountryParam;
import coin.otc.com.network.controller.user.param.SendSmsVerCodeParam;
import coin.otc.com.network.controller.user.param.SetTradePwdParam;
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
 * 用户相关接口 
 */
public class UserPresenter extends BasePresenterImpl<UserModelInter> implements UserPresenterInter {
    public UserPresenter(UserModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void baseInfo(BaseInfoViewInter viewInter) {
        
        addSubscription(mModelInter.baseInfo( new BaseInfoSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void bindEmail(BindEmailViewInter viewInter) {
        BindEmailParam param = viewInter.getBindEmailParam();
        addSubscription(mModelInter.bindEmail(param.getEmail(),param.getCode(), new BindEmailSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void bindGoogleCode(BindGoogleCodeViewInter viewInter) {
        BindGoogleCodeParam param = viewInter.getBindGoogleCodeParam();
        addSubscription(mModelInter.bindGoogleCode(param.getCode(),param.getEmailCode(), new BindGoogleCodeSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void bindNewPhone(BindNewPhoneViewInter viewInter) {
        BindNewPhoneParam param = viewInter.getBindNewPhoneParam();
        addSubscription(mModelInter.bindNewPhone(param.getCountryCode(),param.getPhone(),param.getCode(), new BindNewPhoneSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void bindPhone(BindPhoneViewInter viewInter) {
        BindPhoneParam param = viewInter.getBindPhoneParam();
        addSubscription(mModelInter.bindPhone(param.getCountryCode(),param.getPhone(),param.getCode(), new BindPhoneSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void changeLoginPwd(ChangeLoginPwdViewInter viewInter) {
        ChangeLoginPwdParam param = viewInter.getChangeLoginPwdParam();
        addSubscription(mModelInter.changeLoginPwd(param.getOldPwd(),param.getNewPwd(),param.getCode(), new ChangeLoginPwdSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void changeTradePwd(ChangeTradePwdViewInter viewInter) {
        ChangeTradePwdParam param = viewInter.getChangeTradePwdParam();
        addSubscription(mModelInter.changeTradePwd(param.getOldPwd(),param.getNewPwd(),param.getCode(), new ChangeTradePwdSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void checkOldPhoneCode(CheckOldPhoneCodeViewInter viewInter) {
        CheckOldPhoneCodeParam param = viewInter.getCheckOldPhoneCodeParam();
        addSubscription(mModelInter.checkOldPhoneCode(param.getCode(), new CheckOldPhoneCodeSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void createGoogleCode(CreateGoogleCodeViewInter viewInter) {
        
        addSubscription(mModelInter.createGoogleCode( new CreateGoogleCodeSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void createInvitLink(CreateInvitLinkViewInter viewInter) {
        
        addSubscription(mModelInter.createInvitLink( new CreateInvitLinkSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void detail(DetailViewInter viewInter) {
        
        addSubscription(mModelInter.detail( new DetailSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void getRejectReason(GetRejectReasonViewInter viewInter) {
        
        addSubscription(mModelInter.getRejectReason( new GetRejectReasonSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void getSelectData(GetSelectDataViewInter viewInter) {
        GetSelectDataParam param = viewInter.getGetSelectDataParam();
        addSubscription(mModelInter.getSelectData(param.getType(), new GetSelectDataSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void getUserGoogleAuth(GetUserGoogleAuthViewInter viewInter) {
        GetUserGoogleAuthParam param = viewInter.getGetUserGoogleAuthParam();
        addSubscription(mModelInter.getUserGoogleAuth(param.getCode(), new GetUserGoogleAuthSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void getUserRealName(GetUserRealNameViewInter viewInter) {
        
        addSubscription(mModelInter.getUserRealName( new GetUserRealNameSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void googleRule(GoogleRuleViewInter viewInter) {
        
        addSubscription(mModelInter.googleRule( new GoogleRuleSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void updateRule(UpdateRuleViewInter viewInter) {
        UpdateRuleParam param = viewInter.getUpdateRuleParam();
        addSubscription(mModelInter.updateRule(param.getRule(),param.isIsOpen(), new UpdateRuleSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void invitAuthList(InvitAuthListViewInter viewInter) {
        InvitAuthListParam param = viewInter.getInvitAuthListParam();
        addSubscription(mModelInter.invitAuthList(param.getRule(),param.isIsOpen(), new InvitAuthListSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void lastLoginLog(LastLoginLogViewInter viewInter) {
        
        addSubscription(mModelInter.lastLoginLog( new LastLoginLogSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void loginLog(LoginLogViewInter viewInter) {
        LoginLogParam param = viewInter.getLoginLogParam();
        addSubscription(mModelInter.loginLog(param.getOffset(),param.getLimit(), new LoginLogSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void reSendActiveLink(ReSendActiveLinkViewInter viewInter) {
        
        addSubscription(mModelInter.reSendActiveLink( new ReSendActiveLinkSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void realInfo(RealInfoViewInter viewInter) {
        
        addSubscription(mModelInter.realInfo( new RealInfoSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void realName(RealNameViewInter viewInter) {
        RealNameParam param = viewInter.getRealNameParam();
        addSubscription(mModelInter.realName(param.getIdentityType(),param.getFirstName(),param.getFamilyName(),param.getRegion(),param.getIdentityNo(),param.getIdentityOnurl(),param.getIdentityOffurl(),param.getIdentityHoldurl(), new RealNameSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void selfCenter(SelfCenterViewInter viewInter) {
        
        addSubscription(mModelInter.selfCenter( new SelfCenterSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void sendBindEmailCode(SendBindEmailCodeViewInter viewInter) {
        SendBindEmailCodeParam param = viewInter.getSendBindEmailCodeParam();
        addSubscription(mModelInter.sendBindEmailCode(param.getEmail(), new SendBindEmailCodeSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void sendEmailVerCode(SendEmailVerCodeViewInter viewInter) {
        SendEmailVerCodeParam param = viewInter.getSendEmailVerCodeParam();
        addSubscription(mModelInter.sendEmailVerCode(param.getType(), new SendEmailVerCodeSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void sendSmsCodeByCountry(SendSmsCodeByCountryViewInter viewInter) {
        SendSmsCodeByCountryParam param = viewInter.getSendSmsCodeByCountryParam();
        addSubscription(mModelInter.sendSmsCodeByCountry(param.getCountryCode(),param.getPhone(),param.getBusinessCode(), new SendSmsCodeByCountrySubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void sendSmsVerCode(SendSmsVerCodeViewInter viewInter) {
        SendSmsVerCodeParam param = viewInter.getSendSmsVerCodeParam();
        addSubscription(mModelInter.sendSmsVerCode(param.getType(), new SendSmsVerCodeSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void setTradePwd(SetTradePwdViewInter viewInter) {
        SetTradePwdParam param = viewInter.getSetTradePwdParam();
        addSubscription(mModelInter.setTradePwd(param.getPwd(),param.getCode(), new SetTradePwdSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 获取用户基本信息
     */
    class BaseInfoSubscriber extends OTCResponseSubscriber<BaseInfoItem, BaseInfoViewInter> {

        public BaseInfoSubscriber(BaseInfoViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(BaseInfoItem item) {
            super.onStateSuccess(item);
            mViewInter.onBaseInfoSuccess(item);
        }
    }
    

    /**
     * 网络回调: 绑定邮箱
     */
    class BindEmailSubscriber extends OTCResponseSubscriber<String, BindEmailViewInter> {

        public BindEmailSubscriber(BindEmailViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onBindEmailSuccess(item);
        }
    }
    

    /**
     * 网络回调: 绑定谷歌验证器
     */
    class BindGoogleCodeSubscriber extends OTCResponseSubscriber<String, BindGoogleCodeViewInter> {

        public BindGoogleCodeSubscriber(BindGoogleCodeViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onBindGoogleCodeSuccess(item);
        }
    }
    

    /**
     * 网络回调: 绑定新手机号
     */
    class BindNewPhoneSubscriber extends OTCResponseSubscriber<String, BindNewPhoneViewInter> {

        public BindNewPhoneSubscriber(BindNewPhoneViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onBindNewPhoneSuccess(item);
        }
    }
    

    /**
     * 网络回调: 绑定手机号
     */
    class BindPhoneSubscriber extends OTCResponseSubscriber<String, BindPhoneViewInter> {

        public BindPhoneSubscriber(BindPhoneViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onBindPhoneSuccess(item);
        }
    }
    

    /**
     * 网络回调: 修改登录密码
     */
    class ChangeLoginPwdSubscriber extends OTCResponseSubscriber<String, ChangeLoginPwdViewInter> {

        public ChangeLoginPwdSubscriber(ChangeLoginPwdViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onChangeLoginPwdSuccess(item);
        }
    }
    

    /**
     * 网络回调: 修改资金密码
     */
    class ChangeTradePwdSubscriber extends OTCResponseSubscriber<String, ChangeTradePwdViewInter> {

        public ChangeTradePwdSubscriber(ChangeTradePwdViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onChangeTradePwdSuccess(item);
        }
    }
    

    /**
     * 网络回调: 修改绑定手机时，检查原手机验证码
     */
    class CheckOldPhoneCodeSubscriber extends OTCResponseSubscriber<String, CheckOldPhoneCodeViewInter> {

        public CheckOldPhoneCodeSubscriber(CheckOldPhoneCodeViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onCheckOldPhoneCodeSuccess(item);
        }
    }
    

    /**
     * 网络回调: 生成谷歌验证器
     */
    class CreateGoogleCodeSubscriber extends OTCResponseSubscriber<CreateGoogleCodeItem, CreateGoogleCodeViewInter> {

        public CreateGoogleCodeSubscriber(CreateGoogleCodeViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(CreateGoogleCodeItem item) {
            super.onStateSuccess(item);
            mViewInter.onCreateGoogleCodeSuccess(item);
        }
    }
    

    /**
     * 网络回调: 获取邀请好友链接
     */
    class CreateInvitLinkSubscriber extends OTCResponseSubscriber<String, CreateInvitLinkViewInter> {

        public CreateInvitLinkSubscriber(CreateInvitLinkViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onCreateInvitLinkSuccess(item);
        }
    }
    

    /**
     * 网络回调: 用户详情
     */
    class DetailSubscriber extends OTCResponseSubscriber<DetailItem, DetailViewInter> {

        public DetailSubscriber(DetailViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(DetailItem item) {
            super.onStateSuccess(item);
            mViewInter.onDetailSuccess(item);
        }
    }
    

    /**
     * 网络回调: 查看KYC拒绝原因
     */
    class GetRejectReasonSubscriber extends OTCResponseSubscriber<String, GetRejectReasonViewInter> {

        public GetRejectReasonSubscriber(GetRejectReasonViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onGetRejectReasonSuccess(item);
        }
    }
    

    /**
     * 网络回调: 获取下拉框数据
     */
    class GetSelectDataSubscriber extends OTCResponseSubscriber<List<GetSelectDataItem>, GetSelectDataViewInter> {

        public GetSelectDataSubscriber(GetSelectDataViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(List<GetSelectDataItem> item) {
            super.onStateSuccess(item);
            mViewInter.onGetSelectDataSuccess(item);
        }
    }
    

    /**
     * 网络回调: 查看谷歌验证器
     */
    class GetUserGoogleAuthSubscriber extends OTCResponseSubscriber<GetUserGoogleAuthItem, GetUserGoogleAuthViewInter> {

        public GetUserGoogleAuthSubscriber(GetUserGoogleAuthViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(GetUserGoogleAuthItem item) {
            super.onStateSuccess(item);
            mViewInter.onGetUserGoogleAuthSuccess(item);
        }
    }
    

    /**
     * 网络回调: 获取用户姓名
     */
    class GetUserRealNameSubscriber extends OTCResponseSubscriber<String, GetUserRealNameViewInter> {

        public GetUserRealNameSubscriber(GetUserRealNameViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onGetUserRealNameSuccess(item);
        }
    }
    

    /**
     * 网络回调: 查看谷歌验证规则
     */
    class GoogleRuleSubscriber extends OTCResponseSubscriber<GoogleRuleItem, GoogleRuleViewInter> {

        public GoogleRuleSubscriber(GoogleRuleViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(GoogleRuleItem item) {
            super.onStateSuccess(item);
            mViewInter.onGoogleRuleSuccess(item);
        }
    }
    

    /**
     * 网络回调: 修改谷歌验证规则
     */
    class UpdateRuleSubscriber extends OTCResponseSubscriber<String, UpdateRuleViewInter> {

        public UpdateRuleSubscriber(UpdateRuleViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onUpdateRuleSuccess(item);
        }
    }
    

    /**
     * 网络回调: 获取邀请的好友认证信息
     */
    class InvitAuthListSubscriber extends OTCResponseSubscriber<InvitAuthListItem, InvitAuthListViewInter> {

        public InvitAuthListSubscriber(InvitAuthListViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(InvitAuthListItem item) {
            super.onStateSuccess(item);
            mViewInter.onInvitAuthListSuccess(item);
        }
    }
    

    /**
     * 网络回调: 最后一次登录信息
     */
    class LastLoginLogSubscriber extends OTCResponseSubscriber<LastLoginLogItem, LastLoginLogViewInter> {

        public LastLoginLogSubscriber(LastLoginLogViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(LastLoginLogItem item) {
            super.onStateSuccess(item);
            mViewInter.onLastLoginLogSuccess(item);
        }
    }
    

    /**
     * 网络回调: 获取用户登录日志
     */
    class LoginLogSubscriber extends OTCResponseSubscriber<LoginLogItem, LoginLogViewInter> {

        public LoginLogSubscriber(LoginLogViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(LoginLogItem item) {
            super.onStateSuccess(item);
            mViewInter.onLoginLogSuccess(item);
        }
    }
    

    /**
     * 网络回调: 再次发送激活邮件
     */
    class ReSendActiveLinkSubscriber extends OTCResponseSubscriber<String, ReSendActiveLinkViewInter> {

        public ReSendActiveLinkSubscriber(ReSendActiveLinkViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onReSendActiveLinkSuccess(item);
        }
    }
    

    /**
     * 网络回调: 用户认证信息
     */
    class RealInfoSubscriber extends OTCResponseSubscriber<RealInfoItem, RealInfoViewInter> {

        public RealInfoSubscriber(RealInfoViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(RealInfoItem item) {
            super.onStateSuccess(item);
            mViewInter.onRealInfoSuccess(item);
        }
    }
    

    /**
     * 网络回调: 实名认证
     */
    class RealNameSubscriber extends OTCResponseSubscriber<String, RealNameViewInter> {

        public RealNameSubscriber(RealNameViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onRealNameSuccess(item);
        }
    }
    

    /**
     * 网络回调: 个人中心
     */
    class SelfCenterSubscriber extends OTCResponseSubscriber<String, SelfCenterViewInter> {

        public SelfCenterSubscriber(SelfCenterViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onSelfCenterSuccess(item);
        }
    }
    

    /**
     * 网络回调: 绑定邮箱
     */
    class SendBindEmailCodeSubscriber extends OTCResponseSubscriber<String, SendBindEmailCodeViewInter> {

        public SendBindEmailCodeSubscriber(SendBindEmailCodeViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onSendBindEmailCodeSuccess(item);
        }
    }
    

    /**
     * 网络回调: 发送邮箱验证码
     */
    class SendEmailVerCodeSubscriber extends OTCResponseSubscriber<String, SendEmailVerCodeViewInter> {

        public SendEmailVerCodeSubscriber(SendEmailVerCodeViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onSendEmailVerCodeSuccess(item);
        }
    }
    

    /**
     * 网络回调: 根据国家地区发送手机验证码
     */
    class SendSmsCodeByCountrySubscriber extends OTCResponseSubscriber<String, SendSmsCodeByCountryViewInter> {

        public SendSmsCodeByCountrySubscriber(SendSmsCodeByCountryViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onSendSmsCodeByCountrySuccess(item);
        }
    }
    

    /**
     * 网络回调: 发送短信验证码
     */
    class SendSmsVerCodeSubscriber extends OTCResponseSubscriber<String, SendSmsVerCodeViewInter> {

        public SendSmsVerCodeSubscriber(SendSmsVerCodeViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onSendSmsVerCodeSuccess(item);
        }
    }
    

    /**
     * 网络回调: 设置资金密码
     */
    class SetTradePwdSubscriber extends OTCResponseSubscriber<String, SetTradePwdViewInter> {

        public SetTradePwdSubscriber(SetTradePwdViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onSetTradePwdSuccess(item);
        }
    }
    

    
}
