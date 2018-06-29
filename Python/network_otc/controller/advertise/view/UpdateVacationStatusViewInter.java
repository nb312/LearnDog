package coin.otc.com.network.controller.advertise.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.advertise.param.UpdateVacationStatusParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 广告设置
 */

public interface UpdateVacationStatusViewInter extends BaseViewInter {
     
UpdateVacationStatusParam getUpdateVacationStatusParam();
void onUpdateVacationStatusSuccess(String item);

}
