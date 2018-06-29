package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.ICoinOperationHttpService;
import coin.otc.com.network.model.inter.CoinOperationModelInter;
import coin.otc.com.network.controller.coinoperation.item.AssetsItem;
import coin.otc.com.network.controller.coinoperation.item.BalanceChangeItem;
import coin.otc.com.network.controller.coinoperation.item.BalanceTjItem;
import coin.otc.com.network.controller.coinoperation.item.CalcFeeItem;
import coin.otc.com.network.controller.coinoperation.item.CoinListItem;
import coin.otc.com.network.controller.coinoperation.item.ShowBalanceItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：币种相关接口
 */

public class CoinOperationModel extends BaseModelImpl implements CoinOperationModelInter {
    
    @Override
    public Subscription coinAdd(long coinId,String address,double amount,double fees,double minerFees,String relAmount,String tradePwd,String remark, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(ICoinOperationHttpService.class).coinAdd(coinId,address,amount,fees,minerFees,relAmount,tradePwd,remark), subscriber);
    }

    

    @Override
    public Subscription assets(long coinId, BaseSubscriberImpl<BaseResponseItem<List<AssetsItem>>> subscriber) {
        return normalSubscribe(getVersionHttpService(ICoinOperationHttpService.class).assets(coinId), subscriber);
    }

    

    @Override
    public Subscription balanceChange(long offset,long limit,int category,int operationType,long coinId, BaseSubscriberImpl<BaseResponseItem<BalanceChangeItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ICoinOperationHttpService.class).balanceChange(offset,limit,category,operationType,coinId), subscriber);
    }

    

    @Override
    public Subscription balanceTj(long coinId,String yearMonth, BaseSubscriberImpl<BaseResponseItem<BalanceTjItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ICoinOperationHttpService.class).balanceTj(coinId,yearMonth), subscriber);
    }

    

    @Override
    public Subscription calcFee(double amount,long coinId,double minerFees, BaseSubscriberImpl<BaseResponseItem<CalcFeeItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ICoinOperationHttpService.class).calcFee(amount,coinId,minerFees), subscriber);
    }

    

    @Override
    public Subscription cancel(long operateId, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(ICoinOperationHttpService.class).cancel(operateId), subscriber);
    }

    

    @Override
    public Subscription delete(long operateId, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(ICoinOperationHttpService.class).delete(operateId), subscriber);
    }

    

    @Override
    public Subscription getRejectReason(long id, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(ICoinOperationHttpService.class).getRejectReason(id), subscriber);
    }

    

    @Override
    public Subscription coinList(long offset,long limit,int operationType, BaseSubscriberImpl<BaseResponseItem<CoinListItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ICoinOperationHttpService.class).coinList(offset,limit,operationType), subscriber);
    }

    

    @Override
    public Subscription sendAffirmMail(long id, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(ICoinOperationHttpService.class).sendAffirmMail(id), subscriber);
    }

    

    @Override
    public Subscription showBalance(long coinId, BaseSubscriberImpl<BaseResponseItem<ShowBalanceItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(ICoinOperationHttpService.class).showBalance(coinId), subscriber);
    }

    

}
