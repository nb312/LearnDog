package coin.otc.com.network.controller.virtualaddress.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.virtualaddress.param.RemarkParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 修改提币备注
 */

public interface RemarkViewInter extends BaseViewInter {
     
RemarkParam getRemarkParam();
void onRemarkSuccess(String item);

}
