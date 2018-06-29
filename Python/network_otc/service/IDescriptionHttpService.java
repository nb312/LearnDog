package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.description.item.GetAnnounceItem;
import coin.otc.com.network.controller.description.item.GetDescItem;
import coin.otc.com.network.controller.description.item.ListAnnounceItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:提示文案、公告相关
 */
 public interface IDescriptionHttpService{
     
/**
* @param id id
* @return 获取公告详情
*/
@POST("desc-public/get-announce")
Observable<BaseResponseItem<GetAnnounceItem>> getAnnounce(
@Query("id") long id
);




/**
* @param coinId 币种ID
* @param lang 语言:1简体中文,2繁体中文,3英语
* @return 获取提示文案
*/
@POST("desc-public/get-desc")
Observable<BaseResponseItem<GetDescItem>> getDesc(
@Query("coinId") long coinId
,@Query("lang") int lang
);




/**
* @param offset 当前页起始行
* @param limit 每页显示的记录条数
* @return 公告列表
*/
@GET("desc-public/list-announce")
Observable<BaseResponseItem<ListAnnounceItem>> listAnnounce(
@Query("offset") long offset
,@Query("limit") long limit
);




 }
