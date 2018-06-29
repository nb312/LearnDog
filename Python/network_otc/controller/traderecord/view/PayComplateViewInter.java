package coin.otc.com.network.controller.traderecord.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.traderecord.param.PayComplateParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 买家完成付款
 */

public interface PayComplateViewInter extends BaseViewInter {
     
PayComplateParam getPayComplateParam();
void onPayComplateSuccess(String item);

}
