package coin.otc.com.network.controller.workorder.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.workorder.item.WorkOrderListItem;
import coin.otc.com.network.controller.workorder.param.WorkOrderListParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 我的工单列表
 */

public interface WorkOrderListViewInter extends BaseViewInter {
     
WorkOrderListParam getWorkOrderListParam();
void onWorkOrderListSuccess(WorkOrderListItem item);

}
