
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：修改谷歌验证规则
 */
public class UpdateRuleParam {

  
/**
* 规则类型:1添加提币地址规则,2登录规则
*/
private int rule;


/**
* 是否开启:false否、true是
*/
private boolean isOpen;


public void setRule(int rule){
this.rule = rule;
}

public int getRule(){
 return this.rule;
}

public void setIsOpen(boolean isOpen){
this.isOpen = isOpen;
}

public boolean isIsOpen(){
 return this.isOpen;
}


}

