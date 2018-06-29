
package coin.otc.com.network.controller.virtualaddress.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：获取充币地址
 */
public class DetailParam {

  
/**
* 币种简称
*/
private long coinId;


public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}


}

