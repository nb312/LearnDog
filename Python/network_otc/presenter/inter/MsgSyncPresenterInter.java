package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.msgsync.view.MsgSyncViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：获取网易云消息
 */

public interface MsgSyncPresenterInter extends BasePresenterInter {
    
    /**
    * msgSync
    */
    void msgSync(MsgSyncViewInter viewInter);

    
}
