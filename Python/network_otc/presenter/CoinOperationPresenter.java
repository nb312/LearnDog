package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.CoinOperationModelInter;
import coin.otc.com.network.presenter.inter.CoinOperationPresenterInter;

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
import coin.otc.com.network.controller.coinoperation.param.CoinAddParam;
import coin.otc.com.network.controller.coinoperation.param.AssetsParam;
import coin.otc.com.network.controller.coinoperation.param.BalanceChangeParam;
import coin.otc.com.network.controller.coinoperation.param.BalanceTjParam;
import coin.otc.com.network.controller.coinoperation.param.CalcFeeParam;
import coin.otc.com.network.controller.coinoperation.param.CancelParam;
import coin.otc.com.network.controller.coinoperation.param.DeleteParam;
import coin.otc.com.network.controller.coinoperation.param.GetRejectReasonParam;
import coin.otc.com.network.controller.coinoperation.param.CoinListParam;
import coin.otc.com.network.controller.coinoperation.param.SendAffirmMailParam;
import coin.otc.com.network.controller.coinoperation.param.ShowBalanceParam;
import coin.otc.com.network.controller.coinoperation.item.AssetsItem;
import coin.otc.com.network.controller.coinoperation.item.BalanceChangeItem;
import coin.otc.com.network.controller.coinoperation.item.BalanceTjItem;
import coin.otc.com.network.controller.coinoperation.item.CalcFeeItem;
import coin.otc.com.network.controller.coinoperation.item.CoinListItem;
import coin.otc.com.network.controller.coinoperation.item.ShowBalanceItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 币种相关接口 
 */
