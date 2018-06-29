package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.userrelation.item.DetailItem;
import coin.otc.com.network.controller.userrelation.item.ListTrustItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:用户关系
 */
 public interface IUserRelationHttpService{
     
/**
* @return 用户交易统计信息
*/
@POST("user-relation/detail")
Observable<BaseResponseItem<DetailItem>> detail();




/**
* @param offset 当前页起始行
* @param limit 每页显示的记录条数
* @param type 查询类型：1信任我的人，2我信任的人，3我屏蔽的人
* @return 信任我的人、我信任的人、我屏蔽的人
*/
@GET("user-relation/list-trust")
Observable<BaseResponseItem<ListTrustItem>> listTrust(
@Query("offset") long offset
,@Query("limit") long limit
,@Query("type") int type
);




/**
* @param relationUserId 被屏蔽的用户id
* @param shield 0屏蔽、1取消屏蔽
* @return 屏蔽、取消屏蔽
*/
@POST("user-relation/shield")
Observable<BaseResponseItem<String>> shield(
@Query("relationUserId") long relationUserId
,@Query("shield") int shield
);




/**
* @param relationUserId 被信任的用户id
* @param trustType 0信任、1取消信任
* @return 信任、取消信任
*/
@POST("user-relation/trust")
Observable<BaseResponseItem<String>> trust(
@Query("relationUserId") long relationUserId
,@Query("trustType") int trustType
);




 }
