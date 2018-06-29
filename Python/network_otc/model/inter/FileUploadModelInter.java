package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;

import coin.otc.com.network.controller.fileupload.item.AvatarImgItem;

import coin.otc.com.network.controller.fileupload.item.GetFileStsItem;

import coin.otc.com.network.controller.fileupload.item.GetFileStyleItem;

import coin.otc.com.network.controller.fileupload.item.KycImgItem;




/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 文件上传相关接口
 */

public interface FileUploadModelInter extends BaseModelInter {
    
     
/**
*@param file 文件url 
*@return 上传用户头像-app专用
*/
Subscription avatarApp(String file,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param file file-Url 
*@return 上传用户头像
*/
Subscription avatarImg(String file,
 BaseSubscriberImpl<BaseResponseItem<AvatarImgItem>> subscriber);


/**
*@return 文件上传时，获取临时授权sts
*/
Subscription getFileSts( BaseSubscriberImpl<BaseResponseItem<GetFileStsItem>> subscriber);


/**
*@param fileUrl 文件url 
*@param code 上传业务类型，1banner，2kyc图片,不传，默认为2 
*@return kyc图片水印处理
*/
Subscription getFileStyle(String fileUrl,
String code,
 BaseSubscriberImpl<BaseResponseItem<GetFileStyleItem>> subscriber);


/**
*@param file file文件url 
*@return 上传kyc照片
*/
Subscription kycImg(String file,
 BaseSubscriberImpl<BaseResponseItem<KycImgItem>> subscriber);


/**
*@param file file文件url 
*@param category 类型：9工单文件 
*@return 上传文件
*/
Subscription upload(String file,
int category,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);



}
