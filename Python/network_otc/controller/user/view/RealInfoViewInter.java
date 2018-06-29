package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.item.RealInfoItem;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 用户认证信息
 */

public interface RealInfoViewInter extends BaseViewInter {
     void onRealInfoSuccess(RealInfoItem item);

}
