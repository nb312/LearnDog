package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.item.GetSelectDataItem;
import coin.otc.com.network.controller.user.param.GetSelectDataParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取下拉框数据
 */

public interface GetSelectDataViewInter extends BaseViewInter {
     
GetSelectDataParam getGetSelectDataParam();
void onGetSelectDataSuccess(List<GetSelectDataItem> item);

}
