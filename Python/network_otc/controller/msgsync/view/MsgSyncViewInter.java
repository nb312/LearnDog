package coin.otc.com.network.controller.msgsync.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;



/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: msgSync
 */

public interface MsgSyncViewInter extends BaseViewInter {
     void onMsgSyncSuccess(String item);

}
