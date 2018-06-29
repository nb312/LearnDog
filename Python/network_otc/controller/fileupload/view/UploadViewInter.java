package coin.otc.com.network.controller.fileupload.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.fileupload.param.UploadParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 上传文件
 */

public interface UploadViewInter extends BaseViewInter {
     
UploadParam getUploadParam();
void onUploadSuccess(String item);

}
