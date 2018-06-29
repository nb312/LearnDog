package data

import (
	"fmt"
)

const APP_ID="wx9d381d00ab450e96" /**微信appid*/
const APP_SECRET="4e3bbd86037c863b9e365372e4584c53" /**微信 secret*/
const WEI_CHAT_CODE_URL="https://api.weixin.qq.com/sns/jscode2session" /**认证链接*/

const ROOT_URL="/danmu/"
const LOGIN_URL=ROOT_URL+"login"

const NETWORK_PORT=":8080"




func Tes(){
	fmt.Printf("this is constants")
}
