package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.param.SendBindEmailCodeParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 绑定邮箱
 */

public interface SendBindEmailCodeViewInter extends BaseViewInter {
     
SendBindEmailCodeParam getSendBindEmailCodeParam();
void onSendBindEmailCodeSuccess(String item);

}
