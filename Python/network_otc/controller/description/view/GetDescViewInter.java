package coin.otc.com.network.controller.description.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.description.item.GetDescItem;
import coin.otc.com.network.controller.description.param.GetDescParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取提示文案
 */

public interface GetDescViewInter extends BaseViewInter {
     
GetDescParam getGetDescParam();
void onGetDescSuccess(GetDescItem item);

}
