package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.param.UpdateRuleParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 修改谷歌验证规则
 */

public interface UpdateRuleViewInter extends BaseViewInter {
     
UpdateRuleParam getUpdateRuleParam();
void onUpdateRuleSuccess(String item);

}
