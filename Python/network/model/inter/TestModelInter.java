package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;



/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 我的广告列表
 */

public interface TestModelInter extends BaseModelInter {
    
     
/**
*@param time 时间戳 
*@param param 参数列表 
*@return 根据time和参数生成sign
*/
Subscription genSign(String time,
String param,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);



}
