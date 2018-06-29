package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;



/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取用户姓名
 */

public interface GetUserRealNameViewInter extends BaseViewInter {
     void onGetUserRealNameSuccess(String item);

}
