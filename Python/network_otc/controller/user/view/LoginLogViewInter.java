package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.item.LoginLogItem;
import coin.otc.com.network.controller.user.param.LoginLogParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取用户登录日志
 */

public interface LoginLogViewInter extends BaseViewInter {
     
LoginLogParam getLoginLogParam();
void onLoginLogSuccess(LoginLogItem item);

}
