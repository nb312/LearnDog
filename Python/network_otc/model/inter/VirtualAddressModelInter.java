package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;
import coin.otc.com.network.controller.virtualaddress.item.InAddItem;

import coin.otc.com.network.controller.virtualaddress.item.DetailItem;



import coin.otc.com.network.controller.virtualaddress.item.OutListItem;




/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 虚拟币地址相关接口
 */

public interface VirtualAddressModelInter extends BaseModelInter {
    
     
/**
*@param coinId 币种ID 
*@return 新增充币地址
*/
Subscription inAdd(long coinId,
 BaseSubscriberImpl<BaseResponseItem<InAddItem>> subscriber);


/**
*@param coinId 币种简称 
*@return 获取充币地址
*/
Subscription detail(long coinId,
 BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber);


/**
*@param address 提币地址 
*@param tradePwd 资金密码 
*@param coinId 币种ID 
*@param remark 备注 
*@return 新增提币地址
*/
Subscription outAdd(String address,
String tradePwd,
long coinId,
String remark,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param ids id 组 
*@return 删除提币地址
*/
Subscription delete(String ids,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param coinId 币种ID 
*@return 获取提币地址列表
*/
Subscription outList(long coinId,
 BaseSubscriberImpl<BaseResponseItem<List<OutListItem>>> subscriber);


/**
*@param id 提币地址ID 
*@param remark 提币地址备注 
*@return 修改提币备注
*/
Subscription remark(long id,
String remark,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);



}
