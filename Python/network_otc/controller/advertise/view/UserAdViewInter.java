package coin.otc.com.network.controller.advertise.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.advertise.item.UserAdItem;
import coin.otc.com.network.controller.advertise.param.UserAdParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 用户主页：发布的广告
 */

public interface UserAdViewInter extends BaseViewInter {
     
UserAdParam getUserAdParam();
void onUserAdSuccess(UserAdItem item);

}
