package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.message.item.DetailItem;
import coin.otc.com.network.controller.message.item.MessageListItem;
import coin.otc.com.network.controller.message.item.UnReadNumGroupItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:消息
 */
 public interface IMessageHttpService{
     
/**
* @param id 消息id
* @return 单条消息删除
*/
@POST("message/deleted")
Observable<BaseResponseItem<String>> deleted(
@Query("id") long id
);




/**
* @param id 消息id
* @return 消息详情
*/
@GET("message/detail")
Observable<BaseResponseItem<DetailItem>> detail(
@Query("id") long id
);




/**
* @param offset 当前页起始行
* @param limit 每页显示的记录条数
* @param category 消息类型:0交易,1客服,2系统,3评价,4聊天,不传则查全部
* @return 我的消息列表
*/
@GET("message/list")
Observable<BaseResponseItem<MessageListItem>> messageList(
@Query("offset") long offset
,@Query("limit") long limit
,@Query("category") int category
);




/**
* @param id 消息id
* @return 消息已读
*/
@POST("message/readed")
Observable<BaseResponseItem<String>> readed(
@Query("id") long id
);




/**
* @return 我的未读消息数
*/
@GET("message/unRead-num")
Observable<BaseResponseItem<String>> unReadNum();




/**
* @param category 消息类型:0交易,1客服,2系统,3评价,4聊天
* @return 根据消息类型查询未读消息数
*/
@GET("message/unRead-num-category")
Observable<BaseResponseItem<String>> unReadNumCategory(
@Query("category") int category
);




/**
* @return 分组获取所有类型的未读消息数
*/
@GET("message/unRead-num-group")
Observable<BaseResponseItem<List<UnReadNumGroupItem>>> unReadNumGroup();




 }
