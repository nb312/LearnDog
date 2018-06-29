package coin.otc.com.network.controller.coinoperation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.coinoperation.param.CoinAddParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 新增提币申请接口
 */

public interface CoinAddViewInter extends BaseViewInter {
     
CoinAddParam getCoinAddParam();
void onCoinAddSuccess(String item);

}
