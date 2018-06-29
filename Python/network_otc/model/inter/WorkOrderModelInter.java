package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;
import coin.otc.com.network.controller.workorder.item.DetailItem;

import coin.otc.com.network.controller.workorder.item.WorkOrderListItem;






/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 工单
 */

public interface WorkOrderModelInter extends BaseModelInter {
    
     
/**
*@param id 工单id 
*@return 工单详情
*/
Subscription detail(long id,
 BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber);


/**
*@param offset 当前页起始行 
*@param limit 每页显示的记录条数 
*@return 我的工单列表
*/
Subscription workOrderList(long offset,
long limit,
 BaseSubscriberImpl<BaseResponseItem<WorkOrderListItem>> subscriber);


/**
*@param category 工单类型:0举报,1反馈,2问题,3咨询,99其它 
*@param content 工单内容 
*@param associateNo 关联的工单号 
*@param fileStr 附件,多附件文件路径以逗号隔开 
*@param requestCode 请求code 
*@return 提交工单
*/
Subscription workOrderNew(int category,
String content,
String associateNo,
String fileStr,
String requestCode,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param id 工单id 
*@param content 回复内容 
*@param fileStr 附件,多附件文件路径以逗号隔开 
*@return 回复工单
*/
Subscription reply(long id,
String content,
String fileStr,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param advertiseId 广告id 
*@param content 举报内容 
*@param fileStr 附件,多附件文件路径以逗号隔开 
*@param requestCode 请求code 
*@return 举报
*/
Subscription tipOff(long advertiseId,
String content,
String fileStr,
String requestCode,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);



}
