
package coin.otc.com.network.controller.advertise.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：发布广告
 */
public class NewAdParam {

  
/**
* 编辑广告时,必填
*/
private long id;


/**
* 交易类型：0在线购买，1在线出售
*/
private int entrustType;


/**
* 币种ID
*/
private long coinId;


/**
* 国家地区
*/
private String country;


/**
* 货币
*/
private String currency;


/**
* 收款方式
*/
private long payProvider;


/**
* 收款方式名称，当payProvider为其它时，此项必填
*/
private String payProviderName;


/**
* 交易条款
*/
private String message;


/**
* 溢价,百分比格式，当非固定价格时，此项必填
*/
private double premium;


/**
* 计价公式，当非固定价格时，此项必填
*/
private String formula;


/**
* 交易所ID，当非固定价格时，此项必填
*/
private int exchangeId;


/**
* 价格
*/
private double price;


/**
* 最小限额
*/
private double minAmount;


/**
* 最大限额
*/
private double maxAmount;


/**
* 付款期限，仅在线购买时有此值
*/
private int payMinute;


/**
* 是否是新发布广告, true新发布,false编辑
*/
private boolean isNew;


/**
* 是否固定价格
*/
private boolean fixedPrice;


/**
* 仅限身份验证人员
*/
private boolean limitAuth;


/**
* 仅限受信任的交易者
*/
private boolean limitTrusted;


/**
* 仅限手机验证人员
*/
private boolean limitPhone;


/**
* 开放时间Json字符串格式,id主键id(编辑时必填), week星期, startTime、endTime可以为空，为空时，默认全天开放
*/
private String openTimeJsonStr;


/**
* 请求code
*/
private String requestCode;


public void setId(long id){
this.id = id;
}

public long getId(){
 return this.id;
}

public void setEntrustType(int entrustType){
this.entrustType = entrustType;
}

public int getEntrustType(){
 return this.entrustType;
}

public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}

public void setCountry(String country){
this.country = country;
}

public String getCountry(){
 return this.country;
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

public void setPayProviderName(String payProviderName){
this.payProviderName = payProviderName;
}

public String getPayProviderName(){
 return this.payProviderName;
}

public void setMessage(String message){
this.message = message;
}

public String getMessage(){
 return this.message;
}

public void setPremium(double premium){
this.premium = premium;
}

public double getPremium(){
 return this.premium;
}

public void setFormula(String formula){
this.formula = formula;
}

public String getFormula(){
 return this.formula;
}

public void setExchangeId(int exchangeId){
this.exchangeId = exchangeId;
}

public int getExchangeId(){
 return this.exchangeId;
}

public void setPrice(double price){
this.price = price;
}

public double getPrice(){
 return this.price;
}

public void setMinAmount(double minAmount){
this.minAmount = minAmount;
}

public double getMinAmount(){
 return this.minAmount;
}

public void setMaxAmount(double maxAmount){
this.maxAmount = maxAmount;
}

public double getMaxAmount(){
 return this.maxAmount;
}

public void setPayMinute(int payMinute){
this.payMinute = payMinute;
}

public int getPayMinute(){
 return this.payMinute;
}

public void setIsNew(boolean isNew){
this.isNew = isNew;
}

public boolean isIsNew(){
 return this.isNew;
}

public void setFixedPrice(boolean fixedPrice){
this.fixedPrice = fixedPrice;
}

public boolean isFixedPrice(){
 return this.fixedPrice;
}

public void setLimitAuth(boolean limitAuth){
this.limitAuth = limitAuth;
}

public boolean isLimitAuth(){
 return this.limitAuth;
}

public void setLimitTrusted(boolean limitTrusted){
this.limitTrusted = limitTrusted;
}

public boolean isLimitTrusted(){
 return this.limitTrusted;
}

public void setLimitPhone(boolean limitPhone){
this.limitPhone = limitPhone;
}

public boolean isLimitPhone(){
 return this.limitPhone;
}

public void setOpenTimeJsonStr(String openTimeJsonStr){
this.openTimeJsonStr = openTimeJsonStr;
}

public String getOpenTimeJsonStr(){
 return this.openTimeJsonStr;
}

public void setRequestCode(String requestCode){
this.requestCode = requestCode;
}

public String getRequestCode(){
 return this.requestCode;
}


}

