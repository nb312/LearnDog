package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.AdvertiseModelInter;
import coin.otc.com.network.presenter.inter.AdvertisePresenterInter;

import coin.otc.com.network.controller.advertise.view.CalcPriceViewInter;
import coin.otc.com.network.controller.advertise.view.CloseViewInter;
import coin.otc.com.network.controller.advertise.view.DeleteViewInter;
import coin.otc.com.network.controller.advertise.view.AdvertiseGetViewInter;
import coin.otc.com.network.controller.advertise.view.ListMyAdViewInter;
import coin.otc.com.network.controller.advertise.view.NewAdViewInter;
import coin.otc.com.network.controller.advertise.view.AdvertiseOpenViewInter;
import coin.otc.com.network.controller.advertise.view.UpdateVacationStatusTestViewInter;
import coin.otc.com.network.controller.advertise.view.UpdateVacationStatusViewInter;
import coin.otc.com.network.controller.advertise.view.UserAdViewInter;
import coin.otc.com.network.controller.advertise.param.CalcPriceParam;
import coin.otc.com.network.controller.advertise.param.CloseParam;
import coin.otc.com.network.controller.advertise.param.DeleteParam;
import coin.otc.com.network.controller.advertise.param.AdvertiseGetParam;
import coin.otc.com.network.controller.advertise.param.ListMyAdParam;
import coin.otc.com.network.controller.advertise.param.NewAdParam;
import coin.otc.com.network.controller.advertise.param.AdvertiseOpenParam;
import coin.otc.com.network.controller.advertise.param.UpdateVacationStatusTestParam;
import coin.otc.com.network.controller.advertise.param.UpdateVacationStatusParam;
import coin.otc.com.network.controller.advertise.param.UserAdParam;
import coin.otc.com.network.controller.advertise.item.CalcPriceItem;
import coin.otc.com.network.controller.advertise.item.AdvertiseGetItem;
import coin.otc.com.network.controller.advertise.item.ListMyAdItem;
import coin.otc.com.network.controller.advertise.item.NewAdItem;
import coin.otc.com.network.controller.advertise.item.UserAdItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 我的广告列表 
 */
