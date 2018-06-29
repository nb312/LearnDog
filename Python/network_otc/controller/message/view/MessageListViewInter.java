package coin.otc.com.network.controller.message.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.message.item.MessageListItem;
import coin.otc.com.network.controller.message.param.MessageListParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 我的消息列表
 */

public interface MessageListViewInter extends BaseViewInter {
     
MessageListParam getMessageListParam();
void onMessageListSuccess(MessageListItem item);

}
