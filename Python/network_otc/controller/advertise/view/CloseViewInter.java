package coin.otc.com.network.controller.advertise.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.advertise.param.CloseParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 关闭广告
 */

public interface CloseViewInter extends BaseViewInter {
     
CloseParam getCloseParam();
void onCloseSuccess(String item);

}
