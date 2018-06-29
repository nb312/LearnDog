package main

import (
	"data"
	"fmt"
	"html/template"
	"log"
	"net/http"
	"strings"
	"os"
	"io"
	"network"
)

func main() {
	test()
	data.InitDB()
	http.HandleFunc("/danmu/file", network.HandFile)     // set router
	http.HandleFunc(data.LOGIN_URL, network.Login) // 登录
	err := http.ListenAndServe(data.NETWORK_PORT, nil) // set listen port
	if err != nil {
		log.Fatal("ListenAndServe: ", err)
	}
}

func handFile(w http.ResponseWriter, r *http.Request){
	fmt.Printf("handfile")
	r.ParseMultipartForm(32 << 20)
	file, handler, err := r.FormFile("file")
	if err != nil {
		fmt.Println(err)
		return
	}
	defer file.Close()
	fmt.Fprintf(w, "%v", handler.Header)
	f, err := os.OpenFile("./res/"+handler.Filename, os.O_WRONLY|os.O_CREATE, 0666)
	if err != nil {
		fmt.Println(err)
		return
	}
	defer f.Close()
	io.Copy(f, file)
}


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
	// w.Write("hello world")
	fmt.Fprintf(w, "Welcome to the world of Mine! Boys and girls,let's happy now!") // send data to client side
}

/**登录用*/
func home(w http.ResponseWriter, r *http.Request) {
	fmt.Println("method:", r.Method) //get request method
	if r.Method == "GET" {
		t, _ := template.ParseFiles("home.html")
		t.Execute(w, nil)
	} else {
		r.ParseForm()
		// logic part of log in
		fmt.Println("username:", r.Form["username"])
		fmt.Println("password:", r.Form["password"])
	}
}

func test(){
	test:=fmt.Sprintf("this is %s for you","s")
	fmt.Printf(test)
}