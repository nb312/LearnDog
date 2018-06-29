package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.ITradeRecordHttpService;
import coin.otc.com.network.model.inter.TradeRecordModelInter;
import coin.otc.com.network.controller.traderecord.item.TradeRecordBuyItem;
import coin.otc.com.network.controller.traderecord.item.DetailItem;
import coin.otc.com.network.controller.traderecord.item.ListJudgeItem;
import coin.otc.com.network.controller.traderecord.item.TradeRecordListItem;
import coin.otc.com.network.controller.traderecord.item.TradeRecordSellItem;
import coin.otc.com.network.controller.traderecord.item.ReceiptItem;
import coin.otc.com.network.controller.traderecord.item.BaseInfoItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：交易相关接口
 */

public class TradeRecordModel extends BaseModelImpl implements TradeRecordModelInter {
    
    @Override
    public Subscription appeal(String tradeNo,String reason,int reasonId, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).appeal(tradeNo,reason,reasonId), subscriber);
    }

    

    @Override
    public Subscription tradeRecordBuy(long advertiseId,double quotedPrice,double money,double count,int platform,String remark, BaseSubscriberImpl<BaseResponseItem<TradeRecordBuyItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).tradeRecordBuy(advertiseId,quotedPrice,money,count,platform,remark), subscriber);
    }

    

    @Override
    public Subscription cancel(String tradeNo, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).cancel(tradeNo), subscriber);
    }

    

    @Override
    public Subscription detail(long id, BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).detail(id), subscriber);
    }

    

    @Override
    public Subscription evaluation(long tradeId,int level,String content,String requestCode, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).evaluation(tradeId,level,content,requestCode), subscriber);
    }

    

    @Override
    public Subscription grantCoin(String tradeNo, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).grantCoin(tradeNo), subscriber);
    }

    

    @Override
    public Subscription listJudge(long userId,long offset,long limit, BaseSubscriberImpl<BaseResponseItem<ListJudgeItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).listJudge(userId,offset,limit), subscriber);
    }

    

    @Override
    public Subscription tradeRecordList(long offset,long limit,int type,int entrustType, BaseSubscriberImpl<BaseResponseItem<TradeRecordListItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).tradeRecordList(offset,limit,type,entrustType), subscriber);
    }

    

    @Override
    public Subscription payComplate(String tradeNo, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).payComplate(tradeNo), subscriber);
    }

    

    @Override
    public Subscription tradeRecordSell(long advertiseId,double quotedPrice,double money,double count,int platform,String remark, BaseSubscriberImpl<BaseResponseItem<TradeRecordSellItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).tradeRecordSell(advertiseId,quotedPrice,money,count,platform,remark), subscriber);
    }

    

    @Override
    public Subscription openHosting(String tradeNo, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).openHosting(tradeNo), subscriber);
    }

    

    @Override
    public Subscription receipt(String tradeNo, BaseSubscriberImpl<BaseResponseItem<ReceiptItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).receipt(tradeNo), subscriber);
    }

    

    @Override
    public Subscription baseInfo(String tradeNo, BaseSubscriberImpl<BaseResponseItem<BaseInfoItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ITradeRecordHttpService.class).baseInfo(tradeNo), subscriber);
    }

    

}
