
package coin.otc.com.network.controller.coinoperation.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：分页获取充提记录接口
 */
public class CoinListParam {

  
/**
* 当前页起始行
*/
private long offset;


/**
* 每页显示的记录条数
*/
private long limit;


/**
* 操作类型：1充入、2提出
*/
private int operationType;


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

public void setOperationType(int operationType){
this.operationType = operationType;
}

public int getOperationType(){
 return this.operationType;
}


}