public class AdvertisePresenter extends BasePresenterImpl<AdvertiseModelInter> implements AdvertisePresenterInter {
    public AdvertisePresenter(AdvertiseModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void calcPrice(CalcPriceViewInter viewInter) {
        CalcPriceParam param = viewInter.getCalcPriceParam();
        addSubscription(mModelInter.calcPrice(param.getExchangeId(),param.getCoinId(),param.getCurrency(),param.getPremium(), new CalcPriceSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void close(CloseViewInter viewInter) {
        CloseParam param = viewInter.getCloseParam();
        addSubscription(mModelInter.close(param.getId(), new CloseSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void delete(DeleteViewInter viewInter) {
        DeleteParam param = viewInter.getDeleteParam();
        addSubscription(mModelInter.delete(param.getId(), new DeleteSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void advertiseGet(AdvertiseGetViewInter viewInter) {
        AdvertiseGetParam param = viewInter.getAdvertiseGetParam();
        addSubscription(mModelInter.advertiseGet(param.getId(), new AdvertiseGetSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void listMyAd(ListMyAdViewInter viewInter) {
        ListMyAdParam param = viewInter.getListMyAdParam();
        addSubscription(mModelInter.listMyAd(param.getOffset(),param.getLimit(),param.getType(),param.getCoinId(),param.getEntrustType(), new ListMyAdSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void newAd(NewAdViewInter viewInter) {
        NewAdParam param = viewInter.getNewAdParam();
        addSubscription(mModelInter.newAd(param.getId(),param.getEntrustType(),param.getCoinId(),param.getCountry(),param.getCurrency(),param.getPayProvider(),param.getPayProviderName(),param.getMessage(),param.getPremium(),param.getFormula(),param.getExchangeId(),param.getPrice(),param.getMinAmount(),param.getMaxAmount(),param.getPayMinute(),param.isIsNew(),param.isFixedPrice(),param.isLimitAuth(),param.isLimitTrusted(),param.isLimitPhone(),param.getOpenTimeJsonStr(),param.getRequestCode(), new NewAdSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void advertiseOpen(AdvertiseOpenViewInter viewInter) {
        AdvertiseOpenParam param = viewInter.getAdvertiseOpenParam();
        addSubscription(mModelInter.advertiseOpen(param.getId(), new AdvertiseOpenSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void updateVacationStatusTest(UpdateVacationStatusTestViewInter viewInter) {
        UpdateVacationStatusTestParam param = viewInter.getUpdateVacationStatusTestParam();
        addSubscription(mModelInter.updateVacationStatusTest(param.isBuyVacation(),param.isSellVacation(), new UpdateVacationStatusTestSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void updateVacationStatus(UpdateVacationStatusViewInter viewInter) {
        UpdateVacationStatusParam param = viewInter.getUpdateVacationStatusParam();
        addSubscription(mModelInter.updateVacationStatus(param.isVacation(),param.getEntrustType(), new UpdateVacationStatusSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void userAd(UserAdViewInter viewInter) {
        UserAdParam param = viewInter.getUserAdParam();
        addSubscription(mModelInter.userAd(param.getOffset(),param.getLimit(),param.getUserId(),param.getEntrustType(), new UserAdSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 发布广告时，计算价格
     */
    class CalcPriceSubscriber extends OTCResponseSubscriber<CalcPriceItem, CalcPriceViewInter> {

        public CalcPriceSubscriber(CalcPriceViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(CalcPriceItem item) {
            super.onStateSuccess(item);
            mViewInter.onCalcPriceSuccess(item);
        }
    }
    

    /**
     * 网络回调: 关闭广告
     */
    class CloseSubscriber extends OTCResponseSubscriber<String, CloseViewInter> {

        public CloseSubscriber(CloseViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onCloseSuccess(item);
        }
    }
    

    /**
     * 网络回调: 删除广告
     */
    class DeleteSubscriber extends OTCResponseSubscriber<String, DeleteViewInter> {

        public DeleteSubscriber(DeleteViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onDeleteSuccess(item);
        }
    }
    

    /**
     * 网络回调: 进入编辑页，获取广告信息
     */
    class AdvertiseGetSubscriber extends OTCResponseSubscriber<AdvertiseGetItem, AdvertiseGetViewInter> {

        public AdvertiseGetSubscriber(AdvertiseGetViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(AdvertiseGetItem item) {
            super.onStateSuccess(item);
            mViewInter.onAdvertiseGetSuccess(item);
        }
    }
    

    /**
     * 网络回调: 我的广告列表：包含全部、进行中、已关闭，用参数type区分
     */
    class ListMyAdSubscriber extends OTCResponseSubscriber<ListMyAdItem, ListMyAdViewInter> {

        public ListMyAdSubscriber(ListMyAdViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(ListMyAdItem item) {
            super.onStateSuccess(item);
            mViewInter.onListMyAdSuccess(item);
        }
    }
    

    /**
     * 网络回调: 发布广告
     */
    class NewAdSubscriber extends OTCResponseSubscriber<NewAdItem, NewAdViewInter> {

        public NewAdSubscriber(NewAdViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(NewAdItem item) {
            super.onStateSuccess(item);
            mViewInter.onNewAdSuccess(item);
        }
    }
    

    /**
     * 网络回调: 开启广告
     */
    class AdvertiseOpenSubscriber extends OTCResponseSubscriber<String, AdvertiseOpenViewInter> {

        public AdvertiseOpenSubscriber(AdvertiseOpenViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onAdvertiseOpenSuccess(item);
        }
    }
    

    /**
     * 网络回调: 广告设置 app没有用到 并且我update-vacation-status改为了update-vacation-status-test
     */
    class UpdateVacationStatusTestSubscriber extends OTCResponseSubscriber<String, UpdateVacationStatusTestViewInter> {

        public UpdateVacationStatusTestSubscriber(UpdateVacationStatusTestViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onUpdateVacationStatusTestSuccess(item);
        }
    }
    

    /**
     * 网络回调: 广告设置
     */
    class UpdateVacationStatusSubscriber extends OTCResponseSubscriber<String, UpdateVacationStatusViewInter> {

        public UpdateVacationStatusSubscriber(UpdateVacationStatusViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onUpdateVacationStatusSuccess(item);
        }
    }
    

    /**
     * 网络回调: 用户主页：发布的广告
     */
    class UserAdSubscriber extends OTCResponseSubscriber<UserAdItem, UserAdViewInter> {

        public UserAdSubscriber(UserAdViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(UserAdItem item) {
            super.onStateSuccess(item);
            mViewInter.onUserAdSuccess(item);
        }
    }
    

    
}
