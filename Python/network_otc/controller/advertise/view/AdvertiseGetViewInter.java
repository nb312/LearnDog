package coin.otc.com.network.controller.advertise.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.advertise.item.AdvertiseGetItem;
import coin.otc.com.network.controller.advertise.param.AdvertiseGetParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 进入编辑页，获取广告信息
 */

public interface AdvertiseGetViewInter extends BaseViewInter {
     
AdvertiseGetParam getAdvertiseGetParam();
void onAdvertiseGetSuccess(AdvertiseGetItem item);

}
