package coin.otc.com.network.controller.userrelation.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.userrelation.item.DetailItem;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 用户交易统计信息
 */

public interface DetailViewInter extends BaseViewInter {
     void onDetailSuccess(DetailItem item);

}
