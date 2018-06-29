package coin.otc.com.network.controller.coinoperation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.coinoperation.param.CancelParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 取消提币申请接口
 */

public interface CancelViewInter extends BaseViewInter {
     
CancelParam getCancelParam();
void onCancelSuccess(String item);

}
