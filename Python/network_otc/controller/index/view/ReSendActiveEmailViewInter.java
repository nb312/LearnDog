package coin.otc.com.network.controller.index.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.index.param.ReSendActiveEmailParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 未登录用户发送激活链接
 */

public interface ReSendActiveEmailViewInter extends BaseViewInter {
     
ReSendActiveEmailParam getReSendActiveEmailParam();
void onReSendActiveEmailSuccess(String item);

}
