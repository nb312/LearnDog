package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IPublicAdHttpService;
import coin.otc.com.network.model.inter.PublicAdModelInter;
import coin.otc.com.network.controller.publicad.item.AdPublicCalcItem;
import coin.otc.com.network.controller.publicad.item.DetailItem;
import coin.otc.com.network.controller.publicad.item.AdPublicListItem;
import coin.otc.com.network.controller.publicad.item.MultipleSelectItem;
import coin.otc.com.network.controller.publicad.item.PayMinuteItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：广告公共接口
 */

public class PublicAdModel extends BaseModelImpl implements PublicAdModelInter {
    
    @Override
    public Subscription adPublicCalc(long id,int type,double num, BaseSubscriberImpl<BaseResponseItem<AdPublicCalcItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IPublicAdHttpService.class).adPublicCalc(id,type,num), subscriber);
    }

    

    @Override
    public Subscription detail(long id, BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IPublicAdHttpService.class).detail(id), subscriber);
    }

    

    @Override
    public Subscription adPublicList(long offset,long limit,long coinId,int entrustType,String countryCode,String currency,long payProvider,boolean needPhone,boolean needRealName,String niceName,double minPrice,double maxPrice,String sort,String order, BaseSubscriberImpl<BaseResponseItem<AdPublicListItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IPublicAdHttpService.class).adPublicList(offset,limit,coinId,entrustType,countryCode,currency,payProvider,needPhone,needRealName,niceName,minPrice,maxPrice,sort,order), subscriber);
    }

    

    @Override
    public Subscription multipleSelect(String type, BaseSubscriberImpl<BaseResponseItem<MultipleSelectItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IPublicAdHttpService.class).multipleSelect(type), subscriber);
    }

    

    @Override
    public Subscription payMinute(long id, BaseSubscriberImpl<BaseResponseItem<PayMinuteItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IPublicAdHttpService.class).payMinute(id), subscriber);
    }

    

}
