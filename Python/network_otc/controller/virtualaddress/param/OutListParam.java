
package coin.otc.com.network.controller.virtualaddress.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：获取提币地址列表
 */
public class OutListParam {

  
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

