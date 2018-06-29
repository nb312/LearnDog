package coin.otc.com.network.controller.virtualaddress.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.virtualaddress.item.OutListItem;
import coin.otc.com.network.controller.virtualaddress.param.OutListParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取提币地址列表
 */

public interface OutListViewInter extends BaseViewInter {
     
OutListParam getOutListParam();
void onOutListSuccess(List<OutListItem> item);

}
