
package coin.otc.com.network.controller.userrelation.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：信任我的人、我信任的人、我屏蔽的人
 */
public class ListTrustParam {

  
/**
* 当前页起始行
*/
private long offset;


/**
* 每页显示的记录条数
*/
private long limit;


/**
* 查询类型：1信任我的人，2我信任的人，3我屏蔽的人
*/
private int type;


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


}

