package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.PublicAdModelInter;
import coin.otc.com.network.presenter.inter.PublicAdPresenterInter;

import coin.otc.com.network.controller.publicad.view.AdPublicCalcViewInter;
import coin.otc.com.network.controller.publicad.view.DetailViewInter;
import coin.otc.com.network.controller.publicad.view.AdPublicListViewInter;
import coin.otc.com.network.controller.publicad.view.MultipleSelectViewInter;
import coin.otc.com.network.controller.publicad.view.PayMinuteViewInter;
import coin.otc.com.network.controller.publicad.param.AdPublicCalcParam;
import coin.otc.com.network.controller.publicad.param.DetailParam;
import coin.otc.com.network.controller.publicad.param.AdPublicListParam;
import coin.otc.com.network.controller.publicad.param.MultipleSelectParam;
import coin.otc.com.network.controller.publicad.param.PayMinuteParam;
import coin.otc.com.network.controller.publicad.item.AdPublicCalcItem;
import coin.otc.com.network.controller.publicad.item.DetailItem;
import coin.otc.com.network.controller.publicad.item.AdPublicListItem;
import coin.otc.com.network.controller.publicad.item.MultipleSelectItem;
import coin.otc.com.network.controller.publicad.item.PayMinuteItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 广告公共接口 
 */
public class PublicAdPresenter extends BasePresenterImpl<PublicAdModelInter> implements PublicAdPresenterInter {
    public PublicAdPresenter(PublicAdModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void adPublicCalc(AdPublicCalcViewInter viewInter) {
        AdPublicCalcParam param = viewInter.getAdPublicCalcParam();
        addSubscription(mModelInter.adPublicCalc(param.getId(),param.getType(),param.getNum(), new AdPublicCalcSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void detail(DetailViewInter viewInter) {
        DetailParam param = viewInter.getDetailParam();
        addSubscription(mModelInter.detail(param.getId(), new DetailSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void adPublicList(AdPublicListViewInter viewInter) {
        AdPublicListParam param = viewInter.getAdPublicListParam();
        addSubscription(mModelInter.adPublicList(param.getOffset(),param.getLimit(),param.getCoinId(),param.getEntrustType(),param.getCountryCode(),param.getCurrency(),param.getPayProvider(),param.isNeedPhone(),param.isNeedRealName(),param.getNiceName(),param.getMinPrice(),param.getMaxPrice(),param.getSort(),param.getOrder(), new AdPublicListSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void multipleSelect(MultipleSelectViewInter viewInter) {
        MultipleSelectParam param = viewInter.getMultipleSelectParam();
        addSubscription(mModelInter.multipleSelect(param.getType(), new MultipleSelectSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void payMinute(PayMinuteViewInter viewInter) {
        PayMinuteParam param = viewInter.getPayMinuteParam();
        addSubscription(mModelInter.payMinute(param.getId(), new PayMinuteSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 买入、售出计算
     */
    class AdPublicCalcSubscriber extends OTCResponseSubscriber<AdPublicCalcItem, AdPublicCalcViewInter> {

        public AdPublicCalcSubscriber(AdPublicCalcViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(AdPublicCalcItem item) {
            super.onStateSuccess(item);
            mViewInter.onAdPublicCalcSuccess(item);
        }
    }
    

    /**
     * 网络回调: 买入、售出详情页信息
     */
    class DetailSubscriber extends OTCResponseSubscriber<DetailItem, DetailViewInter> {

        public DetailSubscriber(DetailViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(DetailItem item) {
            super.onStateSuccess(item);
            mViewInter.onDetailSuccess(item);
        }
    }
    

    /**
     * 网络回调: 在线出售、购买列表
     */
    class AdPublicListSubscriber extends OTCResponseSubscriber<AdPublicListItem, AdPublicListViewInter> {

        public AdPublicListSubscriber(AdPublicListViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(AdPublicListItem item) {
            super.onStateSuccess(item);
            mViewInter.onAdPublicListSuccess(item);
        }
    }
    

    /**
     * 网络回调: 获取下拉框数据
     */
    class MultipleSelectSubscriber extends OTCResponseSubscriber<MultipleSelectItem, MultipleSelectViewInter> {

        public MultipleSelectSubscriber(MultipleSelectViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(MultipleSelectItem item) {
            super.onStateSuccess(item);
            mViewInter.onMultipleSelectSuccess(item);
        }
    }
    

    /**
     * 网络回调: 选择支付方式后，获取支付分钟限制范围
     */
    class PayMinuteSubscriber extends OTCResponseSubscriber<PayMinuteItem, PayMinuteViewInter> {

        public PayMinuteSubscriber(PayMinuteViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(PayMinuteItem item) {
            super.onStateSuccess(item);
            mViewInter.onPayMinuteSuccess(item);
        }
    }
    

    
}
