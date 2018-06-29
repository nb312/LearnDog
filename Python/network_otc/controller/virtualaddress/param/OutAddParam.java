
package coin.otc.com.network.controller.virtualaddress.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：新增提币地址
 */
public class OutAddParam {

  
/**
* 提币地址
*/
private String address;


/**
* 资金密码
*/
private String tradePwd;


/**
* 币种ID
*/
private long coinId;


/**
* 备注
*/
private String remark;


public void setAddress(String address){
this.address = address;
}

public String getAddress(){
 return this.address;
}

public void setTradePwd(String tradePwd){
this.tradePwd = tradePwd;
}

public String getTradePwd(){
 return this.tradePwd;
}

public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}

public void setRemark(String remark){
this.remark = remark;
}

public String getRemark(){
 return this.remark;
}


}

