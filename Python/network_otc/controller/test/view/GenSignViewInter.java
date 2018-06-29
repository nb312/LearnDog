package coin.otc.com.network.controller.test.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.test.param.GenSignParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 根据time和参数生成sign
 */

public interface GenSignViewInter extends BaseViewInter {
     
GenSignParam getGenSignParam();
void onGenSignSuccess(String item);

}
