package coin.otc.com.network.controller.publicad.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.publicad.item.DetailItem;
import coin.otc.com.network.controller.publicad.param.DetailParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 买入、售出详情页信息
 */

public interface DetailViewInter extends BaseViewInter {
     
DetailParam getDetailParam();
void onDetailSuccess(DetailItem item);

}
