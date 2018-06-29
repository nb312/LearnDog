package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.param.CheckOldPhoneCodeParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 修改绑定手机时，检查原手机验证码
 */

public interface CheckOldPhoneCodeViewInter extends BaseViewInter {
     
CheckOldPhoneCodeParam getCheckOldPhoneCodeParam();
void onCheckOldPhoneCodeSuccess(String item);

}
