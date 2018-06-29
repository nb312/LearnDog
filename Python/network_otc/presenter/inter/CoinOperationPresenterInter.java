package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.coinoperation.view.CoinAddViewInter;
import coin.otc.com.network.controller.coinoperation.view.AssetsViewInter;
import coin.otc.com.network.controller.coinoperation.view.BalanceChangeViewInter;
import coin.otc.com.network.controller.coinoperation.view.BalanceTjViewInter;
import coin.otc.com.network.controller.coinoperation.view.CalcFeeViewInter;
import coin.otc.com.network.controller.coinoperation.view.CancelViewInter;
import coin.otc.com.network.controller.coinoperation.view.DeleteViewInter;
import coin.otc.com.network.controller.coinoperation.view.GetRejectReasonViewInter;
import coin.otc.com.network.controller.coinoperation.view.CoinListViewInter;
import coin.otc.com.network.controller.coinoperation.view.SendAffirmMailViewInter;
import coin.otc.com.network.controller.coinoperation.view.ShowBalanceViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：币种相关接口
 */

public interface CoinOperationPresenterInter extends BasePresenterInter {
    
    /**
    * 新增提币申请接口
    */
    void coinAdd(CoinAddViewInter viewInter);

    
    /**
    * 我的资产
    */
    void assets(AssetsViewInter viewInter);

    
    /**
    * 交易明细
    */
    void balanceChange(BalanceChangeViewInter viewInter);

    
    /**
    * 交易明细页面：收到、发送统计
    */
    void balanceTj(BalanceTjViewInter viewInter);

    
    /**
    * 计算实际到帐金额、手续费
    */
    void calcFee(CalcFeeViewInter viewInter);

    
    /**
    * 取消提币申请接口
    */
    void cancel(CancelViewInter viewInter);

    
    /**
    * 删除提币申请接口
    */
    void delete(DeleteViewInter viewInter);

    
    /**
    * 查看提现拒绝原因
    */
    void getRejectReason(GetRejectReasonViewInter viewInter);

    
    /**
    * 分页获取充提记录接口
    */
    void coinList(CoinListViewInter viewInter);

    
    /**
    * 重新发送邮件
    */
    void sendAffirmMail(SendAffirmMailViewInter viewInter);

    
    /**
    * 虚拟币提现时,显示余额、费率信息
    */
    void showBalance(ShowBalanceViewInter viewInter);

    
}
