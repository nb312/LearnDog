
package coin.otc.com.network.controller.coinoperation.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：新增提币申请接口
 */
public class CoinAddParam {

  
/**
* 币种id
*/
private long coinId;


/**
* 地址
*/
private String address;


/**
* 提出数量
*/
private double amount;


/**
* 手续费,2期,不要传值
*/
private double fees;


/**
* 矿工费,2期,不要传值
*/
private double minerFees;


/**
* 实际到账
*/
private String relAmount;


/**
* 资金密码
*/
private String tradePwd;


/**
* 备注
*/
private String remark;


public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}

public void setAddress(String address){
this.address = address;
}

public String getAddress(){
 return this.address;
}

public void setAmount(double amount){
this.amount = amount;
}

public double getAmount(){
 return this.amount;
}

public void setFees(double fees){
this.fees = fees;
}

public double getFees(){
 return this.fees;
}

public void setMinerFees(double minerFees){
this.minerFees = minerFees;
}

public double getMinerFees(){
 return this.minerFees;
}

public void setRelAmount(String relAmount){
this.relAmount = relAmount;
}

public String getRelAmount(){
 return this.relAmount;
}

public void setTradePwd(String tradePwd){
this.tradePwd = tradePwd;
}

public String getTradePwd(){
 return this.tradePwd;
}

public void setRemark(String remark){
this.remark = remark;
}

public String getRemark(){
 return this.remark;
}


}

