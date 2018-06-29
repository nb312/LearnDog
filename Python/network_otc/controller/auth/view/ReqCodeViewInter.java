package coin.otc.com.network.controller.auth.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;



/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取请求code
 */

public interface ReqCodeViewInter extends BaseViewInter {
     void onReqCodeSuccess(String item);

}
