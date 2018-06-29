
package coin.otc.com.network.controller.description.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：公告列表
 */
public class ListAnnounceParam {

  
/**
* 当前页起始行
*/
private long offset;


/**
* 每页显示的记录条数
*/
private long limit;


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


}

