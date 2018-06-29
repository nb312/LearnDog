
package coin.otc.com.network.controller.userrelation.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：信任、取消信任
 */
public class TrustParam {

  
/**
* 被信任的用户id
*/
private long relationUserId;


/**
* 0信任、1取消信任
*/
private int trustType;


public void setRelationUserId(long relationUserId){
this.relationUserId = relationUserId;
}

public long getRelationUserId(){
 return this.relationUserId;
}

public void setTrustType(int trustType){
this.trustType = trustType;
}

public int getTrustType(){
 return this.trustType;
}


}

