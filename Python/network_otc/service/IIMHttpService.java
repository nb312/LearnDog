package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.im.item.LoginInfoItem;
import coin.otc.com.network.controller.im.item.GetAccidItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:im相关接口
 */
 public interface IIMHttpService{
     
/**
* @return 获取im登录相关字段
*/
@GET("im/login-info")
Observable<BaseResponseItem<LoginInfoItem>> loginInfo();




/**
* @param userId 用户id
* @return 获取账户accid
*/
@GET("im/get-accid")
Observable<BaseResponseItem<GetAccidItem>> getAccid(
@Query("userId") long userId
);




 }
