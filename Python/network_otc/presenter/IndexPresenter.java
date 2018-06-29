package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.IndexModelInter;
import coin.otc.com.network.presenter.inter.IndexPresenterInter;

import coin.otc.com.network.controller.index.view.CoinListViewInter;
import coin.otc.com.network.controller.index.view.ReSendActiveEmailViewInter;
import coin.otc.com.network.controller.index.view.UserCenterViewInter;
import coin.otc.com.network.controller.index.param.ReSendActiveEmailParam;
import coin.otc.com.network.controller.index.param.UserCenterParam;
import coin.otc.com.network.controller.index.item.CoinListItem;
import coin.otc.com.network.controller.index.item.UserCenterItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 提示文案、公告相关 
 */
public class IndexPresenter extends BasePresenterImpl<IndexModelInter> implements IndexPresenterInter {
    public IndexPresenter(IndexModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void coinList(CoinListViewInter viewInter) {
        
        addSubscription(mModelInter.coinList( new CoinListSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void reSendActiveEmail(ReSendActiveEmailViewInter viewInter) {
        ReSendActiveEmailParam param = viewInter.getReSendActiveEmailParam();
        addSubscription(mModelInter.reSendActiveEmail(param.getEmail(), new ReSendActiveEmailSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void userCenter(UserCenterViewInter viewInter) {
        UserCenterParam param = viewInter.getUserCenterParam();
        addSubscription(mModelInter.userCenter(param.getUserId(),param.getSt(), new UserCenterSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 获取虚拟币
     */
    class CoinListSubscriber extends OTCResponseSubscriber<List<CoinListItem>, CoinListViewInter> {

        public CoinListSubscriber(CoinListViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(List<CoinListItem> item) {
            super.onStateSuccess(item);
            mViewInter.onCoinListSuccess(item);
        }
    }
    

    /**
     * 网络回调: 未登录用户发送激活链接
     */
    class ReSendActiveEmailSubscriber extends OTCResponseSubscriber<String, ReSendActiveEmailViewInter> {

        public ReSendActiveEmailSubscriber(ReSendActiveEmailViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onReSendActiveEmailSuccess(item);
        }
    }
    

    /**
     * 网络回调: 用户主页获取用户基础信息 web端的不管
     */
    class UserCenterSubscriber extends OTCResponseSubscriber<UserCenterItem, UserCenterViewInter> {

        public UserCenterSubscriber(UserCenterViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(UserCenterItem item) {
            super.onStateSuccess(item);
            mViewInter.onUserCenterSuccess(item);
        }
    }
    

    
}
