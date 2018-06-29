package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.traderecord.item.TradeRecordBuyItem;
import coin.otc.com.network.controller.traderecord.item.DetailItem;
import coin.otc.com.network.controller.traderecord.item.ListJudgeItem;
import coin.otc.com.network.controller.traderecord.item.TradeRecordListItem;
import coin.otc.com.network.controller.traderecord.item.TradeRecordSellItem;
import coin.otc.com.network.controller.traderecord.item.ReceiptItem;
import coin.otc.com.network.controller.traderecord.item.BaseInfoItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:交易相关接口
 */
 public interface ITradeRecordHttpService{
     
/**
* @param tradeNo 交易订单号
* @param reason 原因
* @param reasonId 申诉原因id，非必填，当用户自己输入原因时，此值为空
* @return 申诉
*/
@POST("tradeRecord/appeal")
Observable<BaseResponseItem<String>> appeal(
@Query("tradeNo") String tradeNo
,@Query("reason") String reason
,@Query("reasonId") int reasonId
);




/**
* @param advertiseId 广告ID
* @param quotedPrice 广告报价、单价
* @param money 买入金额
* @param count 买入数量
* @param platform 交易平台1web、2app、3api
* @param remark 交易留言
* @return 买入
*/
@POST("tradeRecord/buy")
Observable<BaseResponseItem<TradeRecordBuyItem>> tradeRecordBuy(
@Query("advertiseId") long advertiseId
,@Query("quotedPrice") double quotedPrice
,@Query("money") double money
,@Query("count") double count
,@Query("platform") int platform
,@Query("remark") String remark
);




/**
* @param tradeNo 交易订单号
* @return 取消
*/
@POST("tradeRecord/cancel")
Observable<BaseResponseItem<String>> cancel(
@Query("tradeNo") String tradeNo
);




/**
* @param id 交易主键id
* @return 交易详情
*/
@POST("tradeRecord/detail")
Observable<BaseResponseItem<DetailItem>> detail(
@Query("id") long id
);




/**
* @param tradeId 交易ID号
* @param level 评价级别:1好评、2中评、3差评
* @param content 评价内容
* @param requestCode 请求code
* @return 评价
*/
@POST("tradeRecord/evaluation")
Observable<BaseResponseItem<String>> evaluation(
@Query("tradeId") long tradeId
,@Query("level") int level
,@Query("content") String content
,@Query("requestCode") String requestCode
);




/**
* @param tradeNo 交易订单号
* @return 卖家放行币
*/
@POST("tradeRecord/grantCoin")
Observable<BaseResponseItem<String>> grantCoin(
@Query("tradeNo") String tradeNo
);




/**
* @param userId 用户id
* @param offset 当前页起始行
* @param limit 每页显示的记录条数
* @return 最近收到的评价
*/
@GET("tradeRecord/listJudge")
Observable<BaseResponseItem<ListJudgeItem>> listJudge(
@Query("userId") long userId
,@Query("offset") long offset
,@Query("limit") long limit
);




/**
* @param offset 当前页起始行
* @param limit 每页显示的记录条数
* @param type 列表类型：不传表示全部，1进行中，2已关闭
* @param entrustType 交易类型：0购买、1出售
* @return 交易列表
*/
@GET("tradeRecord/list")
Observable<BaseResponseItem<TradeRecordListItem>> tradeRecordList(
@Query("offset") long offset
,@Query("limit") long limit
,@Query("type") int type
,@Query("entrustType") int entrustType
);




/**
* @param tradeNo 交易订单号
* @return 买家完成付款
*/
@POST("tradeRecord/payComplate")
Observable<BaseResponseItem<String>> payComplate(
@Query("tradeNo") String tradeNo
);




/**
* @param advertiseId 广告ID
* @param quotedPrice 广告报价、单价
* @param money 售出金额
* @param count 售出数量
* @param platform 交易平台1web、2app、3api
* @param remark 交易留言
* @return 售出
*/
@POST("tradeRecord/sell")
Observable<BaseResponseItem<TradeRecordSellItem>> tradeRecordSell(
@Query("advertiseId") long advertiseId
,@Query("quotedPrice") double quotedPrice
,@Query("money") double money
,@Query("count") double count
,@Query("platform") int platform
,@Query("remark") String remark
);




/**
* @param tradeNo 交易订单号
* @return 重新开启托管：只有超时支付，系统自动取消的，才能开启
*/
@POST("tradeRecord/open-hosting")
Observable<BaseResponseItem<String>> openHosting(
@Query("tradeNo") String tradeNo
);




/**
* @param tradeNo 交易订单号
* @return 查看可打印的收据
*/
@POST("tradeRecord/receipt")
Observable<BaseResponseItem<ReceiptItem>> receipt(
@Query("tradeNo") String tradeNo
);




/**
* @param tradeNo 交易订单号
* @return 基础信息
*/
@GET("tradeRecord/base-info")
Observable<BaseResponseItem<BaseInfoItem>> baseInfo(
@Query("tradeNo") String tradeNo
);




 }
