package coin.otc.com.network.controller.coinoperation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.coinoperation.param.SendAffirmMailParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 重新发送邮件
 */

public interface SendAffirmMailViewInter extends BaseViewInter {
     
SendAffirmMailParam getSendAffirmMailParam();
void onSendAffirmMailSuccess(String item);

}
