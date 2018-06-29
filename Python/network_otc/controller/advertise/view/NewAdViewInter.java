package coin.otc.com.network.controller.advertise.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.advertise.item.NewAdItem;
import coin.otc.com.network.controller.advertise.param.NewAdParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 发布广告
 */

public interface NewAdViewInter extends BaseViewInter {
     
NewAdParam getNewAdParam();
void onNewAdSuccess(NewAdItem item);

}
