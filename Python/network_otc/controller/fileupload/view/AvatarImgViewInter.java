package coin.otc.com.network.controller.fileupload.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.fileupload.item.AvatarImgItem;
import coin.otc.com.network.controller.fileupload.param.AvatarImgParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 上传用户头像
 */

public interface AvatarImgViewInter extends BaseViewInter {
     
AvatarImgParam getAvatarImgParam();
void onAvatarImgSuccess(AvatarImgItem item);

}
