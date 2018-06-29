package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.item.BaseInfoItem;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取用户基本信息
 */

public interface BaseInfoViewInter extends BaseViewInter {
     void onBaseInfoSuccess(BaseInfoItem item);

}
