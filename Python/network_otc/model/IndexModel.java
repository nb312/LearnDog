package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IIndexHttpService;
import coin.otc.com.network.model.inter.IndexModelInter;
import coin.otc.com.network.controller.index.item.CoinListItem;
import coin.otc.com.network.controller.index.item.UserCenterItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：提示文案、公告相关
 */

public class IndexModel extends BaseModelImpl implements IndexModelInter {
    
    @Override
    public Subscription coinList( BaseSubscriberImpl<BaseResponseItem<List<CoinListItem>>> subscriber) {
        return normalSubscribe(getVersionHttpService(IIndexHttpService.class).coinList(), subscriber);
    }

    

    @Override
    public Subscription reSendActiveEmail(String email, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IIndexHttpService.class).reSendActiveEmail(email), subscriber);
    }

    

    @Override
    public Subscription userCenter(long userId,String st, BaseSubscriberImpl<BaseResponseItem<UserCenterItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IIndexHttpService.class).userCenter(userId,st), subscriber);
    }

    

}
