package coin.otc.com.network.controller.auth.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.auth.item.LoginItem;
import coin.otc.com.network.controller.auth.param.LoginParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 登录接口
 */

public interface LoginViewInter extends BaseViewInter {
     
LoginParam getLoginParam();
void onLoginSuccess(LoginItem item);

}
