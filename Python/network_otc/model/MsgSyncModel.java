package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IMsgSyncHttpService;
import coin.otc.com.network.model.inter.MsgSyncModelInter;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：获取网易云消息
 */

public class MsgSyncModel extends BaseModelImpl implements MsgSyncModelInter {
    
    @Override
    public Subscription msgSync( BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IMsgSyncHttpService.class).msgSync(), subscriber);
    }

    

}
