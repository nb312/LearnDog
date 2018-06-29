package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IIMHttpService;
import coin.otc.com.network.model.inter.IMModelInter;
import coin.otc.com.network.controller.im.item.LoginInfoItem;
import coin.otc.com.network.controller.im.item.GetAccidItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：im相关接口
 */

public class IMModel extends BaseModelImpl implements IMModelInter {
    
    @Override
    public Subscription loginInfo( BaseSubscriberImpl<BaseResponseItem<LoginInfoItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IIMHttpService.class).loginInfo(), subscriber);
    }

    

    @Override
    public Subscription getAccid(long userId, BaseSubscriberImpl<BaseResponseItem<GetAccidItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IIMHttpService.class).getAccid(userId), subscriber);
    }

    

}
