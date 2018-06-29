
package coin.otc.com.network.controller.publicad.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：在线出售、购买列表
 */
public class AdPublicListParam {

  
/**
* 当前页起始行
*/
private long offset;


/**
* 每页显示的记录条数
*/
private long limit;


/**
* 币种id
*/
private long coinId;


/**
* 交易类型:0买，1卖
*/
private int entrustType;


/**
* 国家
*/
private String countryCode;


/**
* 货币
*/
private String currency;


/**
* 付款方式
*/
private long payProvider;


/**
* 需手机验证
*/
private boolean needPhone;


/**
* 需身份验证
*/
private boolean needRealName;


/**
* 用户昵称
*/
private String niceName;


/**
* 价格区间:小
*/
private double minPrice;


/**
* 价格区间:大
*/
private double maxPrice;


/**
* 排序字段: 价格price，交易次数tradeNum，注：不区分大小写
*/
private String sort;


/**
* 升降序: asc，desc
*/
private String order;


public void setOffset(long offset){
this.offset = offset;
}

public long getOffset(){
 return this.offset;
}

public void setLimit(long limit){
this.limit = limit;
}

public long getLimit(){
 return this.limit;
}

public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}

public void setEntrustType(int entrustType){
this.entrustType = entrustType;
}

public int getEntrustType(){
 return this.entrustType;
}

public void setCountryCode(String countryCode){
this.countryCode = countryCode;
}

public String getCountryCode(){
 return this.countryCode;
}

public void setCurrency(String currency){
this.currency = currency;
}

public String getCurrency(){
 return this.currency;
}

public void setPayProvider(long payProvider){
this.payProvider = payProvider;
}

public long getPayProvider(){
 return this.payProvider;
}

public void setNeedPhone(boolean needPhone){
this.needPhone = needPhone;
}

public boolean isNeedPhone(){
 return this.needPhone;
}

public void setNeedRealName(boolean needRealName){
this.needRealName = needRealName;
}

public boolean isNeedRealName(){
 return this.needRealName;
}

public void setNiceName(String niceName){
this.niceName = niceName;
}

public String getNiceName(){
 return this.niceName;
}

public void setMinPrice(double minPrice){
this.minPrice = minPrice;
}

public double getMinPrice(){
 return this.minPrice;
}

public void setMaxPrice(double maxPrice){
this.maxPrice = maxPrice;
}

public double getMaxPrice(){
 return this.maxPrice;
}

public void setSort(String sort){
this.sort = sort;
}

public String getSort(){
 return this.sort;
}

public void setOrder(String order){
this.order = order;
}

public String getOrder(){
 return this.order;
}


}

