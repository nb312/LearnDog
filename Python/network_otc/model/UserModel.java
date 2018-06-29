package coin.otc.com.network.model;

import com.nb.libcommon.network.mvp.BaseModelImpl;
import com.nb.libcommon.network.mvp.BaseResponseItem;
import com.nb.libcommon.network.mvp.BaseSubscriberImpl;
import java.util.List;

import coin.otc.com.network.service.IUserHttpService;
import coin.otc.com.network.model.inter.UserModelInter;
import coin.otc.com.network.controller.user.item.BaseInfoItem;
import coin.otc.com.network.controller.user.item.CreateGoogleCodeItem;
import coin.otc.com.network.controller.user.item.DetailItem;
import coin.otc.com.network.controller.user.item.GetSelectDataItem;
import coin.otc.com.network.controller.user.item.GetUserGoogleAuthItem;
import coin.otc.com.network.controller.user.item.GoogleRuleItem;
import coin.otc.com.network.controller.user.item.InvitAuthListItem;
import coin.otc.com.network.controller.user.item.LastLoginLogItem;
import coin.otc.com.network.controller.user.item.LoginLogItem;
import coin.otc.com.network.controller.user.item.RealInfoItem;

import rx.Subscription;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 相关接口：用户相关接口
 */

public class UserModel extends BaseModelImpl implements UserModelInter {
    
    @Override
    public Subscription baseInfo( BaseSubscriberImpl<BaseResponseItem<BaseInfoItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).baseInfo(), subscriber);
    }

    

    @Override
    public Subscription bindEmail(String email,String code, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).bindEmail(email,code), subscriber);
    }

    

    @Override
    public Subscription bindGoogleCode(String code,String emailCode, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).bindGoogleCode(code,emailCode), subscriber);
    }

    

    @Override
    public Subscription bindNewPhone(String countryCode,String phone,String code, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).bindNewPhone(countryCode,phone,code), subscriber);
    }

    

    @Override
    public Subscription bindPhone(String countryCode,String phone,String code, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).bindPhone(countryCode,phone,code), subscriber);
    }

    

    @Override
    public Subscription changeLoginPwd(String oldPwd,String newPwd,String code, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).changeLoginPwd(oldPwd,newPwd,code), subscriber);
    }

    

    @Override
    public Subscription changeTradePwd(String oldPwd,String newPwd,String code, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).changeTradePwd(oldPwd,newPwd,code), subscriber);
    }

    

    @Override
    public Subscription checkOldPhoneCode(String code, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).checkOldPhoneCode(code), subscriber);
    }

    

    @Override
    public Subscription createGoogleCode( BaseSubscriberImpl<BaseResponseItem<CreateGoogleCodeItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).createGoogleCode(), subscriber);
    }

    

    @Override
    public Subscription createInvitLink( BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).createInvitLink(), subscriber);
    }

    

    @Override
    public Subscription detail( BaseSubscriberImpl<BaseResponseItem<DetailItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).detail(), subscriber);
    }

    

    @Override
    public Subscription getRejectReason( BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).getRejectReason(), subscriber);
    }

    

    @Override
    public Subscription getSelectData(String type, BaseSubscriberImpl<BaseResponseItem<List<GetSelectDataItem>>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).getSelectData(type), subscriber);
    }

    

    @Override
    public Subscription getUserGoogleAuth(String code, BaseSubscriberImpl<BaseResponseItem<GetUserGoogleAuthItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).getUserGoogleAuth(code), subscriber);
    }

    

    @Override
    public Subscription getUserRealName( BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).getUserRealName(), subscriber);
    }

    

    @Override
    public Subscription googleRule( BaseSubscriberImpl<BaseResponseItem<GoogleRuleItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).googleRule(), subscriber);
    }

    

    @Override
    public Subscription updateRule(int rule,boolean isOpen, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).updateRule(rule,isOpen), subscriber);
    }

    

    @Override
    public Subscription invitAuthList(int rule,boolean isOpen, BaseSubscriberImpl<BaseResponseItem<InvitAuthListItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).invitAuthList(rule,isOpen), subscriber);
    }

    

    @Override
    public Subscription lastLoginLog( BaseSubscriberImpl<BaseResponseItem<LastLoginLogItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).lastLoginLog(), subscriber);
    }

    

    @Override
    public Subscription loginLog(long offset,long limit, BaseSubscriberImpl<BaseResponseItem<LoginLogItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).loginLog(offset,limit), subscriber);
    }

    

    @Override
    public Subscription reSendActiveLink( BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).reSendActiveLink(), subscriber);
    }

    

    @Override
    public Subscription realInfo( BaseSubscriberImpl<BaseResponseItem<RealInfoItem>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).realInfo(), subscriber);
    }

    

    @Override
    public Subscription realName(String identityType,String firstName,String familyName,String region,String identityNo,String identityOnurl,String identityOffurl,String identityHoldurl, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).realName(identityType,firstName,familyName,region,identityNo,identityOnurl,identityOffurl,identityHoldurl), subscriber);
    }

    

    @Override
    public Subscription selfCenter( BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).selfCenter(), subscriber);
    }

    

    @Override
    public Subscription sendBindEmailCode(String email, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).sendBindEmailCode(email), subscriber);
    }

    

    @Override
    public Subscription sendEmailVerCode(int type, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).sendEmailVerCode(type), subscriber);
    }

    

    @Override
    public Subscription sendSmsCodeByCountry(String countryCode,String phone,int businessCode, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).sendSmsCodeByCountry(countryCode,phone,businessCode), subscriber);
    }

    

    @Override
    public Subscription sendSmsVerCode(int type, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).sendSmsVerCode(type), subscriber);
    }

    

    @Override
    public Subscription setTradePwd(String pwd,String code, BaseSubscriberImpl<BaseResponseItem<String>> subscriber) {
        return normalSubscribe(getVersionHttpService(IUserHttpService.class).setTradePwd(pwd,code), subscriber);
    }

    

}
