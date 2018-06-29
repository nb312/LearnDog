package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IAuthHttpService;
import coin.otc.com.network.model.inter.AuthModelInter;
import coin.otc.com.network.controller.auth.item.LoginItem;
import coin.otc.com.network.controller.auth.item.RegisterItem;
import coin.otc.com.network.controller.auth.item.TicketItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：认证相关接口
 */

public class AuthModel extends BaseModelImpl implements AuthModelInter {
    
    @Override
    public Subscription forgetCommit(String idenKey,String password,int type, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).forgetCommit(idenKey,password,type), subscriber);
    }

    

    @Override
    public Subscription forgetRequest(String email,int type, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).forgetRequest(email,type), subscriber);
    }

    

    @Override
    public Subscription login(String niceName,String username,String password,String deviceId,int deviceType,String deviceInfo, BaseSubscriberImpl<BaseResponseItem<LoginItem>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).login(niceName,username,password,deviceId,deviceType,deviceInfo), subscriber);
    }

    

    @Override
    public Subscription logout( BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).logout(), subscriber);
    }

    

    @Override
    public Subscription register(String niceName,String username,String password,String deviceId,int deviceType,String deviceInfo, BaseSubscriberImpl<BaseResponseItem<RegisterItem>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).register(niceName,username,password,deviceId,deviceType,deviceInfo), subscriber);
    }

    

    @Override
    public Subscription reqCode( BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).reqCode(), subscriber);
    }

    

    @Override
    public Subscription ticket(String ticket,String service, BaseSubscriberImpl<BaseResponseItem<TicketItem>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).ticket(ticket,service), subscriber);
    }

    

}
