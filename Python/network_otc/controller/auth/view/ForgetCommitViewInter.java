package coin.otc.com.network.controller.auth.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.auth.param.ForgetCommitParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 3.找回密码提交
 */

public interface ForgetCommitViewInter extends BaseViewInter {
     
ForgetCommitParam getForgetCommitParam();
void onForgetCommitSuccess(String item);

}
