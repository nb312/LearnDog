package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.publicad.view.AdPublicCalcViewInter;
import coin.otc.com.network.controller.publicad.view.DetailViewInter;
import coin.otc.com.network.controller.publicad.view.AdPublicListViewInter;
import coin.otc.com.network.controller.publicad.view.MultipleSelectViewInter;
import coin.otc.com.network.controller.publicad.view.PayMinuteViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：广告公共接口
 */

public interface PublicAdPresenterInter extends BasePresenterInter {
    
    /**
    * 买入、售出计算
    */
    void adPublicCalc(AdPublicCalcViewInter viewInter);

    
    /**
    * 买入、售出详情页信息
    */
    void detail(DetailViewInter viewInter);

    
    /**
    * 在线出售、购买列表
    */
    void adPublicList(AdPublicListViewInter viewInter);

    
    /**
    * 获取下拉框数据
    */
    void multipleSelect(MultipleSelectViewInter viewInter);

    
    /**
    * 选择支付方式后，获取支付分钟限制范围
    */
    void payMinute(PayMinuteViewInter viewInter);

    
}
