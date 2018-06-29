package com.haoyong.szzc.network.controller.auth.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import com.haoyong.szzc.network.controller.auth.item.ForgetOverItem;
import com.haoyong.szzc.network.controller.auth.param.ForgetOverParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 3.忘记密码，提交密码修改
 */

public interface ForgetOverViewInter extends BaseViewInter {
     
ForgetOverParam getForgetOverParam();
void onForgetOverSuccess(ForgetOverItem item);

}
