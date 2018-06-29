package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.VirtualAddressModelInter;
import coin.otc.com.network.presenter.inter.VirtualAddressPresenterInter;

import coin.otc.com.network.controller.virtualaddress.view.InAddViewInter;
import coin.otc.com.network.controller.virtualaddress.view.DetailViewInter;
import coin.otc.com.network.controller.virtualaddress.view.OutAddViewInter;
import coin.otc.com.network.controller.virtualaddress.view.DeleteViewInter;
import coin.otc.com.network.controller.virtualaddress.view.OutListViewInter;
import coin.otc.com.network.controller.virtualaddress.view.RemarkViewInter;
import coin.otc.com.network.controller.virtualaddress.param.InAddParam;
import coin.otc.com.network.controller.virtualaddress.param.DetailParam;
import coin.otc.com.network.controller.virtualaddress.param.OutAddParam;
import coin.otc.com.network.controller.virtualaddress.param.DeleteParam;
import coin.otc.com.network.controller.virtualaddress.param.OutListParam;
import coin.otc.com.network.controller.virtualaddress.param.RemarkParam;
import coin.otc.com.network.controller.virtualaddress.item.InAddItem;
import coin.otc.com.network.controller.virtualaddress.item.DetailItem;
import coin.otc.com.network.controller.virtualaddress.item.OutListItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 虚拟币地址相关接口 
 */
public class VirtualAddressPresenter extends BasePresenterImpl<VirtualAddressModelInter> implements VirtualAddressPresenterInter {
    public VirtualAddressPresenter(VirtualAddressModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void inAdd(InAddViewInter viewInter) {
        InAddParam param = viewInter.getInAddParam();
        addSubscription(mModelInter.inAdd(param.getCoinId(), new InAddSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void detail(DetailViewInter viewInter) {
        DetailParam param = viewInter.getDetailParam();
        addSubscription(mModelInter.detail(param.getCoinId(), new DetailSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void outAdd(OutAddViewInter viewInter) {
        OutAddParam param = viewInter.getOutAddParam();
        addSubscription(mModelInter.outAdd(param.getAddress(),param.getTradePwd(),param.getCoinId(),param.getRemark(), new OutAddSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void delete(DeleteViewInter viewInter) {
        DeleteParam param = viewInter.getDeleteParam();
        addSubscription(mModelInter.delete(param.getIds(), new DeleteSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void outList(OutListViewInter viewInter) {
        OutListParam param = viewInter.getOutListParam();
        addSubscription(mModelInter.outList(param.getCoinId(), new OutListSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void remark(RemarkViewInter viewInter) {
        RemarkParam param = viewInter.getRemarkParam();
        addSubscription(mModelInter.remark(param.getId(),param.getRemark(), new RemarkSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 新增充币地址
     */
    class InAddSubscriber extends OTCResponseSubscriber<InAddItem, InAddViewInter> {

        public InAddSubscriber(InAddViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(InAddItem item) {
            super.onStateSuccess(item);
            mViewInter.onInAddSuccess(item);
        }
    }
    

    /**
     * 网络回调: 获取充币地址
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
     * 网络回调: 新增提币地址
     */
    class OutAddSubscriber extends OTCResponseSubscriber<String, OutAddViewInter> {

        public OutAddSubscriber(OutAddViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onOutAddSuccess(item);
        }
    }
    

    /**
     * 网络回调: 删除提币地址
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
     * 网络回调: 获取提币地址列表
     */
    class OutListSubscriber extends OTCResponseSubscriber<List<OutListItem>, OutListViewInter> {

        public OutListSubscriber(OutListViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(List<OutListItem> item) {
            super.onStateSuccess(item);
            mViewInter.onOutListSuccess(item);
        }
    }
    

    /**
     * 网络回调: 修改提币备注
     */
    class RemarkSubscriber extends OTCResponseSubscriber<String, RemarkViewInter> {

        public RemarkSubscriber(RemarkViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onRemarkSuccess(item);
        }
    }
    

    
}
