package coin.otc.com.network.controller.fileupload.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.fileupload.param.AvatarAppParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 上传用户头像-app专用
 */

public interface AvatarAppViewInter extends BaseViewInter {
     
AvatarAppParam getAvatarAppParam();
void onAvatarAppSuccess(String item);

}
