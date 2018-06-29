package coin.otc.com.network.presenter.inter;

import com.nb.libcommon.network.mvp.inter.BasePresenterInter;
import java.util.List;

import coin.otc.com.network.controller.message.view.DeletedViewInter;
import coin.otc.com.network.controller.message.view.DetailViewInter;
import coin.otc.com.network.controller.message.view.MessageListViewInter;
import coin.otc.com.network.controller.message.view.ReadedViewInter;
import coin.otc.com.network.controller.message.view.UnReadNumViewInter;
import coin.otc.com.network.controller.message.view.UnReadNumCategoryViewInter;
import coin.otc.com.network.controller.message.view.UnReadNumGroupViewInter;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：消息
 */

public interface MessagePresenterInter extends BasePresenterInter {
    
    /**
    * 单条消息删除
    */
    void deleted(DeletedViewInter viewInter);

    
    /**
    * 消息详情
    */
    void detail(DetailViewInter viewInter);

    
    /**
    * 我的消息列表
    */
    void messageList(MessageListViewInter viewInter);

    
    /**
    * 消息已读
    */
    void readed(ReadedViewInter viewInter);

    
    /**
    * 我的未读消息数
    */
    void unReadNum(UnReadNumViewInter viewInter);

    
    /**
    * 根据消息类型查询未读消息数
    */
    void unReadNumCategory(UnReadNumCategoryViewInter viewInter);

    
    /**
    * 分组获取所有类型的未读消息数
    */
    void unReadNumGroup(UnReadNumGroupViewInter viewInter);

    
}
