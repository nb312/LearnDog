package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包


/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:False
 * 接口说明:我的广告列表
 */
 public interface ITestHttpService{
     
/**
* @param time 时间戳
* @param param 参数列表
* @return 根据time和参数生成sign
*/
@GET("gen-sign")
Observable<BaseResponseItem<String>> genSign(
@Query("time") String time
,@Query("param") String param
);




 }
