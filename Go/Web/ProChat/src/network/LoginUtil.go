package network

import(
	"data"
	"net/http"
	"fmt"
	"io/ioutil"
	"encoding/json"
)
/**微信获取openid的链接*/
func getWeiChatCodeUrl(code string)(string){
	var url=data.WEI_CHAT_CODE_URL+"?appid="+data.APP_ID+"&secret="+data.APP_SECRET+"&js_code="+code+"&&grant_type=authorization_code"
	return url
}

// type UserInfo struct{
// 	openId string 
// 	session_key string
// 	nickname string 
// 	avatarUrl string 
// 	gender string
// 	city string 
// 	province string
// 	country string 
// 	lang string 
// 	email string 
// 	phone string 
// 	address string 
// }


// func (userInfo *data.UserInfo) toString() string{
	
// 	return ""
// }


/**
请求 链接
http://www.nbin01.com/dannu/login?code=111
*/
func Login(w http.ResponseWriter, r *http.Request) {
	fmt.Printf("login")
	code := r.URL.Query().Get("code")
	if code != "" {
		url := getWeiChatCodeUrl(code)
		println("url=" + url)
		reps, err := http.Get(url)
		if err == nil {
			print(reps)
			defer reps.Body.Close()
			var userInfo data.UserInfo
			bodyBytes, err := ioutil.ReadAll(reps.Body)
			fmt.Println(string(bodyBytes))
			var weichat_auth map[string]string
			if err == nil {
				if	err_json:=json.Unmarshal(bodyBytes,&weichat_auth);err_json==nil{
					userInfo=parseUser(r)
				}
				userInfo.OpenId=weichat_auth["openid"]
				userInfo.OpenId=weichat_auth["session_key"]
				data.InsertUser(userInfo)
				userInfo=data.Find_with_openid(userInfo)
				if userInfo.ID > 0{
					w.Write([]byte(userInfo.ToBaseUser()))
				}
			}
		}
	}
}


func parseUser(r *http.Request) (data.UserInfo){
	var userInfo data.UserInfo
	userInfo.Nickname=parseString(r,"nickName")
	userInfo.AvatarUrl=parseString(r,"avatarUrl")
	userInfo.Gender=parseString(r,"gender")
	userInfo.City=parseString(r,"city")
	userInfo.Province=parseString(r,"province")
	userInfo.Country=parseString(r,"country")
	userInfo.Lang=parseString(r,"lang")
	return userInfo
}

func parseString(r *http.Request,key string)string{
	value:= r.URL.Query().Get(key)
	return value
}



