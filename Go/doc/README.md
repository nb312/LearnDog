# Golang 创建数据库
1. 首先是链接数据库
> 创建数据库一般不在代码中实现，而是通过mysql的相应客服端进行创建
 ```
 	/** 第一个参数 mysql是数据库的引擎 
 		第二个参数中 name 是数据库用户名，password为密码 @后面的为tcp协议 括号里面是链接地址 
 		/ 后面可以带数据库名 但是数据库不存在，则需要这样写，方便后面的创建 ，如果后面带名字 则创建不能成功

 	*/
 	db,err=sql.Open("mysql","name:password@tcp(localhost:3307)/") 
 	defer db.Close()
	 // 创建bus 数据库
	—,err = sql.Exec("create database bus")
	// 指定使用的数据库 如果直接在open填写 不需要 
	—,err= sql.Exec("use bus")
	//接下来就可以对数据库为所欲为了 
 ```

2. 选择mysql 
```
db,err=sql.Open("mysql","name:password@tcp(localhost:3307)/database_name") 
```
注意这里的 database_name 其实是mysql数据库中的schema 名，当我们在客户端查看管理database时 有一个schema列表，里面全是这类数据库
