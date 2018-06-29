package coin.otc.com.network.controller.traderecord.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.traderecord.param.GrantCoinParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 卖家放行币
 */

public interface GrantCoinViewInter extends BaseViewInter {
     
GrantCoinParam getGrantCoinParam();
void onGrantCoinSuccess(String item);

}
