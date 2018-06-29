package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;

import coin.otc.com.network.controller.message.item.DetailItem;

import coin.otc.com.network.controller.message.item.MessageListItem;




import coin.otc.com.network.controller.message.item.UnReadNumGroupItem;



/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 消息
 */

public interface MessageModelInter extends BaseModelInter {
    
     
/**
*@param id 消息id 
*@return 单条消息删除
*/
Subscription deleted(long id,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param id 消息id 
*@return 消息详情
*/
Subscription detail(long id,
 BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber);


/**
*@param offset 当前页起始行 
*@param limit 每页显示的记录条数 
*@param category 消息类型:0交易,1客服,2系统,3评价,4聊天,不传则查全部 
*@return 我的消息列表
*/
Subscription messageList(long offset,
long limit,
int category,
 BaseSubscriberImpl<BaseResponseItem<MessageListItem>> subscriber);


/**
*@param id 消息id 
*@return 消息已读
*/
Subscription readed(long id,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@return 我的未读消息数
*/
Subscription unReadNum( BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param category 消息类型:0交易,1客服,2系统,3评价,4聊天 
*@return 根据消息类型查询未读消息数
*/
Subscription unReadNumCategory(int category,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@return 分组获取所有类型的未读消息数
*/
Subscription unReadNumGroup( BaseSubscriberImpl<BaseResponseItem<List<UnReadNumGroupItem>>> subscriber);



}
