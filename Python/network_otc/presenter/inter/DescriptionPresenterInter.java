package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.description.view.GetAnnounceViewInter;
import coin.otc.com.network.controller.description.view.GetDescViewInter;
import coin.otc.com.network.controller.description.view.ListAnnounceViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：提示文案、公告相关
 */

public interface DescriptionPresenterInter extends BasePresenterInter {
    
    /**
    * 获取公告详情
    */
    void getAnnounce(GetAnnounceViewInter viewInter);

    
    /**
    * 获取提示文案
    */
    void getDesc(GetDescViewInter viewInter);

    
    /**
    * 公告列表
    */
    void listAnnounce(ListAnnounceViewInter viewInter);

    
}
