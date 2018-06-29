package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IUserRelationHttpService;
import coin.otc.com.network.model.inter.UserRelationModelInter;
import coin.otc.com.network.controller.userrelation.item.DetailItem;
import coin.otc.com.network.controller.userrelation.item.ListTrustItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：用户关系
 */

public class UserRelationModel extends BaseModelImpl implements UserRelationModelInter {
    
    @Override
    public Subscription detail( BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserRelationHttpService.class).detail(), subscriber);
    }

    

    @Override
    public Subscription listTrust(long offset,long limit,int type, BaseSubscriberImpl<BaseResponseItem<ListTrustItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserRelationHttpService.class).listTrust(offset,limit,type), subscriber);
    }

    

    @Override
    public Subscription shield(long relationUserId,int shield, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserRelationHttpService.class).shield(relationUserId,shield), subscriber);
    }

    

    @Override
    public Subscription trust(long relationUserId,int trustType, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserRelationHttpService.class).trust(relationUserId,trustType), subscriber);
    }

    

}
