
package coin.otc.com.network.controller.test.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：根据time和参数生成sign
 */
public class GenSignParam {

  
/**
* 时间戳
*/
private String time;


/**
* 参数列表
*/
private String param;


public void setTime(String time){
this.time = time;
}

public String getTime(){
 return this.time;
}

public void setParam(String param){
this.param = param;
}

public String getParam(){
 return this.param;
}


}

