package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;



/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 获取网易云消息
 */

public interface MsgSyncModelInter extends BaseModelInter {
    
     
/**
*@return msgSync
*/
Subscription msgSync( BaseSubscriberImpl<BaseResponseItem<String>> subscriber);



}
