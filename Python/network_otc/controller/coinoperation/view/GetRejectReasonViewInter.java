package coin.otc.com.network.controller.coinoperation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.coinoperation.param.GetRejectReasonParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 查看提现拒绝原因
 */

public interface GetRejectReasonViewInter extends BaseViewInter {
     
GetRejectReasonParam getGetRejectReasonParam();
void onGetRejectReasonSuccess(String item);

}
