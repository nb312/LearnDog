package coin.otc.com.network.presenter;

import com.nb.libcommon.network.mvp.BasePresenterImpl;
import coin.otc.com.network.OTCResponseSubscriber;
import java.util.List;
import coin.otc.com.network.model.inter.MessageModelInter;
import coin.otc.com.network.presenter.inter.MessagePresenterInter;

import coin.otc.com.network.controller.message.view.DeletedViewInter;
import coin.otc.com.network.controller.message.view.DetailViewInter;
import coin.otc.com.network.controller.message.view.MessageListViewInter;
import coin.otc.com.network.controller.message.view.ReadedViewInter;
import coin.otc.com.network.controller.message.view.UnReadNumViewInter;
import coin.otc.com.network.controller.message.view.UnReadNumCategoryViewInter;
import coin.otc.com.network.controller.message.view.UnReadNumGroupViewInter;
import coin.otc.com.network.controller.message.param.DeletedParam;
import coin.otc.com.network.controller.message.param.DetailParam;
import coin.otc.com.network.controller.message.param.MessageListParam;
import coin.otc.com.network.controller.message.param.ReadedParam;
import coin.otc.com.network.controller.message.param.UnReadNumCategoryParam;
import coin.otc.com.network.controller.message.item.DetailItem;
import coin.otc.com.network.controller.message.item.MessageListItem;
import coin.otc.com.network.controller.message.item.UnReadNumGroupItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 消息 
 */
public class MessagePresenter extends BasePresenterImpl<MessageModelInter> implements MessagePresenterInter {
    public MessagePresenter(MessageModelInter modelInter) {
        super(modelInter);
    }
    
    
    @Override
    public void deleted(DeletedViewInter viewInter) {
        DeletedParam param = viewInter.getDeletedParam();
        addSubscription(mModelInter.deleted(param.getId(), new DeletedSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void detail(DetailViewInter viewInter) {
        DetailParam param = viewInter.getDetailParam();
        addSubscription(mModelInter.detail(param.getId(), new DetailSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void messageList(MessageListViewInter viewInter) {
        MessageListParam param = viewInter.getMessageListParam();
        addSubscription(mModelInter.messageList(param.getOffset(),param.getLimit(),param.getCategory(), new MessageListSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void readed(ReadedViewInter viewInter) {
        ReadedParam param = viewInter.getReadedParam();
        addSubscription(mModelInter.readed(param.getId(), new ReadedSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void unReadNum(UnReadNumViewInter viewInter) {
        
        addSubscription(mModelInter.unReadNum( new UnReadNumSubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void unReadNumCategory(UnReadNumCategoryViewInter viewInter) {
        UnReadNumCategoryParam param = viewInter.getUnReadNumCategoryParam();
        addSubscription(mModelInter.unReadNumCategory(param.getCategory(), new UnReadNumCategorySubscriber(viewInter, getFucName())));
    }

    
    @Override
    public void unReadNumGroup(UnReadNumGroupViewInter viewInter) {
        
        addSubscription(mModelInter.unReadNumGroup( new UnReadNumGroupSubscriber(viewInter, getFucName())));
    }

    
    
    
    /**
     * 网络回调: 单条消息删除
     */
    class DeletedSubscriber extends OTCResponseSubscriber<String, DeletedViewInter> {

        public DeletedSubscriber(DeletedViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onDeletedSuccess(item);
        }
    }
    

    /**
     * 网络回调: 消息详情
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
     * 网络回调: 我的消息列表
     */
    class MessageListSubscriber extends OTCResponseSubscriber<MessageListItem, MessageListViewInter> {

        public MessageListSubscriber(MessageListViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(MessageListItem item) {
            super.onStateSuccess(item);
            mViewInter.onMessageListSuccess(item);
        }
    }
    

    /**
     * 网络回调: 消息已读
     */
    class ReadedSubscriber extends OTCResponseSubscriber<String, ReadedViewInter> {

        public ReadedSubscriber(ReadedViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onReadedSuccess(item);
        }
    }
    

    /**
     * 网络回调: 我的未读消息数
     */
    class UnReadNumSubscriber extends OTCResponseSubscriber<String, UnReadNumViewInter> {

        public UnReadNumSubscriber(UnReadNumViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onUnReadNumSuccess(item);
        }
    }
    

    /**
     * 网络回调: 根据消息类型查询未读消息数
     */
    class UnReadNumCategorySubscriber extends OTCResponseSubscriber<String, UnReadNumCategoryViewInter> {

        public UnReadNumCategorySubscriber(UnReadNumCategoryViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(String item) {
            super.onStateSuccess(item);
            mViewInter.onUnReadNumCategorySuccess(item);
        }
    }
    

    /**
     * 网络回调: 分组获取所有类型的未读消息数
     */
    class UnReadNumGroupSubscriber extends OTCResponseSubscriber<List<UnReadNumGroupItem>, UnReadNumGroupViewInter> {

        public UnReadNumGroupSubscriber(UnReadNumGroupViewInter mViewInter, String name) {
            super(mViewInter, name);
        }

        @Override
        public void onStateSuccess(List<UnReadNumGroupItem> item) {
            super.onStateSuccess(item);
            mViewInter.onUnReadNumGroupSuccess(item);
        }
    }
    

    
}
