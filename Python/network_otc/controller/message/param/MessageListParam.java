
package coin.otc.com.network.controller.message.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：我的消息列表
 */
public class MessageListParam {

  
/**
* 当前页起始行
*/
private long offset;


/**
* 每页显示的记录条数
*/
private long limit;


/**
* 消息类型:0交易,1客服,2系统,3评价,4聊天,不传则查全部
*/
private int category;


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


}

