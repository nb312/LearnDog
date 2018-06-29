package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.index.item.CoinListItem;
import coin.otc.com.network.controller.index.item.UserCenterItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:提示文案、公告相关
 */
 public interface IIndexHttpService{
     
/**
* @return 获取虚拟币
*/
@GET("index/coin/list")
Observable<BaseResponseItem<List<CoinListItem>>> coinList();




/**
* @param email 邮箱地址
* @return 未登录用户发送激活链接
*/
@GET("index/reSendActiveEmail")
Observable<BaseResponseItem<String>> reSendActiveEmail(
@Query("email") String email
);




/**
* @param userId 用户id
* @param st 登录后获取的ST,未登录就不要传
* @return 用户主页获取用户基础信息 web端的不管
*/
@GET("index/user-center")
Observable<BaseResponseItem<UserCenterItem>> userCenter(
@Query("userId") long userId
,@Query("st") String st
);




 }
