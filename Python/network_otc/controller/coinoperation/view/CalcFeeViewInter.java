package coin.otc.com.network.controller.coinoperation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.coinoperation.item.CalcFeeItem;
import coin.otc.com.network.controller.coinoperation.param.CalcFeeParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 计算实际到帐金额、手续费
 */

public interface CalcFeeViewInter extends BaseViewInter {
     
CalcFeeParam getCalcFeeParam();
void onCalcFeeSuccess(CalcFeeItem item);

}
