package com.haoyong.szzc.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import com.haoyong.szzc.network.service.IAuthHttpService;
import com.haoyong.szzc.network.model.inter.AuthModelInter;
import com.haoyong.szzc.network.controller.auth.item.ForgetCheckItem;
import com.haoyong.szzc.network.controller.auth.item.ForgetOverItem;
import com.haoyong.szzc.network.controller.auth.item.LoginItem;
import com.haoyong.szzc.network.controller.auth.item.RegisterItem;
import com.haoyong.szzc.network.controller.auth.item.TicketItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：认证相关接口
 */

public class AuthModel extends BaseModelImpl implements AuthModelInter {
    
    @Override
    public Subscription forgetCheck(String username,String code, BaseSubscriberImpl<BaseResponseItem<ForgetCheckItem>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).forgetCheck(username,code), subscriber);
    }

    

    @Override
    public Subscription forgetOver(String password,String id, BaseSubscriberImpl<BaseResponseItem<ForgetOverItem>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).forgetOver(password,id), subscriber);
    }

    

    @Override
    public Subscription forgetRequest(String username, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).forgetRequest(username), subscriber);
    }

    

    @Override
    public Subscription login(String username,String password,String deviceId,int deviceType,String deviceInfo,String googleCode,String refereeCode, BaseSubscriberImpl<BaseResponseItem<LoginItem>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).login(username,password,deviceId,deviceType,deviceInfo,googleCode,refereeCode), subscriber);
    }

    

    @Override
    public Subscription logout( BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).logout(), subscriber);
    }

    

    @Override
    public Subscription register(String username,String password,String deviceId,int deviceType,String deviceInfo,String googleCode,String refereeCode, BaseSubscriberImpl<BaseResponseItem<RegisterItem>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).register(username,password,deviceId,deviceType,deviceInfo,googleCode,refereeCode), subscriber);
    }

    

    @Override
    public Subscription ticket(String ticket,String service, BaseSubscriberImpl<BaseResponseItem<TicketItem>> subscriber) {
        return normalSubscribe(getHttpService(IAuthHttpService.class).ticket(ticket,service), subscriber);
    }

    

}
