package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.FileUploadModelInter;
import coin.otc.com.network.presenter.inter.FileUploadPresenterInter;

import coin.otc.com.network.controller.fileupload.view.AvatarAppViewInter;
import coin.otc.com.network.controller.fileupload.view.AvatarImgViewInter;
import coin.otc.com.network.controller.fileupload.view.GetFileStsViewInter;
import coin.otc.com.network.controller.fileupload.view.GetFileStyleViewInter;
import coin.otc.com.network.controller.fileupload.view.KycImgViewInter;
import coin.otc.com.network.controller.fileupload.view.UploadViewInter;
import coin.otc.com.network.controller.fileupload.param.AvatarAppParam;
import coin.otc.com.network.controller.fileupload.param.AvatarImgParam;
import coin.otc.com.network.controller.fileupload.param.GetFileStyleParam;
import coin.otc.com.network.controller.fileupload.param.KycImgParam;
import coin.otc.com.network.controller.fileupload.param.UploadParam;
import coin.otc.com.network.controller.fileupload.item.AvatarImgItem;
import coin.otc.com.network.controller.fileupload.item.GetFileStsItem;
import coin.otc.com.network.controller.fileupload.item.GetFileStyleItem;
import coin.otc.com.network.controller.fileupload.item.KycImgItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 文件上传相关接口 
 */
public class FileUploadPresenter extends BasePresenterImpl<FileUploadModelInter> implements FileUploadPresenterInter {
    public FileUploadPresenter(FileUploadModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void avatarApp(AvatarAppViewInter viewInter) {
        AvatarAppParam param = viewInter.getAvatarAppParam();
        addSubscription(mModelInter.avatarApp(param.getFile(), new AvatarAppSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void avatarImg(AvatarImgViewInter viewInter) {
        AvatarImgParam param = viewInter.getAvatarImgParam();
        addSubscription(mModelInter.avatarImg(param.getFile(), new AvatarImgSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void getFileSts(GetFileStsViewInter viewInter) {
        
        addSubscription(mModelInter.getFileSts( new GetFileStsSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void getFileStyle(GetFileStyleViewInter viewInter) {
        GetFileStyleParam param = viewInter.getGetFileStyleParam();
        addSubscription(mModelInter.getFileStyle(param.getFileUrl(),param.getCode(), new GetFileStyleSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void kycImg(KycImgViewInter viewInter) {
        KycImgParam param = viewInter.getKycImgParam();
        addSubscription(mModelInter.kycImg(param.getFile(), new KycImgSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void upload(UploadViewInter viewInter) {
        UploadParam param = viewInter.getUploadParam();
        addSubscription(mModelInter.upload(param.getFile(),param.getCategory(), new UploadSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 上传用户头像-app专用
     */
    class AvatarAppSubscriber extends OTCResponseSubscriber<String, AvatarAppViewInter> {

        public AvatarAppSubscriber(AvatarAppViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onAvatarAppSuccess(item);
        }
    }
    

    /**
     * 网络回调: 上传用户头像
     */
    class AvatarImgSubscriber extends OTCResponseSubscriber<AvatarImgItem, AvatarImgViewInter> {

        public AvatarImgSubscriber(AvatarImgViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(AvatarImgItem item) {
            super.onStateSuccess(item);
            mViewInter.onAvatarImgSuccess(item);
        }
    }
    

    /**
     * 网络回调: 文件上传时，获取临时授权sts
     */
    class GetFileStsSubscriber extends OTCResponseSubscriber<GetFileStsItem, GetFileStsViewInter> {

        public GetFileStsSubscriber(GetFileStsViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(GetFileStsItem item) {
            super.onStateSuccess(item);
            mViewInter.onGetFileStsSuccess(item);
        }
    }
    

    /**
     * 网络回调: kyc图片水印处理
     */
    class GetFileStyleSubscriber extends OTCResponseSubscriber<GetFileStyleItem, GetFileStyleViewInter> {

        public GetFileStyleSubscriber(GetFileStyleViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(GetFileStyleItem item) {
            super.onStateSuccess(item);
            mViewInter.onGetFileStyleSuccess(item);
        }
    }
    

    /**
     * 网络回调: 上传kyc照片
     */
    class KycImgSubscriber extends OTCResponseSubscriber<KycImgItem, KycImgViewInter> {

        public KycImgSubscriber(KycImgViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(KycImgItem item) {
            super.onStateSuccess(item);
            mViewInter.onKycImgSuccess(item);
        }
    }
    

    /**
     * 网络回调: 上传文件
     */
    class UploadSubscriber extends OTCResponseSubscriber<String, UploadViewInter> {

        public UploadSubscriber(UploadViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onUploadSuccess(item);
        }
    }
    

    
}
