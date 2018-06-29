package coin.otc.com.network.controller.advertise.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.advertise.item.ListMyAdItem;
import coin.otc.com.network.controller.advertise.param.ListMyAdParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 我的广告列表：包含全部、进行中、已关闭，用参数type区分
 */

public interface ListMyAdViewInter extends BaseViewInter {
     
ListMyAdParam getListMyAdParam();
void onListMyAdSuccess(ListMyAdItem item);

}
