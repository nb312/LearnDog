package data

const driver_name="mysql"
/**链接数据地址 用户密码 以及 端口根据需要修改*/
const database_url="root:nbin312@tcp(localhost:3307)/"


/**创建user表*/
const create_table_user=`create table  UserItem(
		ID int primary key AUTO_INCREMENT,
		openId varchar(255) not null unique,
		session_key varchar(255),
		nickname varchar(255) ,
		avatarUrl text,
		gender varchar(255) ,
		city varchar(255)  ,
		province varchar(255) ,
		country varchar(255) ,
		lang varchar(255) ,
		email  varchar(255) ,
		phone varchar(255) ,
		addresses varchar(255));
`

/**创建帖子 topic*/
const create_table_topic=`create table TopicItem(
		ID int primary key AUTO_INCREMENT,
		ownerId int not null unique,	
		pictrure varchar(255),
		content varchar(255),
		state varchar(255) ,
		create_time timestamp,
		update_time timestamp,
		audio varchar(255),
		vedio varchar(255));
`

/**创建 评论表*/
const create_table_commit=`create table CommitItem(
	ID int primary key AUTO_INCREMENT,
	topicId int not null,	
	userId int not null,	
	content varchar(255) not null,	
	state varchar(255) ,	
	create_time timestamp,	
	update_time timestamp);
`


/**创建 喜欢表*/
const create_table_like=`create table LikeItem(
	ID int primary key AUTO_INCREMENT,
	topicId int not null,	
	userId int not null,	
	level varchar(255) ,	
	create_time timestamp,	
	update_time timestamp);
`


