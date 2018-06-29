
package coin.otc.com.network.controller.advertise.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：发布广告时，计算价格
 */
public class CalcPriceParam {

  
/**
* 交易所id
*/
private long exchangeId;


/**
* 币种id
*/
private long coinId;


/**
* 货币
*/
private String currency;


/**
* 溢价
*/
private double premium;


public void setExchangeId(long exchangeId){
this.exchangeId = exchangeId;
}

public long getExchangeId(){
 return this.exchangeId;
}

public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}

public void setCurrency(String currency){
this.currency = currency;
}

public String getCurrency(){
 return this.currency;
}

public void setPremium(double premium){
this.premium = premium;
}

public double getPremium(){
 return this.premium;
}


}

