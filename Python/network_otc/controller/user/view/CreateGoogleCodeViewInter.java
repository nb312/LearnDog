package coin.otc.com.network.controller.user.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.user.item.CreateGoogleCodeItem;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 生成谷歌验证器
 */

public interface CreateGoogleCodeViewInter extends BaseViewInter {
     void onCreateGoogleCodeSuccess(CreateGoogleCodeItem item);

}
