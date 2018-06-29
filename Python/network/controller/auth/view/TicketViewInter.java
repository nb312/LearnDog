package com.haoyong.szzc.network.controller.auth.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import com.haoyong.szzc.network.controller.auth.item.TicketItem;
import com.haoyong.szzc.network.controller.auth.param.TicketParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 获取服务调用凭证接口
 */

public interface TicketViewInter extends BaseViewInter {
     
TicketParam getTicketParam();
void onTicketSuccess(TicketItem item);

}
