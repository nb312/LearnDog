
package coin.otc.com.network.controller.publicad.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：买入、售出计算
 */
public class AdPublicCalcParam {

  
/**
* 广告id
*/
private long id;


/**
* 传递的数字计算类型:1金额、2数量
*/
private int type;


/**
* 数字
*/
private double num;


public void setId(long id){
this.id = id;
}

public long getId(){
 return this.id;
}

public void setType(int type){
this.type = type;
}

public int getType(){
 return this.type;
}

public void setNum(double num){
this.num = num;
}

public double getNum(){
 return this.num;
}


}

