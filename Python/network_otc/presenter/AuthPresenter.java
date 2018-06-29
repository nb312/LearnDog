package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.AuthModelInter;
import coin.otc.com.network.presenter.inter.AuthPresenterInter;

import coin.otc.com.network.controller.auth.view.ForgetCommitViewInter;
import coin.otc.com.network.controller.auth.view.ForgetRequestViewInter;
import coin.otc.com.network.controller.auth.view.LoginViewInter;
import coin.otc.com.network.controller.auth.view.LogoutViewInter;
import coin.otc.com.network.controller.auth.view.RegisterViewInter;
import coin.otc.com.network.controller.auth.view.ReqCodeViewInter;
import coin.otc.com.network.controller.auth.view.TicketViewInter;
import coin.otc.com.network.controller.auth.param.ForgetCommitParam;
import coin.otc.com.network.controller.auth.param.ForgetRequestParam;
import coin.otc.com.network.controller.auth.param.LoginParam;
import coin.otc.com.network.controller.auth.param.RegisterParam;
import coin.otc.com.network.controller.auth.param.TicketParam;
import coin.otc.com.network.controller.auth.item.LoginItem;
import coin.otc.com.network.controller.auth.item.RegisterItem;
import coin.otc.com.network.controller.auth.item.TicketItem;

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
    public void forgetCommit(ForgetCommitViewInter viewInter) {
        ForgetCommitParam param = viewInter.getForgetCommitParam();
        addSubscription(mModelInter.forgetCommit(param.getIdenKey(),param.getPassword(),param.getType(), new ForgetCommitSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void forgetRequest(ForgetRequestViewInter viewInter) {
        ForgetRequestParam param = viewInter.getForgetRequestParam();
        addSubscription(mModelInter.forgetRequest(param.getEmail(),param.getType(), new ForgetRequestSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void login(LoginViewInter viewInter) {
        LoginParam param = viewInter.getLoginParam();
        addSubscription(mModelInter.login(param.getNiceName(),param.getUsername(),param.getPassword(),param.getDeviceId(),param.getDeviceType(),param.getDeviceInfo(), new LoginSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void logout(LogoutViewInter viewInter) {
        
        addSubscription(mModelInter.logout( new LogoutSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void register(RegisterViewInter viewInter) {
        RegisterParam param = viewInter.getRegisterParam();
        addSubscription(mModelInter.register(param.getNiceName(),param.getUsername(),param.getPassword(),param.getDeviceId(),param.getDeviceType(),param.getDeviceInfo(), new RegisterSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void reqCode(ReqCodeViewInter viewInter) {
        
        addSubscription(mModelInter.reqCode( new ReqCodeSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void ticket(TicketViewInter viewInter) {
        TicketParam param = viewInter.getTicketParam();
        addSubscription(mModelInter.ticket(param.getTicket(),param.getService(), new TicketSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 3.找回密码提交
     */
    class ForgetCommitSubscriber extends OTCResponseSubscriber<String, ForgetCommitViewInter> {

        public ForgetCommitSubscriber(ForgetCommitViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onForgetCommitSuccess(item);
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
     * 网络回调: 获取请求code
     */
    class ReqCodeSubscriber extends OTCResponseSubscriber<String, ReqCodeViewInter> {

        public ReqCodeSubscriber(ReqCodeViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onReqCodeSuccess(item);
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
