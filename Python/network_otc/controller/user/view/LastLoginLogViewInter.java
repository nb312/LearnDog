package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.item.LastLoginLogItem;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 最后一次登录信息
 */

public interface LastLoginLogViewInter extends BaseViewInter {
     void onLastLoginLogSuccess(LastLoginLogItem item);

}
