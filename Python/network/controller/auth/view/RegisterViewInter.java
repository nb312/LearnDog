package com.haoyong.szzc.network.controller.auth.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import com.haoyong.szzc.network.controller.auth.item.RegisterItem;
import com.haoyong.szzc.network.controller.auth.param.RegisterParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 注册接口
 */

public interface RegisterViewInter extends BaseViewInter {
     
RegisterParam getRegisterParam();
void onRegisterSuccess(RegisterItem item);

}
