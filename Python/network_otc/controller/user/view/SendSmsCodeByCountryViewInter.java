package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.param.SendSmsCodeByCountryParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 根据国家地区发送手机验证码
 */

public interface SendSmsCodeByCountryViewInter extends BaseViewInter {
     
SendSmsCodeByCountryParam getSendSmsCodeByCountryParam();
void onSendSmsCodeByCountrySuccess(String item);

}
