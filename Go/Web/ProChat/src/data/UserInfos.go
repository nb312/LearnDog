package data


import(
	"fmt"
)

const insert_user=`
insert into useritem(openid,session_key,nickname,avatarurl,gender,lang,city,province,country,email,phone,addresses) values (%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)
`
const map_string=`
{"openId":"%s",""}
`
const mat_return_weichat=`
{"userId":%d,"nickname":"%s","avatarurl":"%s","gender":%s}
`

const find_with_openid=`
select * from userItem where openid = "%s";
`
const find_with_userid=`
select * from useritem where id = %d;
`

type UserInfo struct{
	ID int64
	OpenId string 
	Session_key string
	Nickname string 
	AvatarUrl string 
	Gender string
	City string 
	Province string
	Country string 
	Lang string 
	Email string 
	Phone string 
	Address string 
}

/**插入user的sql*/
func (user *UserInfo) InsertSql() string {
	return	fmt.Sprintf(insert_user,user.OpenId,user.Session_key,user.Nickname,user.AvatarUrl,user.Gender,user.Lang,user.City,user.Province,user.Country,user.Email,user.Phone,user.Address)
}


func (user *UserInfo) ToMapString() string {
	return ""
}

/**返回nickname,avatar,gender*/
func (user *UserInfo) ToBaseUser() string{
	 return fmt.Sprintf(mat_return_weichat,user.ID,user.Nickname,user.AvatarUrl,user.Gender)
}

func (user *UserInfo) FindWithOpenId() string{
	return fmt.Sprintf(find_with_openid,user.OpenId)
}


func (user *UserInfo) FindWithUserid() string{
	return fmt.Sprintf(find_with_userid,user.ID)
}
