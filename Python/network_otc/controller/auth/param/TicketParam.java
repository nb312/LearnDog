
package coin.otc.com.network.controller.auth.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：获取服务调用凭证接口
 */
public class TicketParam {

  
/**
* TGT
*/
private String ticket;


/**
* 请求的服务,可不填,后期拓展用
*/
private String service;


public void setTicket(String ticket){
this.ticket = ticket;
}

public String getTicket(){
 return this.ticket;
}

public void setService(String service){
this.service = service;
}

public String getService(){
 return this.service;
}


}

