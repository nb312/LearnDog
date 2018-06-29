package  coin.otc.com.network.service;

import com.nb.libcommon.network.mvp.BaseResponseItem;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
//引包

import coin.otc.com.network.controller.virtualaddress.item.InAddItem;
import coin.otc.com.network.controller.virtualaddress.item.DetailItem;
import coin.otc.com.network.controller.virtualaddress.item.OutListItem;

/**
 * Created by NieBin on 2018/1/8.
 * GitHub: https://github.com/nb312
 * 带v1:True
 * 接口说明:虚拟币地址相关接口
 */
 public interface IVirtualAddressHttpService{
     
/**
* @param coinId 币种ID
* @return 新增充币地址
*/
@POST("virtual/address/in/add")
Observable<BaseResponseItem<InAddItem>> inAdd(
@Query("coinId") long coinId
);




/**
* @param coinId 币种简称
* @return 获取充币地址
*/
@GET("virtual/address/in/detail")
Observable<BaseResponseItem<DetailItem>> detail(
@Query("coinId") long coinId
);




/**
* @param address 提币地址
* @param tradePwd 资金密码
* @param coinId 币种ID
* @param remark 备注
* @return 新增提币地址
*/
@POST("virtual/address/out/add")
Observable<BaseResponseItem<String>> outAdd(
@Query("address") String address
,@Query("tradePwd") String tradePwd
,@Query("coinId") long coinId
,@Query("remark") String remark
);




/**
* @param ids id 组
* @return 删除提币地址
*/
@POST("virtual/address/out/delete")
Observable<BaseResponseItem<String>> delete(
@Query("ids") String ids
);




/**
* @param coinId 币种ID
* @return 获取提币地址列表
*/
@GET("virtual/address/out/list")
Observable<BaseResponseItem<List<OutListItem>>> outList(
@Query("coinId") long coinId
);




/**
* @param id 提币地址ID
* @param remark 提币地址备注
* @return 修改提币备注
*/
@POST("virtual/address/out/modify/remark")
Observable<BaseResponseItem<String>> remark(
@Query("id") long id
,@Query("remark") String remark
);




 }
