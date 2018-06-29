package coin.otc.com.network.controller.workorder.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.workorder.param.ReplyParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 回复工单
 */

public interface ReplyViewInter extends BaseViewInter {
     
ReplyParam getReplyParam();
void onReplySuccess(String item);

}
