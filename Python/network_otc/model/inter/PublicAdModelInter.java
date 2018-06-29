package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;
import coin.otc.com.network.controller.publicad.item.AdPublicCalcItem;

import coin.otc.com.network.controller.publicad.item.DetailItem;

import coin.otc.com.network.controller.publicad.item.AdPublicListItem;

import coin.otc.com.network.controller.publicad.item.MultipleSelectItem;

import coin.otc.com.network.controller.publicad.item.PayMinuteItem;



/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 广告公共接口
 */

public interface PublicAdModelInter extends BaseModelInter {
    
     
/**
*@param id 广告id 
*@param type 传递的数字计算类型:1金额、2数量 
*@param num 数字 
*@return 买入、售出计算
*/
Subscription adPublicCalc(long id,
int type,
double num,
 BaseSubscriberImpl<BaseResponseItem<AdPublicCalcItem>> subscriber);


/**
*@param id 广告id 
*@return 买入、售出详情页信息
*/
Subscription detail(long id,
 BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber);


/**
*@param offset 当前页起始行 
*@param limit 每页显示的记录条数 
*@param coinId 币种id 
*@param entrustType 交易类型:0买，1卖 
*@param countryCode 国家 
*@param currency 货币 
*@param payProvider 付款方式 
*@param needPhone 需手机验证 
*@param needRealName 需身份验证 
*@param niceName 用户昵称 
*@param minPrice 价格区间:小 
*@param maxPrice 价格区间:大 
*@param sort 排序字段: 价格price，交易次数tradeNum，注：不区分大小写 
*@param order 升降序: asc，desc 
*@return 在线出售、购买列表
*/
Subscription adPublicList(long offset,
long limit,
long coinId,
int entrustType,
String countryCode,
String currency,
long payProvider,
boolean needPhone,
boolean needRealName,
String niceName,
double minPrice,
double maxPrice,
String sort,
String order,
 BaseSubscriberImpl<BaseResponseItem<AdPublicListItem>> subscriber);


/**
*@param type 数据类型，如果需要多个，则以逗号分割 获取系统指定的下拉框数据，1身份认证-证件类型；2货币；3国家地区；4付款方式；5交易所；6买家申诉原因；7卖家申诉原因 
*@return 获取下拉框数据
*/
Subscription multipleSelect(String type,
 BaseSubscriberImpl<BaseResponseItem<MultipleSelectItem>> subscriber);


/**
*@param id 支付方式Id 
*@return 选择支付方式后，获取支付分钟限制范围
*/
Subscription payMinute(long id,
 BaseSubscriberImpl<BaseResponseItem<PayMinuteItem>> subscriber);



}
