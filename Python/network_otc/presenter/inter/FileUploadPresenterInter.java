package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.fileupload.view.AvatarAppViewInter;
import coin.otc.com.network.controller.fileupload.view.AvatarImgViewInter;
import coin.otc.com.network.controller.fileupload.view.GetFileStsViewInter;
import coin.otc.com.network.controller.fileupload.view.GetFileStyleViewInter;
import coin.otc.com.network.controller.fileupload.view.KycImgViewInter;
import coin.otc.com.network.controller.fileupload.view.UploadViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：文件上传相关接口
 */

public interface FileUploadPresenterInter extends BasePresenterInter {
    
    /**
    * 上传用户头像-app专用
    */
    void avatarApp(AvatarAppViewInter viewInter);

    
    /**
    * 上传用户头像
    */
    void avatarImg(AvatarImgViewInter viewInter);

    
    /**
    * 文件上传时，获取临时授权sts
    */
    void getFileSts(GetFileStsViewInter viewInter);

    
    /**
    * kyc图片水印处理
    */
    void getFileStyle(GetFileStyleViewInter viewInter);

    
    /**
    * 上传kyc照片
    */
    void kycImg(KycImgViewInter viewInter);

    
    /**
    * 上传文件
    */
    void upload(UploadViewInter viewInter);

    
}
