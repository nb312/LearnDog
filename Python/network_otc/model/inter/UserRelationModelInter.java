package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;
import coin.otc.com.network.controller.userrelation.item.DetailItem;

import coin.otc.com.network.controller.userrelation.item.ListTrustItem;





/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 用户关系
 */

public interface UserRelationModelInter extends BaseModelInter {
    
     
/**
*@return 用户交易统计信息
*/
Subscription detail( BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber);


/**
*@param offset 当前页起始行 
*@param limit 每页显示的记录条数 
*@param type 查询类型：1信任我的人，2我信任的人，3我屏蔽的人 
*@return 信任我的人、我信任的人、我屏蔽的人
*/
Subscription listTrust(long offset,
long limit,
int type,
 BaseSubscriberImpl<BaseResponseItem<ListTrustItem>> subscriber);


/**
*@param relationUserId 被屏蔽的用户id 
*@param shield 0屏蔽、1取消屏蔽 
*@return 屏蔽、取消屏蔽
*/
Subscription shield(long relationUserId,
int shield,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param relationUserId 被信任的用户id 
*@param trustType 0信任、1取消信任 
*@return 信任、取消信任
*/
Subscription trust(long relationUserId,
int trustType,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);



}
