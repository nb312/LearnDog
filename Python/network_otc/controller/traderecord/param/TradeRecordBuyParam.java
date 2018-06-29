
package coin.otc.com.network.controller.traderecord.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：买入
 */
public class TradeRecordBuyParam {

  
/**
* 广告ID
*/
private long advertiseId;


/**
* 广告报价、单价
*/
private double quotedPrice;


/**
* 买入金额
*/
private double money;


/**
* 买入数量
*/
private double count;


/**
* 交易平台1web、2app、3api
*/
private int platform;


/**
* 交易留言
*/
private String remark;


public void setAdvertiseId(long advertiseId){
this.advertiseId = advertiseId;
}

public long getAdvertiseId(){
 return this.advertiseId;
}

public void setQuotedPrice(double quotedPrice){
this.quotedPrice = quotedPrice;
}

public double getQuotedPrice(){
 return this.quotedPrice;
}

public void setMoney(double money){
this.money = money;
}

public double getMoney(){
 return this.money;
}

public void setCount(double count){
this.count = count;
}

public double getCount(){
 return this.count;
}

public void setPlatform(int platform){
this.platform = platform;
}

public int getPlatform(){
 return this.platform;
}

public void setRemark(String remark){
this.remark = remark;
}

public String getRemark(){
 return this.remark;
}


}

