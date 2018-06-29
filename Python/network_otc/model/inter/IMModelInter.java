package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;
import coin.otc.com.network.controller.im.item.LoginInfoItem;

import coin.otc.com.network.controller.im.item.GetAccidItem;



/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: im相关接口
 */

public interface IMModelInter extends BaseModelInter {
    
     
/**
*@return 获取im登录相关字段
*/
Subscription loginInfo( BaseSubscriberImpl<BaseResponseItem<LoginInfoItem>> subscriber);


/**
*@param userId 用户id 
*@return 获取账户accid
*/
Subscription getAccid(long userId,
 BaseSubscriberImpl<BaseResponseItem<GetAccidItem>> subscriber);



}
