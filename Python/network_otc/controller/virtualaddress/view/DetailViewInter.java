package coin.otc.com.network.controller.virtualaddress.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.virtualaddress.item.DetailItem;
import coin.otc.com.network.controller.virtualaddress.param.DetailParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取充币地址
 */

public interface DetailViewInter extends BaseViewInter {
     
DetailParam getDetailParam();
void onDetailSuccess(DetailItem item);

}
