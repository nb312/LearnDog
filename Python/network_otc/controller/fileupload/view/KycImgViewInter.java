package coin.otc.com.network.controller.fileupload.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.fileupload.item.KycImgItem;
import coin.otc.com.network.controller.fileupload.param.KycImgParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 上传kyc照片
 */

public interface KycImgViewInter extends BaseViewInter {
     
KycImgParam getKycImgParam();
void onKycImgSuccess(KycImgItem item);

}
