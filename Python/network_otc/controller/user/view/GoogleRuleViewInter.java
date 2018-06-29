package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.item.GoogleRuleItem;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 查看谷歌验证规则
 */

public interface GoogleRuleViewInter extends BaseViewInter {
     void onGoogleRuleSuccess(GoogleRuleItem item);

}
