// This  学习go的基础知识的demo 自己能看
package main

import (
	"fmt"
)
type Book struct {
	title string
	page  int
}

// func main() {
// 	castingToString(10)	
// }

func test(a int, b string) (int, string) {
	fmt.Println("This is b =", b)
	return a + 1000, "Hello"
}

func testRef(a *int, b *int) {
	var temp int
	temp = *a
	*a = *b
	*b = temp
}

func pointAndArr() int {
	var arr = []int{1, 2, 2}
	fmt.Println("arr=", arr)
	var p *int
	p = &arr[0]
	print(p, " - ", *p)
	return 0
}

func doublePoint() {
	var a int = 211
	var p *int
	var pp **int
	p = &a
	pp = &p
	fmt.Printf("*p=%d **p=%d\n", *p, **pp)
}
func callBook(b Book) string {
	return b.title
}
func structWithPoint(){
	var p *Book
	b:=Book{"Beautiful girl",1000}
	p = &b
	fmt.Println("test",p.title)

}
func sliceT(){
	var nums =make([]int,2,20)
	var nums2 []int
	nums2 = make([]int,3,4)
	nums[1]=19
	nums2[2]=12
	nums[0]=101
	for i:=1;i<80;i++{
		nums=append(nums,987)
	}
	
	fmt.Println(nums," - ",nums2," cap:",cap(nums)," - ",len(nums))
}
func rangeEx(){
	var arr =[]int{1,2,3,4}
	for a:=range arr{
		fmt.Println("a=",a)	
	}
}
func mapTest(){
	var m map[string]string
	m=make(map[string]string)
	m["a"]="apple"
	m["b"]="beautiful"
	m["c"]="capacity"
	fmt.Println("map=",m)
	for key,value:=range m{
		fmt.Printf("key=%s value=%s \n",key,value)
	}
}

func recursionTest(a int) int{
	fmt.Println(a)
	if a==0 {
		return 0
	}
	
	return recursionTest(a-1)
}
func castingToString(num int){
	
}


