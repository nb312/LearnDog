
package coin.otc.com.network.controller.coinoperation.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：计算实际到帐金额、手续费
 */
public class CalcFeeParam {

  
/**
* 提币数量
*/
private double amount;


/**
* 币种ID
*/
private long coinId;


/**
* 矿工费,2期,不要传值
*/
private double minerFees;


public void setAmount(double amount){
this.amount = amount;
}

public double getAmount(){
 return this.amount;
}

public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}

public void setMinerFees(double minerFees){
this.minerFees = minerFees;
}

public double getMinerFees(){
 return this.minerFees;
}


}

