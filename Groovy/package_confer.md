# 关于包
- 定义包package xxx
	1. 可以在文件名和包名不一样的情况吗：不能;文件名必须保持一致
	2. 可以不定义包名吗：被调用文件不能，直接执行的文件可以
- 引包 import xxx
   1. static 方式：属性 方法 星
   2. 别名 as ：static ,class           
   3. 星型 
   4. java 类似
- 默认引包
	1. java的 
	2. groovy的 
```
import java.lang.*
import java.util.*
import java.io.*
import java.net.*
import groovy.lang.*
import groovy.util.*
import java.math.BigInteger
import java.math.BigDecimal
```
- 同一个文件内 不需要引包就可以直接使用类
