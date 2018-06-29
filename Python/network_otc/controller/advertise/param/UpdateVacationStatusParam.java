
package coin.otc.com.network.controller.advertise.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：广告设置
 */
public class UpdateVacationStatusParam {

  
/**
* 是否休假 默认true
*/
private boolean vacation;


/**
* 交易类型
*/
private int entrustType;


public void setVacation(boolean vacation){
this.vacation = vacation;
}

public boolean isVacation(){
 return this.vacation;
}

public void setEntrustType(int entrustType){
this.entrustType = entrustType;
}

public int getEntrustType(){
 return this.entrustType;
}


}

