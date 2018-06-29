package com.haoyong.szzc.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import com.haoyong.szzc.network.controller.auth.view.ForgetCheckViewInter;
import com.haoyong.szzc.network.controller.auth.view.ForgetOverViewInter;
import com.haoyong.szzc.network.controller.auth.view.ForgetRequestViewInter;
import com.haoyong.szzc.network.controller.auth.view.LoginViewInter;
import com.haoyong.szzc.network.controller.auth.view.LogoutViewInter;
import com.haoyong.szzc.network.controller.auth.view.RegisterViewInter;
import com.haoyong.szzc.network.controller.auth.view.TicketViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：认证相关接口
 */

public interface AuthPresenterInter extends BasePresenterInter {
    
    /**
    * 2.忘记密码，校验验证码
    */
    void forgetCheck(ForgetCheckViewInter viewInter);

    
    /**
    * 3.忘记密码，提交密码修改
    */
    void forgetOver(ForgetOverViewInter viewInter);

    
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
    * 获取服务调用凭证接口
    */
    void ticket(TicketViewInter viewInter);

    
}
