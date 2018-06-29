package coin.otc.com.network.controller.fileupload.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.fileupload.item.GetFileStyleItem;
import coin.otc.com.network.controller.fileupload.param.GetFileStyleParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: kyc图片水印处理
 */

public interface GetFileStyleViewInter extends BaseViewInter {
     
GetFileStyleParam getGetFileStyleParam();
void onGetFileStyleSuccess(GetFileStyleItem item);

}
