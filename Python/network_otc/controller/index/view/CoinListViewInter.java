package coin.otc.com.network.controller.index.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.index.item.CoinListItem;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取虚拟币
 */

public interface CoinListViewInter extends BaseViewInter {
     void onCoinListSuccess(List<CoinListItem> item);

}
