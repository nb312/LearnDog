package coin.otc.com.network.controller.message.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;



/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 我的未读消息数
 */

public interface UnReadNumViewInter extends BaseViewInter {
     void onUnReadNumSuccess(String item);

}
