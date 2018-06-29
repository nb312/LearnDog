package coin.otc.com.network.controller.description.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.description.item.ListAnnounceItem;
import coin.otc.com.network.controller.description.param.ListAnnounceParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 公告列表
 */

public interface ListAnnounceViewInter extends BaseViewInter {
     
ListAnnounceParam getListAnnounceParam();
void onListAnnounceSuccess(ListAnnounceItem item);

}
