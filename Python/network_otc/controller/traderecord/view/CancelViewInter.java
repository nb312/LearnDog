package coin.otc.com.network.controller.traderecord.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.traderecord.param.CancelParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 取消
 */

public interface CancelViewInter extends BaseViewInter {
     
CancelParam getCancelParam();
void onCancelSuccess(String item);

}
