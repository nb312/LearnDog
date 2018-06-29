package coin.otc.com.network.controller.coinoperation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.coinoperation.item.AssetsItem;
import coin.otc.com.network.controller.coinoperation.param.AssetsParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 我的资产
 */

public interface AssetsViewInter extends BaseViewInter {
     
AssetsParam getAssetsParam();
void onAssetsSuccess(List<AssetsItem> item);

}
