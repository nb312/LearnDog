package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.advertise.view.CalcPriceViewInter;
import coin.otc.com.network.controller.advertise.view.CloseViewInter;
import coin.otc.com.network.controller.advertise.view.DeleteViewInter;
import coin.otc.com.network.controller.advertise.view.AdvertiseGetViewInter;
import coin.otc.com.network.controller.advertise.view.ListMyAdViewInter;
import coin.otc.com.network.controller.advertise.view.NewAdViewInter;
import coin.otc.com.network.controller.advertise.view.AdvertiseOpenViewInter;
import coin.otc.com.network.controller.advertise.view.UpdateVacationStatusTestViewInter;
import coin.otc.com.network.controller.advertise.view.UpdateVacationStatusViewInter;
import coin.otc.com.network.controller.advertise.view.UserAdViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：我的广告列表
 */

public interface AdvertisePresenterInter extends BasePresenterInter {
    
    /**
    * 发布广告时，计算价格
    */
    void calcPrice(CalcPriceViewInter viewInter);

    
    /**
    * 关闭广告
    */
    void close(CloseViewInter viewInter);

    
    /**
    * 删除广告
    */
    void delete(DeleteViewInter viewInter);

    
    /**
    * 进入编辑页，获取广告信息
    */
    void advertiseGet(AdvertiseGetViewInter viewInter);

    
    /**
    * 我的广告列表：包含全部、进行中、已关闭，用参数type区分
    */
    void listMyAd(ListMyAdViewInter viewInter);

    
    /**
    * 发布广告
    */
    void newAd(NewAdViewInter viewInter);

    
    /**
    * 开启广告
    */
    void advertiseOpen(AdvertiseOpenViewInter viewInter);

    
    /**
    * 广告设置 app没有用到 并且我update-vacation-status改为了update-vacation-status-test
    */
    void updateVacationStatusTest(UpdateVacationStatusTestViewInter viewInter);

    
    /**
    * 广告设置
    */
    void updateVacationStatus(UpdateVacationStatusViewInter viewInter);

    
    /**
    * 用户主页：发布的广告
    */
    void userAd(UserAdViewInter viewInter);

    
}
