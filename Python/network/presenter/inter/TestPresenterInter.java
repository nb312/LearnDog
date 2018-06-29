package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.test.view.GenSignViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：我的广告列表
 */

public interface TestPresenterInter extends BasePresenterInter {
    
    /**
    * 根据time和参数生成sign
    */
    void genSign(GenSignViewInter viewInter);

    
}
