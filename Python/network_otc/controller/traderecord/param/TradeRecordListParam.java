
package coin.otc.com.network.controller.traderecord.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：交易列表
 */
public class TradeRecordListParam {

  
/**
* 当前页起始行
*/
private long offset;


/**
* 每页显示的记录条数
*/
private long limit;


/**
* 列表类型：不传表示全部，1进行中，2已关闭
*/
private int type;


/**
* 交易类型：0购买、1出售
*/
private int entrustType;


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

public void setType(int type){
this.type = type;
}

public int getType(){
 return this.type;
}

public void setEntrustType(int entrustType){
this.entrustType = entrustType;
}

public int getEntrustType(){
 return this.entrustType;
}


}

