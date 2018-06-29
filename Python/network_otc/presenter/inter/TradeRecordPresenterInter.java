package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.traderecord.view.AppealViewInter;
import coin.otc.com.network.controller.traderecord.view.TradeRecordBuyViewInter;
import coin.otc.com.network.controller.traderecord.view.CancelViewInter;
import coin.otc.com.network.controller.traderecord.view.DetailViewInter;
import coin.otc.com.network.controller.traderecord.view.EvaluationViewInter;
import coin.otc.com.network.controller.traderecord.view.GrantCoinViewInter;
import coin.otc.com.network.controller.traderecord.view.ListJudgeViewInter;
import coin.otc.com.network.controller.traderecord.view.TradeRecordListViewInter;
import coin.otc.com.network.controller.traderecord.view.PayComplateViewInter;
import coin.otc.com.network.controller.traderecord.view.TradeRecordSellViewInter;
import coin.otc.com.network.controller.traderecord.view.OpenHostingViewInter;
import coin.otc.com.network.controller.traderecord.view.ReceiptViewInter;
import coin.otc.com.network.controller.traderecord.view.BaseInfoViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：交易相关接口
 */

public interface TradeRecordPresenterInter extends BasePresenterInter {
    
    /**
    * 申诉
    */
    void appeal(AppealViewInter viewInter);

    
    /**
    * 买入
    */
    void tradeRecordBuy(TradeRecordBuyViewInter viewInter);

    
    /**
    * 取消
    */
    void cancel(CancelViewInter viewInter);

    
    /**
    * 交易详情
    */
    void detail(DetailViewInter viewInter);

    
    /**
    * 评价
    */
    void evaluation(EvaluationViewInter viewInter);

    
    /**
    * 卖家放行币
    */
    void grantCoin(GrantCoinViewInter viewInter);

    
    /**
    * 最近收到的评价
    */
    void listJudge(ListJudgeViewInter viewInter);

    
    /**
    * 交易列表
    */
    void tradeRecordList(TradeRecordListViewInter viewInter);

    
    /**
    * 买家完成付款
    */
    void payComplate(PayComplateViewInter viewInter);

    
    /**
    * 售出
    */
    void tradeRecordSell(TradeRecordSellViewInter viewInter);

    
    /**
    * 重新开启托管：只有超时支付，系统自动取消的，才能开启
    */
    void openHosting(OpenHostingViewInter viewInter);

    
    /**
    * 查看可打印的收据
    */
    void receipt(ReceiptViewInter viewInter);

    
    /**
    * 基础信息
    */
    void baseInfo(BaseInfoViewInter viewInter);

    
}
