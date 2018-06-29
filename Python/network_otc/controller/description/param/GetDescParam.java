
package coin.otc.com.network.controller.description.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：获取提示文案
 */
public class GetDescParam {

  
/**
* 币种ID
*/
private long coinId;


/**
* 语言:1简体中文,2繁体中文,3英语
*/
private int lang;


public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}

public void setLang(int lang){
this.lang = lang;
}

public int getLang(){
 return this.lang;
}


}

