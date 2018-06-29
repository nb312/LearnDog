package coin.otc.com.network.controller.message.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.message.item.UnReadNumGroupItem;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 分组获取所有类型的未读消息数
 */

public interface UnReadNumGroupViewInter extends BaseViewInter {
     void onUnReadNumGroupSuccess(List<UnReadNumGroupItem> item);

}
