package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.IMModelInter;
import coin.otc.com.network.presenter.inter.IMPresenterInter;

import coin.otc.com.network.controller.im.view.LoginInfoViewInter;
import coin.otc.com.network.controller.im.view.GetAccidViewInter;
import coin.otc.com.network.controller.im.param.GetAccidParam;
import coin.otc.com.network.controller.im.item.LoginInfoItem;
import coin.otc.com.network.controller.im.item.GetAccidItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * im相关接口 
 */
public class IMPresenter extends BasePresenterImpl<IMModelInter> implements IMPresenterInter {
    public IMPresenter(IMModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void loginInfo(LoginInfoViewInter viewInter) {
        
        addSubscription(mModelInter.loginInfo( new LoginInfoSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void getAccid(GetAccidViewInter viewInter) {
        GetAccidParam param = viewInter.getGetAccidParam();
        addSubscription(mModelInter.getAccid(param.getUserId(), new GetAccidSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 获取im登录相关字段
     */
    class LoginInfoSubscriber extends OTCResponseSubscriber<LoginInfoItem, LoginInfoViewInter> {

        public LoginInfoSubscriber(LoginInfoViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(LoginInfoItem item) {
            super.onStateSuccess(item);
            mViewInter.onLoginInfoSuccess(item);
        }
    }
    

    /**
     * 网络回调: 获取账户accid
     */
    class GetAccidSubscriber extends OTCResponseSubscriber<GetAccidItem, GetAccidViewInter> {

        public GetAccidSubscriber(GetAccidViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(GetAccidItem item) {
            super.onStateSuccess(item);
            mViewInter.onGetAccidSuccess(item);
        }
    }
    

    
}
