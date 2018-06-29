package coin.otc.com.network.controller.index.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.index.item.UserCenterItem;
import coin.otc.com.network.controller.index.param.UserCenterParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 用户主页获取用户基础信息 web端的不管
 */

public interface UserCenterViewInter extends BaseViewInter {
     
UserCenterParam getUserCenterParam();
void onUserCenterSuccess(UserCenterItem item);

}
