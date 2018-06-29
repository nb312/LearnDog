package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.param.BindPhoneParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 绑定手机号
 */

public interface BindPhoneViewInter extends BaseViewInter {
     
BindPhoneParam getBindPhoneParam();
void onBindPhoneSuccess(String item);

}
