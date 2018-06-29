package coin.otc.com.network.controller.message.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.message.param.UnReadNumCategoryParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 根据消息类型查询未读消息数
 */

public interface UnReadNumCategoryViewInter extends BaseViewInter {
     
UnReadNumCategoryParam getUnReadNumCategoryParam();
void onUnReadNumCategorySuccess(String item);

}
