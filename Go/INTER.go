//这是 学习interface 的demo
package main

import(
	"fmt"
	"errors"
)


type Shape interface{
	area() float32
}

type Rectange struct{
	w,h float32	
}

type Circle struct{
	radius float32 
}

func (c Circle) area() float32{
	return c.radius*c.radius*3.14
}
func getTest(s Shape){
	fmt.Println(s.area())
}

func testErr(num int)(int,error){
	if num <= 0{
		return -1,errors.New("The num must bigger than zero.")
	}
	return num,nil
}