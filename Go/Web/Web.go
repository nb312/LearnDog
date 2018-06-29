package main

import (
	"crypto/md5"
	"fmt"
	"html/template"
	"io"
	"net/http"
	"os"
	"strconv"
	"strings"
	"time"
)
func main(){
	print("hello")
}
// func main() {
// 	http.HandleFunc("/", sayhelloName) // set router
// 	http.HandleFunc("/login", login) // set router
// 	http.HandleFunc("/upload", upload)

// 	err := http.ListenAndServe(":9090", nil) // set listen port
// 	if err != nil {
// 		log.Fatal("ListenAndServe: ", err)
// 	}
// }
//测试 服务器
func sayhelloName(w http.ResponseWriter, r *http.Request) {
	r.ParseForm()                // parse arguments, you have to call this by yourself
	fmt.Println("form=", r.Form) // print form information in server side
	fmt.Println("path=", r.URL.Path)
	fmt.Println("scheme=", r.URL.Scheme)
	fmt.Println("url_long=", r.Form["url_long"])
	for k, v := range r.Form {
		fmt.Println("key:", k)
		fmt.Println("val:", strings.Join(v, ""))
	}
	fmt.Fprintf(w, "Hello World,Ni Hao") // send data to client side
}

/**登录用*/
func login(w http.ResponseWriter, r *http.Request) {
	fmt.Println("method:", r.Method) //get request method
	if r.Method == "GET" {
		t, _ := template.ParseFiles("login.gtpl")
		t.Execute(w, nil)
	} else {
		r.ParseForm()
		// logic part of log in
		fmt.Println("username:", r.Form["username"])
		fmt.Println("password:", r.Form["password"])
	}
}

/**上传文件*/
func upload(w http.ResponseWriter, r *http.Request) {
	fmt.Println("method:", r.Method)
	if r.Method == "GET" {
		crutime := time.Now().Unix()
		h := md5.New()
		io.WriteString(h, strconv.FormatInt(crutime, 10))
		token := fmt.Sprintf("%x", h.Sum(nil))

		t, _ := template.ParseFiles("upload.gtpl")
		t.Execute(w, token)
	} else {
		r.ParseMultipartForm(32 << 20)
		file, handler, err := r.FormFile("uploadfile")
		if err != nil {
			fmt.Println(err)
			return
		}
		defer file.Close()
		fmt.Fprintf(w, "%v", handler.Header)
		f, err := os.OpenFile("./test/"+handler.Filename, os.O_WRONLY|os.O_CREATE, 0666)
		if err != nil {
			fmt.Println(err)
			return
		}
		defer f.Close()
		io.Copy(f, file)
	}
}
