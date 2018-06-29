package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IWorkOrderHttpService;
import coin.otc.com.network.model.inter.WorkOrderModelInter;
import coin.otc.com.network.controller.workorder.item.DetailItem;
import coin.otc.com.network.controller.workorder.item.WorkOrderListItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：工单
 */

public class WorkOrderModel extends BaseModelImpl implements WorkOrderModelInter {
    
    @Override
    public Subscription detail(long id, BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IWorkOrderHttpService.class).detail(id), subscriber);
    }

    

    @Override
    public Subscription workOrderList(long offset,long limit, BaseSubscriberImpl<BaseResponseItem<WorkOrderListItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IWorkOrderHttpService.class).workOrderList(offset,limit), subscriber);
    }

    

    @Override
    public Subscription workOrderNew(int category,String content,String associateNo,String fileStr,String requestCode, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IWorkOrderHttpService.class).workOrderNew(category,content,associateNo,fileStr,requestCode), subscriber);
    }

    

    @Override
    public Subscription reply(long id,String content,String fileStr, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IWorkOrderHttpService.class).reply(id,content,fileStr), subscriber);
    }

    

    @Override
    public Subscription tipOff(long advertiseId,String content,String fileStr,String requestCode, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IWorkOrderHttpService.class).tipOff(advertiseId,content,fileStr,requestCode), subscriber);
    }

    

}
