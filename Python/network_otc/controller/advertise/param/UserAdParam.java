
package coin.otc.com.network.controller.advertise.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：用户主页：发布的广告
 */
public class UserAdParam {

  
/**
* 当前页起始行
*/
private long offset;


/**
* 每页显示的记录条数
*/
private long limit;


/**
* 用户id
*/
private long userId;


/**
* 广告类型：0购买、1出售
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

public void setUserId(long userId){
this.userId = userId;
}

public long getUserId(){
 return this.userId;
}

public void setEntrustType(int entrustType){
this.entrustType = entrustType;
}

public int getEntrustType(){
 return this.entrustType;
}


}

