package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.DescriptionModelInter;
import coin.otc.com.network.presenter.inter.DescriptionPresenterInter;

import coin.otc.com.network.controller.description.view.GetAnnounceViewInter;
import coin.otc.com.network.controller.description.view.GetDescViewInter;
import coin.otc.com.network.controller.description.view.ListAnnounceViewInter;
import coin.otc.com.network.controller.description.param.GetAnnounceParam;
import coin.otc.com.network.controller.description.param.GetDescParam;
import coin.otc.com.network.controller.description.param.ListAnnounceParam;
import coin.otc.com.network.controller.description.item.GetAnnounceItem;
import coin.otc.com.network.controller.description.item.GetDescItem;
import coin.otc.com.network.controller.description.item.ListAnnounceItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 提示文案、公告相关 
 */
public class DescriptionPresenter extends BasePresenterImpl<DescriptionModelInter> implements DescriptionPresenterInter {
    public DescriptionPresenter(DescriptionModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void getAnnounce(GetAnnounceViewInter viewInter) {
        GetAnnounceParam param = viewInter.getGetAnnounceParam();
        addSubscription(mModelInter.getAnnounce(param.getId(), new GetAnnounceSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void getDesc(GetDescViewInter viewInter) {
        GetDescParam param = viewInter.getGetDescParam();
        addSubscription(mModelInter.getDesc(param.getCoinId(),param.getLang(), new GetDescSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void listAnnounce(ListAnnounceViewInter viewInter) {
        ListAnnounceParam param = viewInter.getListAnnounceParam();
        addSubscription(mModelInter.listAnnounce(param.getOffset(),param.getLimit(), new ListAnnounceSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 获取公告详情
     */
    class GetAnnounceSubscriber extends OTCResponseSubscriber<GetAnnounceItem, GetAnnounceViewInter> {

        public GetAnnounceSubscriber(GetAnnounceViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(GetAnnounceItem item) {
            super.onStateSuccess(item);
            mViewInter.onGetAnnounceSuccess(item);
        }
    }
    

    /**
     * 网络回调: 获取提示文案
     */
    class GetDescSubscriber extends OTCResponseSubscriber<GetDescItem, GetDescViewInter> {

        public GetDescSubscriber(GetDescViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(GetDescItem item) {
            super.onStateSuccess(item);
            mViewInter.onGetDescSuccess(item);
        }
    }
    

    /**
     * 网络回调: 公告列表
     */
    class ListAnnounceSubscriber extends OTCResponseSubscriber<ListAnnounceItem, ListAnnounceViewInter> {

        public ListAnnounceSubscriber(ListAnnounceViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(ListAnnounceItem item) {
            super.onStateSuccess(item);
            mViewInter.onListAnnounceSuccess(item);
        }
    }
    

    
}
