
package coin.otc.com.network.controller.advertise.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：广告设置 app没有用到 并且我update-vacation-status改为了update-vacation-status-test
 */
public class UpdateVacationStatusTestParam {

  
/**
* 买家是否休假 默认true
*/
private boolean buyVacation;


/**
* 卖家是否休假 默认false
*/
private boolean sellVacation;


public void setBuyVacation(boolean buyVacation){
this.buyVacation = buyVacation;
}

public boolean isBuyVacation(){
 return this.buyVacation;
}

public void setSellVacation(boolean sellVacation){
this.sellVacation = sellVacation;
}

public boolean isSellVacation(){
 return this.sellVacation;
}


}

