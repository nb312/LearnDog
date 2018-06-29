package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IDescriptionHttpService;
import coin.otc.com.network.model.inter.DescriptionModelInter;
import coin.otc.com.network.controller.description.item.GetAnnounceItem;
import coin.otc.com.network.controller.description.item.GetDescItem;
import coin.otc.com.network.controller.description.item.ListAnnounceItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：提示文案、公告相关
 */

public class DescriptionModel extends BaseModelImpl implements DescriptionModelInter {
    
    @Override
    public Subscription getAnnounce(long id, BaseSubscriberImpl<BaseResponseItem<GetAnnounceItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IDescriptionHttpService.class).getAnnounce(id), subscriber);
    }

    

    @Override
    public Subscription getDesc(long coinId,int lang, BaseSubscriberImpl<BaseResponseItem<GetDescItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IDescriptionHttpService.class).getDesc(coinId,lang), subscriber);
    }

    

    @Override
    public Subscription listAnnounce(long offset,long limit, BaseSubscriberImpl<BaseResponseItem<ListAnnounceItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IDescriptionHttpService.class).listAnnounce(offset,limit), subscriber);
    }

    

}
