package util

import("data")
/**微信获取openid的链接*/
func GetWeiChatCodeUrl(code string)(string){
	var url=data.WEI_CHAT_CODE_URL+"?appid="+data.APP_ID+"&secret="+data.APP_SECRET+"&js_code="+code+"&&grant_type=authorization_code"
	return url
}