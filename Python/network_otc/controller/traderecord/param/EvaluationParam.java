
package coin.otc.com.network.controller.traderecord.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：评价
 */
public class EvaluationParam {

  
/**
* 交易ID号
*/
private long tradeId;


/**
* 评价级别:1好评、2中评、3差评
*/
private int level;


/**
* 评价内容
*/
private String content;


/**
* 请求code
*/
private String requestCode;


public void setTradeId(long tradeId){
this.tradeId = tradeId;
}

public long getTradeId(){
 return this.tradeId;
}

public void setLevel(int level){
this.level = level;
}

public int getLevel(){
 return this.level;
}

public void setContent(String content){
this.content = content;
}

public String getContent(){
 return this.content;
}

public void setRequestCode(String requestCode){
this.requestCode = requestCode;
}

public String getRequestCode(){
 return this.requestCode;
}


}

