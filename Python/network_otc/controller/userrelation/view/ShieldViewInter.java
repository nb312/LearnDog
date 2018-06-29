package coin.otc.com.network.controller.userrelation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.userrelation.param.ShieldParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 屏蔽、取消屏蔽
 */

public interface ShieldViewInter extends BaseViewInter {
     
ShieldParam getShieldParam();
void onShieldSuccess(String item);

}
