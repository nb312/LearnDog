package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.UserRelationModelInter;
import coin.otc.com.network.presenter.inter.UserRelationPresenterInter;

import coin.otc.com.network.controller.userrelation.view.DetailViewInter;
import coin.otc.com.network.controller.userrelation.view.ListTrustViewInter;
import coin.otc.com.network.controller.userrelation.view.ShieldViewInter;
import coin.otc.com.network.controller.userrelation.view.TrustViewInter;
import coin.otc.com.network.controller.userrelation.param.ListTrustParam;
import coin.otc.com.network.controller.userrelation.param.ShieldParam;
import coin.otc.com.network.controller.userrelation.param.TrustParam;
import coin.otc.com.network.controller.userrelation.item.DetailItem;
import coin.otc.com.network.controller.userrelation.item.ListTrustItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 用户关系 
 */
public class UserRelationPresenter extends BasePresenterImpl<UserRelationModelInter> implements UserRelationPresenterInter {
    public UserRelationPresenter(UserRelationModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void detail(DetailViewInter viewInter) {
        
        addSubscription(mModelInter.detail( new DetailSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void listTrust(ListTrustViewInter viewInter) {
        ListTrustParam param = viewInter.getListTrustParam();
        addSubscription(mModelInter.listTrust(param.getOffset(),param.getLimit(),param.getType(), new ListTrustSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void shield(ShieldViewInter viewInter) {
        ShieldParam param = viewInter.getShieldParam();
        addSubscription(mModelInter.shield(param.getRelationUserId(),param.getShield(), new ShieldSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void trust(TrustViewInter viewInter) {
        TrustParam param = viewInter.getTrustParam();
        addSubscription(mModelInter.trust(param.getRelationUserId(),param.getTrustType(), new TrustSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 用户交易统计信息
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
     * 网络回调: 信任我的人、我信任的人、我屏蔽的人
     */
    class ListTrustSubscriber extends OTCResponseSubscriber<ListTrustItem, ListTrustViewInter> {

        public ListTrustSubscriber(ListTrustViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(ListTrustItem item) {
            super.onStateSuccess(item);
            mViewInter.onListTrustSuccess(item);
        }
    }
    

    /**
     * 网络回调: 屏蔽、取消屏蔽
     */
    class ShieldSubscriber extends OTCResponseSubscriber<String, ShieldViewInter> {

        public ShieldSubscriber(ShieldViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onShieldSuccess(item);
        }
    }
    

    /**
     * 网络回调: 信任、取消信任
     */
    class TrustSubscriber extends OTCResponseSubscriber<String, TrustViewInter> {

        public TrustSubscriber(TrustViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onTrustSuccess(item);
        }
    }
    

    
}
