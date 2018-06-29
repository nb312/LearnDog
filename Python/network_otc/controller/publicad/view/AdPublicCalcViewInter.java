package coin.otc.com.network.controller.publicad.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.publicad.item.AdPublicCalcItem;
import coin.otc.com.network.controller.publicad.param.AdPublicCalcParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 买入、售出计算
 */

public interface AdPublicCalcViewInter extends BaseViewInter {
     
AdPublicCalcParam getAdPublicCalcParam();
void onAdPublicCalcSuccess(AdPublicCalcItem item);

}
