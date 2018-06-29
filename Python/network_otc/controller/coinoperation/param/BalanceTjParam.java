
package coin.otc.com.network.controller.coinoperation.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：交易明细页面：收到、发送统计
 */
public class BalanceTjParam {

  
/**
* 币种ID
*/
private long coinId;


/**
* 统计月份
*/
private String yearMonth;


public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}

public void setYearMonth(String yearMonth){
this.yearMonth = yearMonth;
}

public String getYearMonth(){
 return this.yearMonth;
}


}

