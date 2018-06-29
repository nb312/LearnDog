package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.ITestHttpService;
import coin.otc.com.network.model.inter.TestModelInter;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：我的广告列表
 */

public class TestModel extends BaseModelImpl implements TestModelInter {
    
    @Override
    public Subscription genSign(String time,String param, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getHttpService(ITestHttpService.class).genSign(time,param), subscriber);
    }

    

}
