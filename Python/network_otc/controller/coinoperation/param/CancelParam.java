
package coin.otc.com.network.controller.coinoperation.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：取消提币申请接口
 */
public class CancelParam {

  
/**
* 提出记录ID
*/
private long operateId;


public void setOperateId(long operateId){
this.operateId = operateId;
}

public long getOperateId(){
 return this.operateId;
}


}

