package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.im.view.LoginInfoViewInter;
import coin.otc.com.network.controller.im.view.GetAccidViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：im相关接口
 */

public interface IMPresenterInter extends BasePresenterInter {
    
    /**
    * 获取im登录相关字段
    */
    void loginInfo(LoginInfoViewInter viewInter);

    
    /**
    * 获取账户accid
    */
    void getAccid(GetAccidViewInter viewInter);

    
}
