
package coin.otc.com.network.controller.coinoperation.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：交易明细
 */
public class BalanceChangeParam {

  
/**
* 当前页起始行
*/
private long offset;


/**
* 每页显示的记录条数
*/
private long limit;


/**
* 类型：0全部，1网络转入转出，2交易买入卖出
*/
private int category;


/**
* 操作类型：category=2时，可选值:0买，1卖；category=1时，可选值:1充，2提
*/
private int operationType;


/**
* 币种ID
*/
private long coinId;


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

public void setCategory(int category){
this.category = category;
}

public int getCategory(){
 return this.category;
}

public void setOperationType(int operationType){
this.operationType = operationType;
}

public int getOperationType(){
 return this.operationType;
}

public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}


}

