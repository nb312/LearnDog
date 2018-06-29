package coin.otc.com.network.controller.traderecord.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.traderecord.item.ListJudgeItem;
import coin.otc.com.network.controller.traderecord.param.ListJudgeParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 最近收到的评价
 */

public interface ListJudgeViewInter extends BaseViewInter {
     
ListJudgeParam getListJudgeParam();
void onListJudgeSuccess(ListJudgeItem item);

}
