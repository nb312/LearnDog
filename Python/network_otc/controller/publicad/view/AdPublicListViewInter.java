package coin.otc.com.network.controller.publicad.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.publicad.item.AdPublicListItem;
import coin.otc.com.network.controller.publicad.param.AdPublicListParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 在线出售、购买列表
 */

public interface AdPublicListViewInter extends BaseViewInter {
     
AdPublicListParam getAdPublicListParam();
void onAdPublicListSuccess(AdPublicListItem item);

}
