package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;
import coin.otc.com.network.controller.description.item.GetAnnounceItem;

import coin.otc.com.network.controller.description.item.GetDescItem;

import coin.otc.com.network.controller.description.item.ListAnnounceItem;



/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 提示文案、公告相关
 */

public interface DescriptionModelInter extends BaseModelInter {
    
     
/**
*@param id id 
*@return 获取公告详情
*/
Subscription getAnnounce(long id,
 BaseSubscriberImpl<BaseResponseItem<GetAnnounceItem>> subscriber);


/**
*@param coinId 币种ID 
*@param lang 语言:1简体中文,2繁体中文,3英语 
*@return 获取提示文案
*/
Subscription getDesc(long coinId,
int lang,
 BaseSubscriberImpl<BaseResponseItem<GetDescItem>> subscriber);


/**
*@param offset 当前页起始行 
*@param limit 每页显示的记录条数 
*@return 公告列表
*/
Subscription listAnnounce(long offset,
long limit,
 BaseSubscriberImpl<BaseResponseItem<ListAnnounceItem>> subscriber);



}
