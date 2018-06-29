package coin.otc.com.network.controller.advertise.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.advertise.param.UpdateVacationStatusTestParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 广告设置 app没有用到 并且我update-vacation-status改为了update-vacation-status-test
 */

public interface UpdateVacationStatusTestViewInter extends BaseViewInter {
     
UpdateVacationStatusTestParam getUpdateVacationStatusTestParam();
void onUpdateVacationStatusTestSuccess(String item);

}
