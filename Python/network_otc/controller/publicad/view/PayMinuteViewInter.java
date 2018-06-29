package coin.otc.com.network.controller.publicad.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.publicad.item.PayMinuteItem;
import coin.otc.com.network.controller.publicad.param.PayMinuteParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 选择支付方式后，获取支付分钟限制范围
 */

public interface PayMinuteViewInter extends BaseViewInter {
     
PayMinuteParam getPayMinuteParam();
void onPayMinuteSuccess(PayMinuteItem item);

}
