package coin.otc.com.network.controller.traderecord.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.traderecord.item.TradeRecordBuyItem;
import coin.otc.com.network.controller.traderecord.param.TradeRecordBuyParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 买入
 */

public interface TradeRecordBuyViewInter extends BaseViewInter {
     
TradeRecordBuyParam getTradeRecordBuyParam();
void onTradeRecordBuySuccess(TradeRecordBuyItem item);

}
