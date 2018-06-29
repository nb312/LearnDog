package coin.otc.com.network.controller.advertise.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.advertise.param.AdvertiseOpenParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 开启广告
 */

public interface AdvertiseOpenViewInter extends BaseViewInter {
     
AdvertiseOpenParam getAdvertiseOpenParam();
void onAdvertiseOpenSuccess(String item);

}
