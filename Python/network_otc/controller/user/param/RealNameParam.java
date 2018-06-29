
package coin.otc.com.network.controller.user.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：实名认证
 */
public class RealNameParam {

  
/**
* 证件类型
*/
private String identityType;


/**
* 名字,非身份证时,姓,名拆分存,此字段必填,反之可为空
*/
private String firstName;


/**
* 姓氏,证件类型为身份证时，姓名都放在此字段中
*/
private String familyName;


/**
* 国家地区
*/
private String region;


/**
* 身份证号
*/
private String identityNo;


/**
* 证件正面照片
*/
private String identityOnurl;


/**
* 证件反面照片,证件类型为身份证时,必填
*/
private String identityOffurl;


/**
* 证件手持照片
*/
private String identityHoldurl;


public void setIdentityType(String identityType){
this.identityType = identityType;
}

public String getIdentityType(){
 return this.identityType;
}

public void setFirstName(String firstName){
this.firstName = firstName;
}

public String getFirstName(){
 return this.firstName;
}

public void setFamilyName(String familyName){
this.familyName = familyName;
}

public String getFamilyName(){
 return this.familyName;
}

public void setRegion(String region){
this.region = region;
}

public String getRegion(){
 return this.region;
}

public void setIdentityNo(String identityNo){
this.identityNo = identityNo;
}

public String getIdentityNo(){
 return this.identityNo;
}

public void setIdentityOnurl(String identityOnurl){
this.identityOnurl = identityOnurl;
}

public String getIdentityOnurl(){
 return this.identityOnurl;
}

public void setIdentityOffurl(String identityOffurl){
this.identityOffurl = identityOffurl;
}

public String getIdentityOffurl(){
 return this.identityOffurl;
}

public void setIdentityHoldurl(String identityHoldurl){
this.identityHoldurl = identityHoldurl;
}

public String getIdentityHoldurl(){
 return this.identityHoldurl;
}


}

