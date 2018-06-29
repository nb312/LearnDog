package coin.otc.com.network.controller.coinoperation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.coinoperation.item.CoinListItem;
import coin.otc.com.network.controller.coinoperation.param.CoinListParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 分页获取充提记录接口
 */

public interface CoinListViewInter extends BaseViewInter {
     
CoinListParam getCoinListParam();
void onCoinListSuccess(CoinListItem item);

}
