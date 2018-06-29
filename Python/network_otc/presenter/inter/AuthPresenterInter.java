package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.auth.view.ForgetCommitViewInter;
import coin.otc.com.network.controller.auth.view.ForgetRequestViewInter;
import coin.otc.com.network.controller.auth.view.LoginViewInter;
import coin.otc.com.network.controller.auth.view.LogoutViewInter;
import coin.otc.com.network.controller.auth.view.RegisterViewInter;
import coin.otc.com.network.controller.auth.view.ReqCodeViewInter;
import coin.otc.com.network.controller.auth.view.TicketViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：认证相关接口
 */

public interface AuthPresenterInter extends BasePresenterInter {
    
    /**
    * 3.找回密码提交
    */
    void forgetCommit(ForgetCommitViewInter viewInter);

    
    /**
    * 1.忘记密码请求接口
    */
    void forgetRequest(ForgetRequestViewInter viewInter);

    
    /**
    * 登录接口
    */
    void login(LoginViewInter viewInter);

    
    /**
    * 登出接口
    */
    void logout(LogoutViewInter viewInter);

    
    /**
    * 注册接口
    */
    void register(RegisterViewInter viewInter);

    
    /**
    * 获取请求code
    */
    void reqCode(ReqCodeViewInter viewInter);

    
    /**
    * 获取服务调用凭证接口
    */
    void ticket(TicketViewInter viewInter);

    
}
