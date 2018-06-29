package coin.otc.com.network.controller.userrelation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.userrelation.item.ListTrustItem;
import coin.otc.com.network.controller.userrelation.param.ListTrustParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 信任我的人、我信任的人、我屏蔽的人
 */

public interface ListTrustViewInter extends BaseViewInter {
     
ListTrustParam getListTrustParam();
void onListTrustSuccess(ListTrustItem item);

}
