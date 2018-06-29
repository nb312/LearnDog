package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IMessageHttpService;
import coin.otc.com.network.model.inter.MessageModelInter;
import coin.otc.com.network.controller.message.item.DetailItem;
import coin.otc.com.network.controller.message.item.MessageListItem;
import coin.otc.com.network.controller.message.item.UnReadNumGroupItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：消息
 */

public class MessageModel extends BaseModelImpl implements MessageModelInter {
    
    @Override
    public Subscription deleted(long id, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IMessageHttpService.class).deleted(id), subscriber);
    }

    

    @Override
    public Subscription detail(long id, BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IMessageHttpService.class).detail(id), subscriber);
    }

    

    @Override
    public Subscription messageList(long offset,long limit,int category, BaseSubscriberImpl<BaseResponseItem<MessageListItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IMessageHttpService.class).messageList(offset,limit,category), subscriber);
    }

    

    @Override
    public Subscription readed(long id, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IMessageHttpService.class).readed(id), subscriber);
    }

    

    @Override
    public Subscription unReadNum( BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IMessageHttpService.class).unReadNum(), subscriber);
    }

    

    @Override
    public Subscription unReadNumCategory(int category, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IMessageHttpService.class).unReadNumCategory(category), subscriber);
    }

    

    @Override
    public Subscription unReadNumGroup( BaseSubscriberImpl<BaseResponseItem<List<UnReadNumGroupItem>>> subscriber) {
        return normalSubscribe(getVersionHttpService(IMessageHttpService.class).unReadNumGroup(), subscriber);
    }

    

}
