package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.index.view.CoinListViewInter;
import coin.otc.com.network.controller.index.view.ReSendActiveEmailViewInter;
import coin.otc.com.network.controller.index.view.UserCenterViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：提示文案、公告相关
 */

public interface IndexPresenterInter extends BasePresenterInter {
    
    /**
    * 获取虚拟币
    */
    void coinList(CoinListViewInter viewInter);

    
    /**
    * 未登录用户发送激活链接
    */
    void reSendActiveEmail(ReSendActiveEmailViewInter viewInter);

    
    /**
    * 用户主页获取用户基础信息 web端的不管
    */
    void userCenter(UserCenterViewInter viewInter);

    
}
