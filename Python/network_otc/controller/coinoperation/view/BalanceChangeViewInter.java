package coin.otc.com.network.controller.coinoperation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.coinoperation.item.BalanceChangeItem;
import coin.otc.com.network.controller.coinoperation.param.BalanceChangeParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 交易明细
 */

public interface BalanceChangeViewInter extends BaseViewInter {
     
BalanceChangeParam getBalanceChangeParam();
void onBalanceChangeSuccess(BalanceChangeItem item);

}
