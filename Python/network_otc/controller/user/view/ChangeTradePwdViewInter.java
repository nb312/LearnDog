package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.param.ChangeTradePwdParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 修改资金密码
 */

public interface ChangeTradePwdViewInter extends BaseViewInter {
     
ChangeTradePwdParam getChangeTradePwdParam();
void onChangeTradePwdSuccess(String item);

}
