package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.item.InvitAuthListItem;
import coin.otc.com.network.controller.user.param.InvitAuthListParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取邀请的好友认证信息
 */

public interface InvitAuthListViewInter extends BaseViewInter {
     
InvitAuthListParam getInvitAuthListParam();
void onInvitAuthListSuccess(InvitAuthListItem item);

}
