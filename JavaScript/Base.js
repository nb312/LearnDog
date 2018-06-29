function test(){
		var a = 1
		var b =100

		alert("This is a test in the Base.js. Please tell me the thing you like.")
}


function redirect(){
	window.location="file:///C:/GitWorkspace/LearnDog/JavaScript/sayHello.html"
}


function confirmDialog(){
	var c = confirm("Are you sure to give up your learning of javaScript language?")
	if (c){
		document.append("This is true for your confirm button.")
	}else{
		document.append("This is false for your confirm button.")
	}
}

function promptDialog(){
	var result = prompt("Please input your name here:","input now")
	document.write("Your name is "+result)
}

function testParam(str){
	alert("The value of str is "+str)
}

function voidTest(){
	var b= new book("Girl","I love a girl")
	b.v = "Test "
	b.addPrice(1000)
	alert("title="+b.title+" content="+b.content+" test="+b.v+" price="+b.price)
}

function book(title,content){
	this.title = title
	this.content = content
	this.price = 0
	this.addPrice =addPrice
}

function addPrice(count){
	with(this){
		price = count
	}
}
	

function testNum(){
	var num = new Number(100)
	num=num.valueOf("123")
	var arr = new Array("Apple","Banana","Capsule")
	var da = new Date(2017,12,17)
	var pi =Math.PI
	alert("num is "+num+" pi="+pi)
}
function expression(){
	var exp =new RegExp("[0-1]","g")

	var has="123"
	if(has.match(exp)){
		alert("niebin")
	}else{
		alert("love a girl but donot love me.")
	}
}

