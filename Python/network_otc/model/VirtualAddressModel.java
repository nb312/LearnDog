package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IVirtualAddressHttpService;
import coin.otc.com.network.model.inter.VirtualAddressModelInter;
import coin.otc.com.network.controller.virtualaddress.item.InAddItem;
import coin.otc.com.network.controller.virtualaddress.item.DetailItem;
import coin.otc.com.network.controller.virtualaddress.item.OutListItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：虚拟币地址相关接口
 */

public class VirtualAddressModel extends BaseModelImpl implements VirtualAddressModelInter {
    
    @Override
    public Subscription inAdd(long coinId, BaseSubscriberImpl<BaseResponseItem<InAddItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IVirtualAddressHttpService.class).inAdd(coinId), subscriber);
    }

    

    @Override
    public Subscription detail(long coinId, BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IVirtualAddressHttpService.class).detail(coinId), subscriber);
    }

    

    @Override
    public Subscription outAdd(String address,String tradePwd,long coinId,String remark, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IVirtualAddressHttpService.class).outAdd(address,tradePwd,coinId,remark), subscriber);
    }

    

    @Override
    public Subscription delete(String ids, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IVirtualAddressHttpService.class).delete(ids), subscriber);
    }

    

    @Override
    public Subscription outList(long coinId, BaseSubscriberImpl<BaseResponseItem<List<OutListItem>>> subscriber) {
        return normalSubscribe(getVersionHttpService(IVirtualAddressHttpService.class).outList(coinId), subscriber);
    }

    

    @Override
    public Subscription remark(long id,String remark, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IVirtualAddressHttpService.class).remark(id,remark), subscriber);
    }

    

}
