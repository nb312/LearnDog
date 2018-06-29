package coin.otc.com.network.controller.message.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.message.param.DeletedParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 单条消息删除
 */

public interface DeletedViewInter extends BaseViewInter {
     
DeletedParam getDeletedParam();
void onDeletedSuccess(String item);

}
