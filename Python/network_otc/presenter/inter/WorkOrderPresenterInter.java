package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.workorder.view.DetailViewInter;
import coin.otc.com.network.controller.workorder.view.WorkOrderListViewInter;
import coin.otc.com.network.controller.workorder.view.WorkOrderNewViewInter;
import coin.otc.com.network.controller.workorder.view.ReplyViewInter;
import coin.otc.com.network.controller.workorder.view.TipOffViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：工单
 */

public interface WorkOrderPresenterInter extends BasePresenterInter {
    
    /**
    * 工单详情
    */
    void detail(DetailViewInter viewInter);

    
    /**
    * 我的工单列表
    */
    void workOrderList(WorkOrderListViewInter viewInter);

    
    /**
    * 提交工单
    */
    void workOrderNew(WorkOrderNewViewInter viewInter);

    
    /**
    * 回复工单
    */
    void reply(ReplyViewInter viewInter);

    
    /**
    * 举报
    */
    void tipOff(TipOffViewInter viewInter);

    
}
