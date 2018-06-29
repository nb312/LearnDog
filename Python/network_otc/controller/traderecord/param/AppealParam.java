
package coin.otc.com.network.controller.traderecord.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：申诉
 */
public class AppealParam {

  
/**
* 交易订单号
*/
private String tradeNo;


/**
* 原因
*/
private String reason;


/**
* 申诉原因id，非必填，当用户自己输入原因时，此值为空
*/
private int reasonId;


public void setTradeNo(String tradeNo){
this.tradeNo = tradeNo;
}

public String getTradeNo(){
 return this.tradeNo;
}

public void setReason(String reason){
this.reason = reason;
}

public String getReason(){
 return this.reason;
}

public void setReasonId(int reasonId){
this.reasonId = reasonId;
}

public int getReasonId(){
 return this.reasonId;
}


}

