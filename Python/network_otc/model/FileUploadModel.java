package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IFileUploadHttpService;
import coin.otc.com.network.model.inter.FileUploadModelInter;
import coin.otc.com.network.controller.fileupload.item.AvatarImgItem;
import coin.otc.com.network.controller.fileupload.item.GetFileStsItem;
import coin.otc.com.network.controller.fileupload.item.GetFileStyleItem;
import coin.otc.com.network.controller.fileupload.item.KycImgItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：文件上传相关接口
 */

public class FileUploadModel extends BaseModelImpl implements FileUploadModelInter {
    
    @Override
    public Subscription avatarApp(String file, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IFileUploadHttpService.class).avatarApp(file), subscriber);
    }

    

    @Override
    public Subscription avatarImg(String file, BaseSubscriberImpl<BaseResponseItem<AvatarImgItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IFileUploadHttpService.class).avatarImg(file), subscriber);
    }

    

    @Override
    public Subscription getFileSts( BaseSubscriberImpl<BaseResponseItem<GetFileStsItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IFileUploadHttpService.class).getFileSts(), subscriber);
    }

    

    @Override
    public Subscription getFileStyle(String fileUrl,String code, BaseSubscriberImpl<BaseResponseItem<GetFileStyleItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IFileUploadHttpService.class).getFileStyle(fileUrl,code), subscriber);
    }

    

    @Override
    public Subscription kycImg(String file, BaseSubscriberImpl<BaseResponseItem<KycImgItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IFileUploadHttpService.class).kycImg(file), subscriber);
    }

    

    @Override
    public Subscription upload(String file,int category, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IFileUploadHttpService.class).upload(file,category), subscriber);
    }

    

}
