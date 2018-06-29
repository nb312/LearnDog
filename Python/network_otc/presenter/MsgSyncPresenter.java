package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.MsgSyncModelInter;
import coin.otc.com.network.presenter.inter.MsgSyncPresenterInter;

import coin.otc.com.network.controller.msgsync.view.MsgSyncViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 获取网易云消息 
 */
public class MsgSyncPresenter extends BasePresenterImpl<MsgSyncModelInter> implements MsgSyncPresenterInter {
    public MsgSyncPresenter(MsgSyncModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void msgSync(MsgSyncViewInter viewInter) {
        
        addSubscription(mModelInter.msgSync( new MsgSyncSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: msgSync
     */
    class MsgSyncSubscriber extends OTCResponseSubscriber<String, MsgSyncViewInter> {

        public MsgSyncSubscriber(MsgSyncViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onMsgSyncSuccess(item);
        }
    }
    

    
}
