package coin.otc.com.network.controller.description.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.description.item.GetAnnounceItem;
import coin.otc.com.network.controller.description.param.GetAnnounceParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取公告详情
 */

public interface GetAnnounceViewInter extends BaseViewInter {
     
GetAnnounceParam getGetAnnounceParam();
void onGetAnnounceSuccess(GetAnnounceItem item);

}
