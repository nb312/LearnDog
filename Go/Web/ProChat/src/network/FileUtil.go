package network

import(
	"net/http"
	"os"
	"io"
	"fmt"
)


func HandFile(w http.ResponseWriter, r *http.Request){
	fmt.Printf("handfile")
	var maxMemory int64= 32<<20
	r.ParseMultipartForm(maxMemory)
	file, handler, err := r.FormFile("file")
	if err != nil {
		fmt.Println(err)
		return
	}
	defer file.Close()
	r.ParseForm()
	fmt.Printf("form=",r.Form,"\n")
	fmt.Printf("postform=",r.PostForm,"\n")
	for key,value:=range r.Form {
		fmt.Printf("k=",key)
		fmt.Printf("v=",value)
	}
	fmt.Printf("\n")
	
	fmt.Fprintf(w, "%v", handler.Header)
	f, err := os.OpenFile("./res/"+handler.Filename, os.O_WRONLY|os.O_CREATE, 0666)
	if err != nil {
		fmt.Println(err)
		return
	}
	
	defer f.Close()
	io.Copy(f, file)
}