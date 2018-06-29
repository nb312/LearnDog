package coin.otc.com.network.controller.auth.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.auth.param.ForgetRequestParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 1.忘记密码请求接口
 */

public interface ForgetRequestViewInter extends BaseViewInter {
     
ForgetRequestParam getForgetRequestParam();
void onForgetRequestSuccess(String item);

}
