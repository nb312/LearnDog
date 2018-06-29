package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.param.SendEmailVerCodeParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 发送邮箱验证码
 */

public interface SendEmailVerCodeViewInter extends BaseViewInter {
     
SendEmailVerCodeParam getSendEmailVerCodeParam();
void onSendEmailVerCodeSuccess(String item);

}
