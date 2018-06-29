package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IAdvertiseHttpService;
import coin.otc.com.network.model.inter.AdvertiseModelInter;
import coin.otc.com.network.controller.advertise.item.CalcPriceItem;
import coin.otc.com.network.controller.advertise.item.AdvertiseGetItem;
import coin.otc.com.network.controller.advertise.item.ListMyAdItem;
import coin.otc.com.network.controller.advertise.item.NewAdItem;
import coin.otc.com.network.controller.advertise.item.UserAdItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：我的广告列表
 */

public class AdvertiseModel extends BaseModelImpl implements AdvertiseModelInter {
    
    @Override
    public Subscription calcPrice(long exchangeId,long coinId,String currency,double premium, BaseSubscriberImpl<BaseResponseItem<CalcPriceItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IAdvertiseHttpService.class).calcPrice(exchangeId,coinId,currency,premium), subscriber);
    }

    

    @Override
    public Subscription close(long id, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IAdvertiseHttpService.class).close(id), subscriber);
    }

    

    @Override
    public Subscription delete(long id, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IAdvertiseHttpService.class).delete(id), subscriber);
    }

    

    @Override
    public Subscription advertiseGet(long id, BaseSubscriberImpl<BaseResponseItem<AdvertiseGetItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IAdvertiseHttpService.class).advertiseGet(id), subscriber);
    }

    

    @Override
    public Subscription listMyAd(long offset,long limit,int type,long coinId,int entrustType, BaseSubscriberImpl<BaseResponseItem<ListMyAdItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IAdvertiseHttpService.class).listMyAd(offset,limit,type,coinId,entrustType), subscriber);
    }

    

    @Override
    public Subscription newAd(long id,int entrustType,long coinId,String country,String currency,long payProvider,String payProviderName,String message,double premium,String formula,int exchangeId,double price,double minAmount,double maxAmount,int payMinute,boolean isNew,boolean fixedPrice,boolean limitAuth,boolean limitTrusted,boolean limitPhone,String openTimeJsonStr,String requestCode, BaseSubscriberImpl<BaseResponseItem<NewAdItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IAdvertiseHttpService.class).newAd(id,entrustType,coinId,country,currency,payProvider,payProviderName,message,premium,formula,exchangeId,price,minAmount,maxAmount,payMinute,isNew,fixedPrice,limitAuth,limitTrusted,limitPhone,openTimeJsonStr,requestCode), subscriber);
    }

    

    @Override
    public Subscription advertiseOpen(long id, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IAdvertiseHttpService.class).advertiseOpen(id), subscriber);
    }

    

    @Override
    public Subscription updateVacationStatusTest(boolean buyVacation,boolean sellVacation, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IAdvertiseHttpService.class).updateVacationStatusTest(buyVacation,sellVacation), subscriber);
    }

    

    @Override
    public Subscription updateVacationStatus(boolean vacation,int entrustType, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IAdvertiseHttpService.class).updateVacationStatus(vacation,entrustType), subscriber);
    }

    

    @Override
    public Subscription userAd(long offset,long limit,long userId,int entrustType, BaseSubscriberImpl<BaseResponseItem<UserAdItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IAdvertiseHttpService.class).userAd(offset,limit,userId,entrustType), subscriber);
    }

    

}
