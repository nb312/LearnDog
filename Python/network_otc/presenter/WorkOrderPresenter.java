package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.WorkOrderModelInter;
import coin.otc.com.network.presenter.inter.WorkOrderPresenterInter;

import coin.otc.com.network.controller.workorder.view.DetailViewInter;
import coin.otc.com.network.controller.workorder.view.WorkOrderListViewInter;
import coin.otc.com.network.controller.workorder.view.WorkOrderNewViewInter;
import coin.otc.com.network.controller.workorder.view.ReplyViewInter;
import coin.otc.com.network.controller.workorder.view.TipOffViewInter;
import coin.otc.com.network.controller.workorder.param.DetailParam;
import coin.otc.com.network.controller.workorder.param.WorkOrderListParam;
import coin.otc.com.network.controller.workorder.param.WorkOrderNewParam;
import coin.otc.com.network.controller.workorder.param.ReplyParam;
import coin.otc.com.network.controller.workorder.param.TipOffParam;
import coin.otc.com.network.controller.workorder.item.DetailItem;
import coin.otc.com.network.controller.workorder.item.WorkOrderListItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 工单 
 */
public class WorkOrderPresenter extends BasePresenterImpl<WorkOrderModelInter> implements WorkOrderPresenterInter {
    public WorkOrderPresenter(WorkOrderModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void detail(DetailViewInter viewInter) {
        DetailParam param = viewInter.getDetailParam();
        addSubscription(mModelInter.detail(param.getId(), new DetailSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void workOrderList(WorkOrderListViewInter viewInter) {
        WorkOrderListParam param = viewInter.getWorkOrderListParam();
        addSubscription(mModelInter.workOrderList(param.getOffset(),param.getLimit(), new WorkOrderListSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void workOrderNew(WorkOrderNewViewInter viewInter) {
        WorkOrderNewParam param = viewInter.getWorkOrderNewParam();
        addSubscription(mModelInter.workOrderNew(param.getCategory(),param.getContent(),param.getAssociateNo(),param.getFileStr(),param.getRequestCode(), new WorkOrderNewSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void reply(ReplyViewInter viewInter) {
        ReplyParam param = viewInter.getReplyParam();
        addSubscription(mModelInter.reply(param.getId(),param.getContent(),param.getFileStr(), new ReplySubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void tipOff(TipOffViewInter viewInter) {
        TipOffParam param = viewInter.getTipOffParam();
        addSubscription(mModelInter.tipOff(param.getAdvertiseId(),param.getContent(),param.getFileStr(),param.getRequestCode(), new TipOffSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 工单详情
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
     * 网络回调: 我的工单列表
     */
    class WorkOrderListSubscriber extends OTCResponseSubscriber<WorkOrderListItem, WorkOrderListViewInter> {

        public WorkOrderListSubscriber(WorkOrderListViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(WorkOrderListItem item) {
            super.onStateSuccess(item);
            mViewInter.onWorkOrderListSuccess(item);
        }
    }
    

    /**
     * 网络回调: 提交工单
     */
    class WorkOrderNewSubscriber extends OTCResponseSubscriber<String, WorkOrderNewViewInter> {

        public WorkOrderNewSubscriber(WorkOrderNewViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onWorkOrderNewSuccess(item);
        }
    }
    

    /**
     * 网络回调: 回复工单
     */
    class ReplySubscriber extends OTCResponseSubscriber<String, ReplyViewInter> {

        public ReplySubscriber(ReplyViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onReplySuccess(item);
        }
    }
    

    /**
     * 网络回调: 举报
     */
    class TipOffSubscriber extends OTCResponseSubscriber<String, TipOffViewInter> {

        public TipOffSubscriber(TipOffViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onTipOffSuccess(item);
        }
    }
    

    
}
