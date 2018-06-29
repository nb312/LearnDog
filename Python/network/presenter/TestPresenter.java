package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.TestModelInter;
import coin.otc.com.network.presenter.inter.TestPresenterInter;

import coin.otc.com.network.controller.test.view.GenSignViewInter;
import coin.otc.com.network.controller.test.param.GenSignParam;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 我的广告列表 
 */
public class TestPresenter extends BasePresenterImpl<TestModelInter> implements TestPresenterInter {
    public TestPresenter(TestModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void genSign(GenSignViewInter viewInter) {
        GenSignParam param = viewInter.getGenSignParam();
        addSubscription(mModelInter.genSign(param.getTime(),param.getParam(), new GenSignSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 根据time和参数生成sign
     */
    class GenSignSubscriber extends OTCResponseSubscriber<String, GenSignViewInter> {

        public GenSignSubscriber(GenSignViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onGenSignSuccess(item);
        }
    }
    

    
}
