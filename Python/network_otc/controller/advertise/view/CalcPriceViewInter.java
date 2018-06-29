package coin.otc.com.network.controller.advertise.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.advertise.item.CalcPriceItem;
import coin.otc.com.network.controller.advertise.param.CalcPriceParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 发布广告时，计算价格
 */

public interface CalcPriceViewInter extends BaseViewInter {
     
CalcPriceParam getCalcPriceParam();
void onCalcPriceSuccess(CalcPriceItem item);

}
