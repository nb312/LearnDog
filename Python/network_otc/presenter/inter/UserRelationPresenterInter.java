package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.userrelation.view.DetailViewInter;
import coin.otc.com.network.controller.userrelation.view.ListTrustViewInter;
import coin.otc.com.network.controller.userrelation.view.ShieldViewInter;
import coin.otc.com.network.controller.userrelation.view.TrustViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：用户关系
 */

public interface UserRelationPresenterInter extends BasePresenterInter {
    
    /**
    * 用户交易统计信息
    */
    void detail(DetailViewInter viewInter);

    
    /**
    * 信任我的人、我信任的人、我屏蔽的人
    */
    void listTrust(ListTrustViewInter viewInter);

    
    /**
    * 屏蔽、取消屏蔽
    */
    void shield(ShieldViewInter viewInter);

    
    /**
    * 信任、取消信任
    */
    void trust(TrustViewInter viewInter);

    
}
