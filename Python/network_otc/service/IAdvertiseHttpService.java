package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.advertise.item.CalcPriceItem;
import coin.otc.com.network.controller.advertise.item.AdvertiseGetItem;
import coin.otc.com.network.controller.advertise.item.ListMyAdItem;
import coin.otc.com.network.controller.advertise.item.NewAdItem;
import coin.otc.com.network.controller.advertise.item.UserAdItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:我的广告列表
 */
 public interface IAdvertiseHttpService{
     
/**
* @param exchangeId 交易所id
* @param coinId 币种id
* @param currency 货币
* @param premium 溢价
* @return 发布广告时，计算价格
*/
@POST("advertise/calcPrice")
Observable<BaseResponseItem<CalcPriceItem>> calcPrice(
@Query("exchangeId") long exchangeId
,@Query("coinId") long coinId
,@Query("currency") String currency
,@Query("premium") double premium
);




/**
* @param id 广告id
* @return 关闭广告
*/
@POST("advertise/close")
Observable<BaseResponseItem<String>> close(
@Query("id") long id
);




/**
* @param id 广告id
* @return 删除广告
*/
@POST("advertise/delete")
Observable<BaseResponseItem<String>> delete(
@Query("id") long id
);




/**
* @param id 广告id
* @return 进入编辑页，获取广告信息
*/
@POST("advertise/get")
Observable<BaseResponseItem<AdvertiseGetItem>> advertiseGet(
@Query("id") long id
);




/**
* @param offset 当前页起始行
* @param limit 每页显示的记录条数
* @param type 列表类型：不传表示全部，1进行中，2已关闭
* @param coinId 币种id
* @param entrustType 广告类型：0买，1卖
* @return 我的广告列表：包含全部、进行中、已关闭，用参数type区分
*/
@GET("advertise/listMyAd")
Observable<BaseResponseItem<ListMyAdItem>> listMyAd(
@Query("offset") long offset
,@Query("limit") long limit
,@Query("type") int type
,@Query("coinId") long coinId
,@Query("entrustType") int entrustType
);




/**
* @param id 编辑广告时,必填
* @param entrustType 交易类型：0在线购买，1在线出售
* @param coinId 币种ID
* @param country 国家地区
* @param currency 货币
* @param payProvider 收款方式
* @param payProviderName 收款方式名称，当payProvider为其它时，此项必填
* @param message 交易条款
* @param premium 溢价,百分比格式，当非固定价格时，此项必填
* @param formula 计价公式，当非固定价格时，此项必填
* @param exchangeId 交易所ID，当非固定价格时，此项必填
* @param price 价格
* @param minAmount 最小限额
* @param maxAmount 最大限额
* @param payMinute 付款期限，仅在线购买时有此值
* @param isNew 是否是新发布广告, true新发布,false编辑
* @param fixedPrice 是否固定价格
* @param limitAuth 仅限身份验证人员
* @param limitTrusted 仅限受信任的交易者
* @param limitPhone 仅限手机验证人员
* @param openTimeJsonStr 开放时间Json字符串格式,id主键id(编辑时必填), week星期, startTime、endTime可以为空，为空时，默认全天开放
* @param requestCode 请求code
* @return 发布广告
*/
@POST("advertise/newAd")
Observable<BaseResponseItem<NewAdItem>> newAd(
@Query("id") long id
,@Query("entrustType") int entrustType
,@Query("coinId") long coinId
,@Query("country") String country
,@Query("currency") String currency
,@Query("payProvider") long payProvider
,@Query("payProviderName") String payProviderName
,@Query("message") String message
,@Query("premium") double premium
,@Query("formula") String formula
,@Query("exchangeId") int exchangeId
,@Query("price") double price
,@Query("minAmount") double minAmount
,@Query("maxAmount") double maxAmount
,@Query("payMinute") int payMinute
,@Query("isNew") boolean isNew
,@Query("fixedPrice") boolean fixedPrice
,@Query("limitAuth") boolean limitAuth
,@Query("limitTrusted") boolean limitTrusted
,@Query("limitPhone") boolean limitPhone
,@Query("openTimeJsonStr") String openTimeJsonStr
,@Query("requestCode") String requestCode
);




/**
* @param id 广告id
* @return 开启广告
*/
@POST("advertise/open")
Observable<BaseResponseItem<String>> advertiseOpen(
@Query("id") long id
);




/**
* @param buyVacation 买家是否休假 默认true
* @param sellVacation 卖家是否休假 默认false
* @return 广告设置 app没有用到 并且我update-vacation-status改为了update-vacation-status-test
*/
@POST("advertise/update-vacation-status-test")
Observable<BaseResponseItem<String>> updateVacationStatusTest(
@Query("buyVacation") boolean buyVacation
,@Query("sellVacation") boolean sellVacation
);




/**
* @param vacation 是否休假 默认true
* @param entrustType 交易类型
* @return 广告设置
*/
@POST("advertise/updateVacationStatus")
Observable<BaseResponseItem<String>> updateVacationStatus(
@Query("vacation") boolean vacation
,@Query("entrustType") int entrustType
);




/**
* @param offset 当前页起始行
* @param limit 每页显示的记录条数
* @param userId 用户id
* @param entrustType 广告类型：0购买、1出售
* @return 用户主页：发布的广告
*/
@GET("advertise/userAd")
Observable<BaseResponseItem<UserAdItem>> userAd(
@Query("offset") long offset
,@Query("limit") long limit
,@Query("userId") long userId
,@Query("entrustType") int entrustType
);




 }
