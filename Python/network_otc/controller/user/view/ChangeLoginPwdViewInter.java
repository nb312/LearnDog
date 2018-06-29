package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.param.ChangeLoginPwdParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 修改登录密码
 */

public interface ChangeLoginPwdViewInter extends BaseViewInter {
     
ChangeLoginPwdParam getChangeLoginPwdParam();
void onChangeLoginPwdSuccess(String item);

}
