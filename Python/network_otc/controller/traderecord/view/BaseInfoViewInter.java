package coin.otc.com.network.controller.traderecord.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.traderecord.item.BaseInfoItem;
import coin.otc.com.network.controller.traderecord.param.BaseInfoParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 基础信息
 */

public interface BaseInfoViewInter extends BaseViewInter {
     
BaseInfoParam getBaseInfoParam();
void onBaseInfoSuccess(BaseInfoItem item);

}
