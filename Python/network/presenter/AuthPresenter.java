package com.haoyong.szzc.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import com.haoyong.szzc.network.OTCResponseSubscriber;
import java.util.List;
import com.haoyong.szzc.network.model.inter.AuthModelInter;
import com.haoyong.szzc.network.presenter.inter.AuthPresenterInter;

import com.haoyong.szzc.network.controller.auth.view.ForgetCheckViewInter;
import com.haoyong.szzc.network.controller.auth.view.ForgetOverViewInter;
import com.haoyong.szzc.network.controller.auth.view.ForgetRequestViewInter;
import com.haoyong.szzc.network.controller.auth.view.LoginViewInter;
import com.haoyong.szzc.network.controller.auth.view.LogoutViewInter;
import com.haoyong.szzc.network.controller.auth.view.RegisterViewInter;
import com.haoyong.szzc.network.controller.auth.view.TicketViewInter;
import com.haoyong.szzc.network.controller.auth.param.ForgetCheckParam;
import com.haoyong.szzc.network.controller.auth.param.ForgetOverParam;
import com.haoyong.szzc.network.controller.auth.param.ForgetRequestParam;
import com.haoyong.szzc.network.controller.auth.param.LoginParam;
import com.haoyong.szzc.network.controller.auth.param.RegisterParam;
import com.haoyong.szzc.network.controller.auth.param.TicketParam;
import com.haoyong.szzc.network.controller.auth.item.ForgetCheckItem;
import com.haoyong.szzc.network.controller.auth.item.ForgetOverItem;
import com.haoyong.szzc.network.controller.auth.item.LoginItem;
import com.haoyong.szzc.network.controller.auth.item.RegisterItem;
import com.haoyong.szzc.network.controller.auth.item.TicketItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 认证相关接口 
 */
public class AuthPresenter extends BasePresenterImpl<AuthModelInter> implements AuthPresenterInter {
    public AuthPresenter(AuthModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void forgetCheck(ForgetCheckViewInter viewInter) {
        ForgetCheckParam param = viewInter.getForgetCheckParam();
        addSubscription(mModelInter.forgetCheck(param.getUsername(),param.getCode(), new ForgetCheckSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void forgetOver(ForgetOverViewInter viewInter) {
        ForgetOverParam param = viewInter.getForgetOverParam();
        addSubscription(mModelInter.forgetOver(param.getPassword(),param.getId(), new ForgetOverSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void forgetRequest(ForgetRequestViewInter viewInter) {
        ForgetRequestParam param = viewInter.getForgetRequestParam();
        addSubscription(mModelInter.forgetRequest(param.getUsername(), new ForgetRequestSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void login(LoginViewInter viewInter) {
        LoginParam param = viewInter.getLoginParam();
        addSubscription(mModelInter.login(param.getUsername(),param.getPassword(),param.getDeviceId(),param.getDeviceType(),param.getDeviceInfo(),param.getGoogleCode(),param.getRefereeCode(), new LoginSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void logout(LogoutViewInter viewInter) {
        
        addSubscription(mModelInter.logout( new LogoutSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void register(RegisterViewInter viewInter) {
        RegisterParam param = viewInter.getRegisterParam();
        addSubscription(mModelInter.register(param.getUsername(),param.getPassword(),param.getDeviceId(),param.getDeviceType(),param.getDeviceInfo(),param.getGoogleCode(),param.getRefereeCode(), new RegisterSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void ticket(TicketViewInter viewInter) {
        TicketParam param = viewInter.getTicketParam();
        addSubscription(mModelInter.ticket(param.getTicket(),param.getService(), new TicketSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 2.忘记密码，校验验证码
     */
    class ForgetCheckSubscriber extends OTCResponseSubscriber<ForgetCheckItem, ForgetCheckViewInter> {

        public ForgetCheckSubscriber(ForgetCheckViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(ForgetCheckItem item) {
            super.onStateSuccess(item);
            mViewInter.onForgetCheckSuccess(item);
        }
    }
    

    /**
     * 网络回调: 3.忘记密码，提交密码修改
     */
    class ForgetOverSubscriber extends OTCResponseSubscriber<ForgetOverItem, ForgetOverViewInter> {

        public ForgetOverSubscriber(ForgetOverViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(ForgetOverItem item) {
            super.onStateSuccess(item);
            mViewInter.onForgetOverSuccess(item);
        }
    }
    

    /**
     * 网络回调: 1.忘记密码请求接口
     */
    class ForgetRequestSubscriber extends OTCResponseSubscriber<String, ForgetRequestViewInter> {

        public ForgetRequestSubscriber(ForgetRequestViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onForgetRequestSuccess(item);
        }
    }
    

    /**
     * 网络回调: 登录接口
     */
    class LoginSubscriber extends OTCResponseSubscriber<LoginItem, LoginViewInter> {

        public LoginSubscriber(LoginViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(LoginItem item) {
            super.onStateSuccess(item);
            mViewInter.onLoginSuccess(item);
        }
    }
    

    /**
     * 网络回调: 登出接口
     */
    class LogoutSubscriber extends OTCResponseSubscriber<String, LogoutViewInter> {

        public LogoutSubscriber(LogoutViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onLogoutSuccess(item);
        }
    }
    

    /**
     * 网络回调: 注册接口
     */
    class RegisterSubscriber extends OTCResponseSubscriber<RegisterItem, RegisterViewInter> {

        public RegisterSubscriber(RegisterViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(RegisterItem item) {
            super.onStateSuccess(item);
            mViewInter.onRegisterSuccess(item);
        }
    }
    

    /**
     * 网络回调: 获取服务调用凭证接口
     */
    class TicketSubscriber extends OTCResponseSubscriber<TicketItem, TicketViewInter> {

        public TicketSubscriber(TicketViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(TicketItem item) {
            super.onStateSuccess(item);
            mViewInter.onTicketSuccess(item);
        }
    }
    

    
}
