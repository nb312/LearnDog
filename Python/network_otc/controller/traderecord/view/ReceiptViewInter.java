package coin.otc.com.network.controller.traderecord.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.traderecord.item.ReceiptItem;
import coin.otc.com.network.controller.traderecord.param.ReceiptParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 查看可打印的收据
 */

public interface ReceiptViewInter extends BaseViewInter {
     
ReceiptParam getReceiptParam();
void onReceiptSuccess(ReceiptItem item);

}
