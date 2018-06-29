package coin.otc.com.network.controller.virtualaddress.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.virtualaddress.item.InAddItem;
import coin.otc.com.network.controller.virtualaddress.param.InAddParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 新增充币地址
 */

public interface InAddViewInter extends BaseViewInter {
     
InAddParam getInAddParam();
void onInAddSuccess(InAddItem item);

}
