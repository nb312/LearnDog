package coin.otc.com.network.controller.userrelation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.userrelation.param.TrustParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 信任、取消信任
 */

public interface TrustViewInter extends BaseViewInter {
     
TrustParam getTrustParam();
void onTrustSuccess(String item);

}
