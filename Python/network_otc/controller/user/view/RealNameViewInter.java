package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.param.RealNameParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 实名认证
 */

public interface RealNameViewInter extends BaseViewInter {
     
RealNameParam getRealNameParam();
void onRealNameSuccess(String item);

}
