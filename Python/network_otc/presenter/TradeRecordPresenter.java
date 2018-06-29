package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.TradeRecordModelInter;
import coin.otc.com.network.presenter.inter.TradeRecordPresenterInter;

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
import coin.otc.com.network.controller.traderecord.param.AppealParam;
import coin.otc.com.network.controller.traderecord.param.TradeRecordBuyParam;
import coin.otc.com.network.controller.traderecord.param.CancelParam;
import coin.otc.com.network.controller.traderecord.param.DetailParam;
import coin.otc.com.network.controller.traderecord.param.EvaluationParam;
import coin.otc.com.network.controller.traderecord.param.GrantCoinParam;
import coin.otc.com.network.controller.traderecord.param.ListJudgeParam;
import coin.otc.com.network.controller.traderecord.param.TradeRecordListParam;
import coin.otc.com.network.controller.traderecord.param.PayComplateParam;
import coin.otc.com.network.controller.traderecord.param.TradeRecordSellParam;
import coin.otc.com.network.controller.traderecord.param.OpenHostingParam;
import coin.otc.com.network.controller.traderecord.param.ReceiptParam;
import coin.otc.com.network.controller.traderecord.param.BaseInfoParam;
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
 * 交易相关接口 
 */
public class TradeRecordPresenter extends BasePresenterImpl<TradeRecordModelInter> implements TradeRecordPresenterInter {
    public TradeRecordPresenter(TradeRecordModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void appeal(AppealViewInter viewInter) {
        AppealParam param = viewInter.getAppealParam();
        addSubscription(mModelInter.appeal(param.getTradeNo(),param.getReason(),param.getReasonId(), new AppealSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void tradeRecordBuy(TradeRecordBuyViewInter viewInter) {
        TradeRecordBuyParam param = viewInter.getTradeRecordBuyParam();
        addSubscription(mModelInter.tradeRecordBuy(param.getAdvertiseId(),param.getQuotedPrice(),param.getMoney(),param.getCount(),param.getPlatform(),param.getRemark(), new TradeRecordBuySubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void cancel(CancelViewInter viewInter) {
        CancelParam param = viewInter.getCancelParam();
        addSubscription(mModelInter.cancel(param.getTradeNo(), new CancelSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void detail(DetailViewInter viewInter) {
        DetailParam param = viewInter.getDetailParam();
        addSubscription(mModelInter.detail(param.getId(), new DetailSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void evaluation(EvaluationViewInter viewInter) {
        EvaluationParam param = viewInter.getEvaluationParam();
        addSubscription(mModelInter.evaluation(param.getTradeId(),param.getLevel(),param.getContent(),param.getRequestCode(), new EvaluationSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void grantCoin(GrantCoinViewInter viewInter) {
        GrantCoinParam param = viewInter.getGrantCoinParam();
        addSubscription(mModelInter.grantCoin(param.getTradeNo(), new GrantCoinSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void listJudge(ListJudgeViewInter viewInter) {
        ListJudgeParam param = viewInter.getListJudgeParam();
        addSubscription(mModelInter.listJudge(param.getUserId(),param.getOffset(),param.getLimit(), new ListJudgeSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void tradeRecordList(TradeRecordListViewInter viewInter) {
        TradeRecordListParam param = viewInter.getTradeRecordListParam();
        addSubscription(mModelInter.tradeRecordList(param.getOffset(),param.getLimit(),param.getType(),param.getEntrustType(), new TradeRecordListSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void payComplate(PayComplateViewInter viewInter) {
        PayComplateParam param = viewInter.getPayComplateParam();
        addSubscription(mModelInter.payComplate(param.getTradeNo(), new PayComplateSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void tradeRecordSell(TradeRecordSellViewInter viewInter) {
        TradeRecordSellParam param = viewInter.getTradeRecordSellParam();
        addSubscription(mModelInter.tradeRecordSell(param.getAdvertiseId(),param.getQuotedPrice(),param.getMoney(),param.getCount(),param.getPlatform(),param.getRemark(), new TradeRecordSellSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void openHosting(OpenHostingViewInter viewInter) {
        OpenHostingParam param = viewInter.getOpenHostingParam();
        addSubscription(mModelInter.openHosting(param.getTradeNo(), new OpenHostingSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void receipt(ReceiptViewInter viewInter) {
        ReceiptParam param = viewInter.getReceiptParam();
        addSubscription(mModelInter.receipt(param.getTradeNo(), new ReceiptSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void baseInfo(BaseInfoViewInter viewInter) {
        BaseInfoParam param = viewInter.getBaseInfoParam();
        addSubscription(mModelInter.baseInfo(param.getTradeNo(), new BaseInfoSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 申诉
     */
    class AppealSubscriber extends OTCResponseSubscriber<String, AppealViewInter> {

        public AppealSubscriber(AppealViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onAppealSuccess(item);
        }
    }
    

    /**
     * 网络回调: 买入
     */
    class TradeRecordBuySubscriber extends OTCResponseSubscriber<TradeRecordBuyItem, TradeRecordBuyViewInter> {

        public TradeRecordBuySubscriber(TradeRecordBuyViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(TradeRecordBuyItem item) {
            super.onStateSuccess(item);
            mViewInter.onTradeRecordBuySuccess(item);
        }
    }
    

    /**
     * 网络回调: 取消
     */
    class CancelSubscriber extends OTCResponseSubscriber<String, CancelViewInter> {

        public CancelSubscriber(CancelViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onCancelSuccess(item);
        }
    }
    

    /**
     * 网络回调: 交易详情
     */
    class DetailSubscriber extends OTCResponseSubscriber<DetailItem, DetailViewInter> {

        public DetailSubscriber(DetailViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(DetailItem item) {
            super.onStateSuccess(item);
            mViewInter.onDetailSuccess(item);
        }
    }
    

    /**
     * 网络回调: 评价
     */
    class EvaluationSubscriber extends OTCResponseSubscriber<String, EvaluationViewInter> {

        public EvaluationSubscriber(EvaluationViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onEvaluationSuccess(item);
        }
    }
    

    /**
     * 网络回调: 卖家放行币
     */
    class GrantCoinSubscriber extends OTCResponseSubscriber<String, GrantCoinViewInter> {

        public GrantCoinSubscriber(GrantCoinViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onGrantCoinSuccess(item);
        }
    }
    

    /**
     * 网络回调: 最近收到的评价
     */
    class ListJudgeSubscriber extends OTCResponseSubscriber<ListJudgeItem, ListJudgeViewInter> {

        public ListJudgeSubscriber(ListJudgeViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(ListJudgeItem item) {
            super.onStateSuccess(item);
            mViewInter.onListJudgeSuccess(item);
        }
    }
    

    /**
     * 网络回调: 交易列表
     */
    class TradeRecordListSubscriber extends OTCResponseSubscriber<TradeRecordListItem, TradeRecordListViewInter> {

        public TradeRecordListSubscriber(TradeRecordListViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(TradeRecordListItem item) {
            super.onStateSuccess(item);
            mViewInter.onTradeRecordListSuccess(item);
        }
    }
    

    /**
     * 网络回调: 买家完成付款
     */
    class PayComplateSubscriber extends OTCResponseSubscriber<String, PayComplateViewInter> {

        public PayComplateSubscriber(PayComplateViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onPayComplateSuccess(item);
        }
    }
    

    /**
     * 网络回调: 售出
     */
    class TradeRecordSellSubscriber extends OTCResponseSubscriber<TradeRecordSellItem, TradeRecordSellViewInter> {

        public TradeRecordSellSubscriber(TradeRecordSellViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(TradeRecordSellItem item) {
            super.onStateSuccess(item);
            mViewInter.onTradeRecordSellSuccess(item);
        }
    }
    

    /**
     * 网络回调: 重新开启托管：只有超时支付，系统自动取消的，才能开启
     */
    class OpenHostingSubscriber extends OTCResponseSubscriber<String, OpenHostingViewInter> {

        public OpenHostingSubscriber(OpenHostingViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onOpenHostingSuccess(item);
        }
    }
    

    /**
     * 网络回调: 查看可打印的收据
     */
    class ReceiptSubscriber extends OTCResponseSubscriber<ReceiptItem, ReceiptViewInter> {

        public ReceiptSubscriber(ReceiptViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(ReceiptItem item) {
            super.onStateSuccess(item);
            mViewInter.onReceiptSuccess(item);
        }
    }
    

    /**
     * 网络回调: 基础信息
     */
    class BaseInfoSubscriber extends OTCResponseSubscriber<BaseInfoItem, BaseInfoViewInter> {

        public BaseInfoSubscriber(BaseInfoViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(BaseInfoItem item) {
            super.onStateSuccess(item);
            mViewInter.onBaseInfoSuccess(item);
        }
    }
    

    
}
