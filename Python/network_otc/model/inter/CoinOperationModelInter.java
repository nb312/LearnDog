package coin.otc.com.network.model.inter;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import com.nb.libcommon.network.mvp.inter.BaseModelInter;
import java.util.List;
import rx.Subscription;

import coin.otc.com.network.controller.coinoperation.item.AssetsItem;

import coin.otc.com.network.controller.coinoperation.item.BalanceChangeItem;

import coin.otc.com.network.controller.coinoperation.item.BalanceTjItem;

import coin.otc.com.network.controller.coinoperation.item.CalcFeeItem;




import coin.otc.com.network.controller.coinoperation.item.CoinListItem;


import coin.otc.com.network.controller.coinoperation.item.ShowBalanceItem;



/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相应接口: 币种相关接口
 */

public interface CoinOperationModelInter extends BaseModelInter {
    
     
/**
*@param coinId 币种id 
*@param address 地址 
*@param amount 提出数量 
*@param fees 手续费,2期,不要传值 
*@param minerFees 矿工费,2期,不要传值 
*@param relAmount 实际到账 
*@param tradePwd 资金密码 
*@param remark 备注 
*@return 新增提币申请接口
*/
Subscription coinAdd(long coinId,
String address,
double amount,
double fees,
double minerFees,
String relAmount,
String tradePwd,
String remark,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param coinId 币种ID 
*@return 我的资产
*/
Subscription assets(long coinId,
 BaseSubscriberImpl<BaseResponseItem<List<AssetsItem>>> subscriber);


/**
*@param offset 当前页起始行 
*@param limit 每页显示的记录条数 
*@param category 类型：0全部，1网络转入转出，2交易买入卖出 
*@param operationType 操作类型：category=2时，可选值:0买，1卖；category=1时，可选值:1充，2提 
*@param coinId 币种ID 
*@return 交易明细
*/
Subscription balanceChange(long offset,
long limit,
int category,
int operationType,
long coinId,
 BaseSubscriberImpl<BaseResponseItem<BalanceChangeItem>> subscriber);


/**
*@param coinId 币种ID 
*@param yearMonth 统计月份 
*@return 交易明细页面：收到、发送统计
*/
Subscription balanceTj(long coinId,
String yearMonth,
 BaseSubscriberImpl<BaseResponseItem<BalanceTjItem>> subscriber);


/**
*@param amount 提币数量 
*@param coinId 币种ID 
*@param minerFees 矿工费,2期,不要传值 
*@return 计算实际到帐金额、手续费
*/
Subscription calcFee(double amount,
long coinId,
double minerFees,
 BaseSubscriberImpl<BaseResponseItem<CalcFeeItem>> subscriber);


/**
*@param operateId 提出记录ID 
*@return 取消提币申请接口
*/
Subscription cancel(long operateId,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param operateId 提出记录ID 
*@return 删除提币申请接口
*/
Subscription delete(long operateId,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param id 流水记录id 
*@return 查看提现拒绝原因
*/
Subscription getRejectReason(long id,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param offset 当前页起始行 
*@param limit 每页显示的记录条数 
*@param operationType 操作类型：1充入、2提出 
*@return 分页获取充提记录接口
*/
Subscription coinList(long offset,
long limit,
int operationType,
 BaseSubscriberImpl<BaseResponseItem<CoinListItem>> subscriber);


/**
*@param id 提出记录ID 
*@return 重新发送邮件
*/
Subscription sendAffirmMail(long id,
 BaseSubscriberImpl<BaseResponseItem<String>> subscriber);


/**
*@param coinId 币种ID 
*@return 虚拟币提现时,显示余额、费率信息
*/
Subscription showBalance(long coinId,
 BaseSubscriberImpl<BaseResponseItem<ShowBalanceItem>> subscriber);



}
