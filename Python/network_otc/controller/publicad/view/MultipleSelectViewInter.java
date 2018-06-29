package coin.otc.com.network.controller.publicad.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.publicad.item.MultipleSelectItem;
import coin.otc.com.network.controller.publicad.param.MultipleSelectParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取下拉框数据
 */

public interface MultipleSelectViewInter extends BaseViewInter {
     
MultipleSelectParam getMultipleSelectParam();
void onMultipleSelectSuccess(MultipleSelectItem item);

}
