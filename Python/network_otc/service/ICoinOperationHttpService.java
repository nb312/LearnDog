package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.coinoperation.item.AssetsItem;
import coin.otc.com.network.controller.coinoperation.item.BalanceChangeItem;
import coin.otc.com.network.controller.coinoperation.item.BalanceTjItem;
import coin.otc.com.network.controller.coinoperation.item.CalcFeeItem;
import coin.otc.com.network.controller.coinoperation.item.CoinListItem;
import coin.otc.com.network.controller.coinoperation.item.ShowBalanceItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:币种相关接口
 */
 public interface ICoinOperationHttpService{
     
/**
* @param coinId 币种id
* @param address 地址
* @param amount 提出数量
* @param fees 手续费,2期,不要传值
* @param minerFees 矿工费,2期,不要传值
* @param relAmount 实际到账
* @param tradePwd 资金密码
* @param remark 备注
* @return 新增提币申请接口
*/
@POST("coin/add")
Observable<BaseResponseItem<String>> coinAdd(
@Query("coinId") long coinId
,@Query("address") String address
,@Query("amount") double amount
,@Query("fees") double fees
,@Query("minerFees") double minerFees
,@Query("relAmount") String relAmount
,@Query("tradePwd") String tradePwd
,@Query("remark") String remark
);




/**
* @param coinId 币种ID
* @return 我的资产
*/
@GET("coin/assets")
Observable<BaseResponseItem<List<AssetsItem>>> assets(
@Query("coinId") long coinId
);




/**
* @param offset 当前页起始行
* @param limit 每页显示的记录条数
* @param category 类型：0全部，1网络转入转出，2交易买入卖出
* @param operationType 操作类型：category=2时，可选值:0买，1卖；category=1时，可选值:1充，2提
* @param coinId 币种ID
* @return 交易明细
*/
@GET("coin/balance-change")
Observable<BaseResponseItem<BalanceChangeItem>> balanceChange(
@Query("offset") long offset
,@Query("limit") long limit
,@Query("category") int category
,@Query("operationType") int operationType
,@Query("coinId") long coinId
);




/**
* @param coinId 币种ID
* @param yearMonth 统计月份
* @return 交易明细页面：收到、发送统计
*/
@GET("coin/balance-tj")
Observable<BaseResponseItem<BalanceTjItem>> balanceTj(
@Query("coinId") long coinId
,@Query("yearMonth") String yearMonth
);




/**
* @param amount 提币数量
* @param coinId 币种ID
* @param minerFees 矿工费,2期,不要传值
* @return 计算实际到帐金额、手续费
*/
@GET("coin/calc-fee")
Observable<BaseResponseItem<CalcFeeItem>> calcFee(
@Query("amount") double amount
,@Query("coinId") long coinId
,@Query("minerFees") double minerFees
);




/**
* @param operateId 提出记录ID
* @return 取消提币申请接口
*/
@POST("coin/cancel")
Observable<BaseResponseItem<String>> cancel(
@Query("operateId") long operateId
);




/**
* @param operateId 提出记录ID
* @return 删除提币申请接口
*/
@POST("coin/delete")
Observable<BaseResponseItem<String>> delete(
@Query("operateId") long operateId
);




/**
* @param id 流水记录id
* @return 查看提现拒绝原因
*/
@GET("coin/get-RejectReason")
Observable<BaseResponseItem<String>> getRejectReason(
@Query("id") long id
);




/**
* @param offset 当前页起始行
* @param limit 每页显示的记录条数
* @param operationType 操作类型：1充入、2提出
* @return 分页获取充提记录接口
*/
@GET("coin/list")
Observable<BaseResponseItem<CoinListItem>> coinList(
@Query("offset") long offset
,@Query("limit") long limit
,@Query("operationType") int operationType
);




/**
* @param id 提出记录ID
* @return 重新发送邮件
*/
@POST("coin/send-affirm-mail")
Observable<BaseResponseItem<String>> sendAffirmMail(
@Query("id") long id
);




/**
* @param coinId 币种ID
* @return 虚拟币提现时,显示余额、费率信息
*/
@GET("coin/show-balance")
Observable<BaseResponseItem<ShowBalanceItem>> showBalance(
@Query("coinId") long coinId
);




 }
