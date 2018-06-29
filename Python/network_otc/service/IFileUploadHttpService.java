package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.fileupload.item.AvatarImgItem;
import coin.otc.com.network.controller.fileupload.item.GetFileStsItem;
import coin.otc.com.network.controller.fileupload.item.GetFileStyleItem;
import coin.otc.com.network.controller.fileupload.item.KycImgItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:文件上传相关接口
 */
 public interface IFileUploadHttpService{
     
/**
* @param file 文件url
* @return 上传用户头像-app专用
*/
@POST("file/avatar-app")
Observable<BaseResponseItem<String>> avatarApp(
@Query("file") String file
);




/**
* @param file file-Url
* @return 上传用户头像
*/
@POST("file/avatar-img")
Observable<BaseResponseItem<AvatarImgItem>> avatarImg(
@Query("file") String file
);




/**
* @return 文件上传时，获取临时授权sts
*/
@GET("file/getFileSts")
Observable<BaseResponseItem<GetFileStsItem>> getFileSts();




/**
* @param fileUrl 文件url
* @param code 上传业务类型，1banner，2kyc图片,不传，默认为2
* @return kyc图片水印处理
*/
@GET("file/getFileStyle")
Observable<BaseResponseItem<GetFileStyleItem>> getFileStyle(
@Query("fileUrl") String fileUrl
,@Query("code") String code
);




/**
* @param file file文件url
* @return 上传kyc照片
*/
@GET("file/kyc-img")
Observable<BaseResponseItem<KycImgItem>> kycImg(
@Query("file") String file
);




/**
* @param file file文件url
* @param category 类型：9工单文件
* @return 上传文件
*/
@POST("file/upload")
Observable<BaseResponseItem<String>> upload(
@Query("file") String file
,@Query("category") int category
);




 }
