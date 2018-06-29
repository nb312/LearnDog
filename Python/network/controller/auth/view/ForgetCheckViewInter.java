package com.haoyong.szzc.network.controller.auth.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import com.haoyong.szzc.network.controller.auth.item.ForgetCheckItem;
import com.haoyong.szzc.network.controller.auth.param.ForgetCheckParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 2.忘记密码，校验验证码
 */

public interface ForgetCheckViewInter extends BaseViewInter {
     
ForgetCheckParam getForgetCheckParam();
void onForgetCheckSuccess(ForgetCheckItem item);

}
