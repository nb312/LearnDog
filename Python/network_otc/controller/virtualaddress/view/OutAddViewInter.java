package coin.otc.com.network.controller.virtualaddress.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.virtualaddress.param.OutAddParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 新增提币地址
 */

public interface OutAddViewInter extends BaseViewInter {
     
OutAddParam getOutAddParam();
void onOutAddSuccess(String item);

}