public class CoinOperationPresenter extends BasePresenterImpl<CoinOperationModelInter> implements CoinOperationPresenterInter {
    public CoinOperationPresenter(CoinOperationModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void coinAdd(CoinAddViewInter viewInter) {
        CoinAddParam param = viewInter.getCoinAddParam();
        addSubscription(mModelInter.coinAdd(param.getCoinId(),param.getAddress(),param.getAmount(),param.getFees(),param.getMinerFees(),param.getRelAmount(),param.getTradePwd(),param.getRemark(), new CoinAddSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void assets(AssetsViewInter viewInter) {
        AssetsParam param = viewInter.getAssetsParam();
        addSubscription(mModelInter.assets(param.getCoinId(), new AssetsSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void balanceChange(BalanceChangeViewInter viewInter) {
        BalanceChangeParam param = viewInter.getBalanceChangeParam();
        addSubscription(mModelInter.balanceChange(param.getOffset(),param.getLimit(),param.getCategory(),param.getOperationType(),param.getCoinId(), new BalanceChangeSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void balanceTj(BalanceTjViewInter viewInter) {
        BalanceTjParam param = viewInter.getBalanceTjParam();
        addSubscription(mModelInter.balanceTj(param.getCoinId(),param.getYearMonth(), new BalanceTjSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void calcFee(CalcFeeViewInter viewInter) {
        CalcFeeParam param = viewInter.getCalcFeeParam();
        addSubscription(mModelInter.calcFee(param.getAmount(),param.getCoinId(),param.getMinerFees(), new CalcFeeSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void cancel(CancelViewInter viewInter) {
        CancelParam param = viewInter.getCancelParam();
        addSubscription(mModelInter.cancel(param.getOperateId(), new CancelSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void delete(DeleteViewInter viewInter) {
        DeleteParam param = viewInter.getDeleteParam();
        addSubscription(mModelInter.delete(param.getOperateId(), new DeleteSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void getRejectReason(GetRejectReasonViewInter viewInter) {
        GetRejectReasonParam param = viewInter.getGetRejectReasonParam();
        addSubscription(mModelInter.getRejectReason(param.getId(), new GetRejectReasonSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void coinList(CoinListViewInter viewInter) {
        CoinListParam param = viewInter.getCoinListParam();
        addSubscription(mModelInter.coinList(param.getOffset(),param.getLimit(),param.getOperationType(), new CoinListSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void sendAffirmMail(SendAffirmMailViewInter viewInter) {
        SendAffirmMailParam param = viewInter.getSendAffirmMailParam();
        addSubscription(mModelInter.sendAffirmMail(param.getId(), new SendAffirmMailSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void showBalance(ShowBalanceViewInter viewInter) {
        ShowBalanceParam param = viewInter.getShowBalanceParam();
        addSubscription(mModelInter.showBalance(param.getCoinId(), new ShowBalanceSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 新增提币申请接口
     */
    class CoinAddSubscriber extends OTCResponseSubscriber<String, CoinAddViewInter> {

        public CoinAddSubscriber(CoinAddViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onCoinAddSuccess(item);
        }
    }
    

    /**
     * 网络回调: 我的资产
     */
    class AssetsSubscriber extends OTCResponseSubscriber<List<AssetsItem>, AssetsViewInter> {

        public AssetsSubscriber(AssetsViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(List<AssetsItem> item) {
            super.onStateSuccess(item);
            mViewInter.onAssetsSuccess(item);
        }
    }
    

    /**
     * 网络回调: 交易明细
     */
    class BalanceChangeSubscriber extends OTCResponseSubscriber<BalanceChangeItem, BalanceChangeViewInter> {

        public BalanceChangeSubscriber(BalanceChangeViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(BalanceChangeItem item) {
            super.onStateSuccess(item);
            mViewInter.onBalanceChangeSuccess(item);
        }
    }
    

    /**
     * 网络回调: 交易明细页面：收到、发送统计
     */
    class BalanceTjSubscriber extends OTCResponseSubscriber<BalanceTjItem, BalanceTjViewInter> {

        public BalanceTjSubscriber(BalanceTjViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(BalanceTjItem item) {
            super.onStateSuccess(item);
            mViewInter.onBalanceTjSuccess(item);
        }
    }
    

    /**
     * 网络回调: 计算实际到帐金额、手续费
     */
    class CalcFeeSubscriber extends OTCResponseSubscriber<CalcFeeItem, CalcFeeViewInter> {

        public CalcFeeSubscriber(CalcFeeViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(CalcFeeItem item) {
            super.onStateSuccess(item);
            mViewInter.onCalcFeeSuccess(item);
        }
    }
    

    /**
     * 网络回调: 取消提币申请接口
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
     * 网络回调: 删除提币申请接口
     */
    class DeleteSubscriber extends OTCResponseSubscriber<String, DeleteViewInter> {

        public DeleteSubscriber(DeleteViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onDeleteSuccess(item);
        }
    }
    

    /**
     * 网络回调: 查看提现拒绝原因
     */
    class GetRejectReasonSubscriber extends OTCResponseSubscriber<String, GetRejectReasonViewInter> {

        public GetRejectReasonSubscriber(GetRejectReasonViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onGetRejectReasonSuccess(item);
        }
    }
    

    /**
     * 网络回调: 分页获取充提记录接口
     */
    class CoinListSubscriber extends OTCResponseSubscriber<CoinListItem, CoinListViewInter> {

        public CoinListSubscriber(CoinListViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(CoinListItem item) {
            super.onStateSuccess(item);
            mViewInter.onCoinListSuccess(item);
        }
    }
    

    /**
     * 网络回调: 重新发送邮件
     */
    class SendAffirmMailSubscriber extends OTCResponseSubscriber<String, SendAffirmMailViewInter> {

        public SendAffirmMailSubscriber(SendAffirmMailViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onSendAffirmMailSuccess(item);
        }
    }
    

    /**
     * 网络回调: 虚拟币提现时,显示余额、费率信息
     */
    class ShowBalanceSubscriber extends OTCResponseSubscriber<ShowBalanceItem, ShowBalanceViewInter> {

        public ShowBalanceSubscriber(ShowBalanceViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(ShowBalanceItem item) {
            super.onStateSuccess(item);
            mViewInter.onShowBalanceSuccess(item);
        }
    }
    

    
}
