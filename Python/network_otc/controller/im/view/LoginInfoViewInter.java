package coin.otc.com.network.controller.im.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.im.item.LoginInfoItem;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取im登录相关字段
 */

public interface LoginInfoViewInter extends BaseViewInter {
     void onLoginInfoSuccess(LoginInfoItem item);

}
