
package coin.otc.com.network.controller.userrelation.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：屏蔽、取消屏蔽
 */
public class ShieldParam {

  
/**
* 被屏蔽的用户id
*/
private long relationUserId;


/**
* 0屏蔽、1取消屏蔽
*/
private int shield;


public void setRelationUserId(long relationUserId){
this.relationUserId = relationUserId;
}

public long getRelationUserId(){
 return this.relationUserId;
}

public void setShield(int shield){
this.shield = shield;
}

public int getShield(){
 return this.shield;
}


}

