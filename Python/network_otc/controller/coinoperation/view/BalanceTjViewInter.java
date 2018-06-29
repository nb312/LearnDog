package coin.otc.com.network.controller.coinoperation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.coinoperation.item.BalanceTjItem;
import coin.otc.com.network.controller.coinoperation.param.BalanceTjParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 交易明细页面：收到、发送统计
 */

public interface BalanceTjViewInter extends BaseViewInter {
     
BalanceTjParam getBalanceTjParam();
void onBalanceTjSuccess(BalanceTjItem item);

}
