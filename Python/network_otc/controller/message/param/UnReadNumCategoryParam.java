
package coin.otc.com.network.controller.message.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：根据消息类型查询未读消息数
 */
public class UnReadNumCategoryParam {

  
/**
* 消息类型:0交易,1客服,2系统,3评价,4聊天
*/
private int category;


public void setCategory(int category){
this.category = category;
}

public int getCategory(){
 return this.category;
}


}

