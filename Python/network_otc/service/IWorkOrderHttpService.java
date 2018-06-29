package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.workorder.item.DetailItem;
import coin.otc.com.network.controller.workorder.item.WorkOrderListItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:工单
 */
 public interface IWorkOrderHttpService{
     
/**
* @param id 工单id
* @return 工单详情
*/
@GET("work-order/detail")
Observable<BaseResponseItem<DetailItem>> detail(
@Query("id") long id
);




/**
* @param offset 当前页起始行
* @param limit 每页显示的记录条数
* @return 我的工单列表
*/
@GET("work-order/list")
Observable<BaseResponseItem<WorkOrderListItem>> workOrderList(
@Query("offset") long offset
,@Query("limit") long limit
);




/**
* @param category 工单类型:0举报,1反馈,2问题,3咨询,99其它
* @param content 工单内容
* @param associateNo 关联的工单号
* @param fileStr 附件,多附件文件路径以逗号隔开
* @param requestCode 请求code
* @return 提交工单
*/
@POST("work-order/new")
Observable<BaseResponseItem<String>> workOrderNew(
@Query("category") int category
,@Query("content") String content
,@Query("associateNo") String associateNo
,@Query("fileStr") String fileStr
,@Query("requestCode") String requestCode
);




/**
* @param id 工单id
* @param content 回复内容
* @param fileStr 附件,多附件文件路径以逗号隔开
* @return 回复工单
*/
@POST("work-order/reply")
Observable<BaseResponseItem<String>> reply(
@Query("id") long id
,@Query("content") String content
,@Query("fileStr") String fileStr
);




/**
* @param advertiseId 广告id
* @param content 举报内容
* @param fileStr 附件,多附件文件路径以逗号隔开
* @param requestCode 请求code
* @return 举报
*/
@POST("work-order/tipOff")
Observable<BaseResponseItem<String>> tipOff(
@Query("advertiseId") long advertiseId
,@Query("content") String content
,@Query("fileStr") String fileStr
,@Query("requestCode") String requestCode
);




 }
