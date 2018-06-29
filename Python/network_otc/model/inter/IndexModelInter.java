package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;
import coin.otc.com.network.controller.index.item.CoinListItem;


import coin.otc.com.network.controller.index.item.UserCenterItem;



/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 提示文案、公告相关
 */

public interface IndexModelInter extends BaseModelInter {
    
     
/**
*@return 获取虚拟币
*/
Subscription coinList( BaseSubscriberImpl<BaseResponseItem<List<CoinListItem>>> subscriber);


/**
*@param email 邮箱地址 
*@return 未登录用户发送激活链接
*/
Subscription reSendActiveEmail(String email,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param userId 用户id 
*@param st 登录后获取的ST,未登录就不要传 
*@return 用户主页获取用户基础信息 web端的不管
*/
Subscription userCenter(long userId,
String st,
 BaseSubscriberImpl<BaseResponseItem<UserCenterItem>> subscriber);



}
