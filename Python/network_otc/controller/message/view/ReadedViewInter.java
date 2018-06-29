package coin.otc.com.network.controller.message.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.message.param.ReadedParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 消息已读
 */

public interface ReadedViewInter extends BaseViewInter {
     
ReadedParam getReadedParam();
void onReadedSuccess(String item);

}
