package coin.otc.com.network.controller.fileupload.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.fileupload.item.GetFileStsItem;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 文件上传时，获取临时授权sts
 */

public interface GetFileStsViewInter extends BaseViewInter {
     void onGetFileStsSuccess(GetFileStsItem item);

}
