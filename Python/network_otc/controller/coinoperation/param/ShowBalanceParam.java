
package coin.otc.com.network.controller.coinoperation.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：虚拟币提现时,显示余额、费率信息
 */
public class ShowBalanceParam {

  
/**
* 币种ID
*/
private long coinId;


public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}


}

