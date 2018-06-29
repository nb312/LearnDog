
package coin.otc.com.network.controller.traderecord.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：买家完成付款
 */
public class PayComplateParam {

  
/**
* 交易订单号
*/
private String tradeNo;


public void setTradeNo(String tradeNo){
this.tradeNo = tradeNo;
}

public String getTradeNo(){
 return this.tradeNo;
}


}

