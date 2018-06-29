package coin.otc.com.network.controller.traderecord.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.traderecord.param.OpenHostingParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 重新开启托管：只有超时支付，系统自动取消的，才能开启
 */

public interface OpenHostingViewInter extends BaseViewInter {
     
OpenHostingParam getOpenHostingParam();
void onOpenHostingSuccess(String item);

}
