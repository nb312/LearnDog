package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.virtualaddress.view.InAddViewInter;
import coin.otc.com.network.controller.virtualaddress.view.DetailViewInter;
import coin.otc.com.network.controller.virtualaddress.view.OutAddViewInter;
import coin.otc.com.network.controller.virtualaddress.view.DeleteViewInter;
import coin.otc.com.network.controller.virtualaddress.view.OutListViewInter;
import coin.otc.com.network.controller.virtualaddress.view.RemarkViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：虚拟币地址相关接口
 */

public interface VirtualAddressPresenterInter extends BasePresenterInter {
    
    /**
    * 新增充币地址
    */
    void inAdd(InAddViewInter viewInter);

    
    /**
    * 获取充币地址
    */
    void detail(DetailViewInter viewInter);

    
    /**
    * 新增提币地址
    */
    void outAdd(OutAddViewInter viewInter);

    
    /**
    * 删除提币地址
    */
    void delete(DeleteViewInter viewInter);

    
    /**
    * 获取提币地址列表
    */
    void outList(OutListViewInter viewInter);

    
    /**
    * 修改提币备注
    */
    void remark(RemarkViewInter viewInter);

    
}
