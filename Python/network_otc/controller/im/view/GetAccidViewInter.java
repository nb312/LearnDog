package coin.otc.com.network.controller.im.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.im.item.GetAccidItem;
import coin.otc.com.network.controller.im.param.GetAccidParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取账户accid
 */

public interface GetAccidViewInter extends BaseViewInter {
     
GetAccidParam getGetAccidParam();
void onGetAccidSuccess(GetAccidItem item);

}
