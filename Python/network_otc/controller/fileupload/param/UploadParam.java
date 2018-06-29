
package coin.otc.com.network.controller.fileupload.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：上传文件
 */
public class UploadParam {

  
/**
* file文件url
*/
private String file;


/**
* 类型：9工单文件
*/
private int category;


public void setFile(String file){
this.file = file;
}

public String getFile(){
 return this.file;
}

public void setCategory(int category){
this.category = category;
}

public int getCategory(){
 return this.category;
}


}

