package coin.otc.com.network.controller.coinoperation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.coinoperation.item.ShowBalanceItem;
import coin.otc.com.network.controller.coinoperation.param.ShowBalanceParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 虚拟币提现时,显示余额、费率信息
 */

public interface ShowBalanceViewInter extends BaseViewInter {
     
ShowBalanceParam getShowBalanceParam();
void onShowBalanceSuccess(ShowBalanceItem item);

}
