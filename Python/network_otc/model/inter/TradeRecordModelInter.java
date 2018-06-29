package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;

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
 * 相应接口: 交易相关接口
 */

public interface TradeRecordModelInter extends BaseModelInter {
    
     
/**
*@param tradeNo 交易订单号 
*@param reason 原因 
*@param reasonId 申诉原因id，非必填，当用户自己输入原因时，此值为空 
*@return 申诉
*/
Subscription appeal(String tradeNo,
String reason,
int reasonId,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param advertiseId 广告ID 
*@param quotedPrice 广告报价、单价 
*@param money 买入金额 
*@param count 买入数量 
*@param platform 交易平台1web、2app、3api 
*@param remark 交易留言 
*@return 买入
*/
Subscription tradeRecordBuy(long advertiseId,
double quotedPrice,
double money,
double count,
int platform,
String remark,
 BaseSubscriberImpl<BaseResponseItem<TradeRecordBuyItem>> subscriber);


/**
*@param tradeNo 交易订单号 
*@return 取消
*/
Subscription cancel(String tradeNo,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param id 交易主键id 
*@return 交易详情
*/
Subscription detail(long id,
 BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber);


/**
*@param tradeId 交易ID号 
*@param level 评价级别:1好评、2中评、3差评 
*@param content 评价内容 
*@param requestCode 请求code 
*@return 评价
*/
Subscription evaluation(long tradeId,
int level,
String content,
String requestCode,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param tradeNo 交易订单号 
*@return 卖家放行币
*/
Subscription grantCoin(String tradeNo,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param userId 用户id 
*@param offset 当前页起始行 
*@param limit 每页显示的记录条数 
*@return 最近收到的评价
*/
Subscription listJudge(long userId,
long offset,
long limit,
 BaseSubscriberImpl<BaseResponseItem<ListJudgeItem>> subscriber);


/**
*@param offset 当前页起始行 
*@param limit 每页显示的记录条数 
*@param type 列表类型：不传表示全部，1进行中，2已关闭 
*@param entrustType 交易类型：0购买、1出售 
*@return 交易列表
*/
Subscription tradeRecordList(long offset,
long limit,
int type,
int entrustType,
 BaseSubscriberImpl<BaseResponseItem<TradeRecordListItem>> subscriber);


/**
*@param tradeNo 交易订单号 
*@return 买家完成付款
*/
Subscription payComplate(String tradeNo,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param advertiseId 广告ID 
*@param quotedPrice 广告报价、单价 
*@param money 售出金额 
*@param count 售出数量 
*@param platform 交易平台1web、2app、3api 
*@param remark 交易留言 
*@return 售出
*/
Subscription tradeRecordSell(long advertiseId,
double quotedPrice,
double money,
double count,
int platform,
String remark,
 BaseSubscriberImpl<BaseResponseItem<TradeRecordSellItem>> subscriber);


/**
*@param tradeNo 交易订单号 
*@return 重新开启托管：只有超时支付，系统自动取消的，才能开启
*/
Subscription openHosting(String tradeNo,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param tradeNo 交易订单号 
*@return 查看可打印的收据
*/
Subscription receipt(String tradeNo,
 BaseSubscriberImpl<BaseResponseItem<ReceiptItem>> subscriber);


/**
*@param tradeNo 交易订单号 
*@return 基础信息
*/
Subscription baseInfo(String tradeNo,
 BaseSubscriberImpl<BaseResponseItem<BaseInfoItem>> subscriber);



}
