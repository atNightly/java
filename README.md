# Java 基础
# Java简介
<!--more-->
Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程。      

Java具有简单性、面向对象、分布式、健壮性、安全性、平台独立与可移植性、多线程、动态性等特点 。Java可以编写桌面应用程序、Web应用程序、分布式系统和嵌入式系统应用程序等。
     
[详情](https://baike.baidu.com/item/Java/85979?fr=aladdin)
     
# 运行环境搭建
## 下载
JDK建议使用1.8及以上的版本。     
官方下载路径：[jdk下载路地址](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
      
## 安装
双击下载软件，一路单击下一步即可。     
    
## 配置环境变量
**Windows**：右击【我的电脑】→【属性】→【高级系统设置】→【环境变量】→【系统变量】→【新建】，接着如下图所示：    
![java_home](https://farm8.staticflickr.com/7873/40480682053_903c92b01b_b.jpg)
     
在【系统变量】的path中添加 **%JAVA_HOME%\bin**。
     
验证，如下图所示：    
![java](https://farm8.staticflickr.com/7860/40480681993_9a639b1dc2_b.jpg)

# Hello World
```java
public class helloworld {
    public static void main(String[] args) {
        System.out.println("helloworld");
    }
}
```
       
## Hello World 运行原理
```flow
op=>operation: Hello World.java(Javac 编译)
op1=>operation: Hello World.class(Java 运行)
op2=>operation: 执行并运行结果
e=>end
op->op1->op2
```
          
# 工具
## Intellij IDEA
下载路径：[indea U](https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows)
      
### 激活（针对学生的免费使用计划）
参考：[Intellij IDEA的下载和使用（针对学生的免费使用计划）](https://blog.csdn.net/iemdm1110/article/details/53365881)
       
# 注释、标识符命名规则及Java中的关键字
## 1. Java注释
```
1. 单行注释：//
2. 多行注释：/*。。。。。*/
3. 文档注释：/**。。。*/
```
    
## 2. 标识符命名
```
标识符定义：Java语言中，对于变量、常量、函数、语句块也有名字，我们统统称为Java标识符。

标识符作用：标识符是用来给类、对象、方法、常量、接口和自定义数据类型命令的。
     
标识符命名规则：Java标识符由数字、字母和下划线（_），美元符号（$）组成。在Java中是区分大小写的，而且还要求首位不能是数字。最重要的是，Java关键字不能当作Java标识符。
```
     
## 3. Java关键字


|**访问控制**|**private**|**protected**|**public**|||||
|---|---|---|---|---|---|---|---|---| 
|**类，方法和变量修饰符**|**abstract**|**class**|**extends**|**final**|**implements**|**interface**|**native**|
||**new**|**static**|**strictfp**|**synchronized**|**transient**|**volatile**||
|**程序控制**|**break**|**continue**|**return**|**do**|**while**|**if**|**else**|
||**for**|**instanceof**|**switch**|**case**|**default**|||
|**错误处理**|**try**|**catch**|**throw**|**throws**|**finally**|||	 
|**包相关**|**import**|**package**||||||
|**基本类型**|**boolean**|**byte**|**char**|**double**|**float**|**int**|**long**|
||**short**|**null**|**true**|**false**||||
|**变量引用**|**super**|**this**|**void**|||||	 
|**保留字**|**goto**|**const**|||||||

参考：[Java 关键字总结](http://cyw3.github.io/YalesonChan/2016/Java-key.html)	 	 	 	 
       
# Java基本数据类型
## 1. 数据类型分类
![](https://live.staticflickr.com/65535/48287266636_32ed239f62_z.jpg)
      
## 2. 整数类型
     
|序号|数据类型|大小/位|可表示的数据范围|
|--|--|--|--|
|1|byte(位)|8|-2<sup>7</sup>到（2<sup>6</sup>-1）|
|2|short(整型)|16|-2<sup>15</sup>到（2<sup>15</sup>-1）|
|3|int(整型)|32|-2<sup>31</sup>到（2<sup>31</sup>-1）|
|4|long(长整型)|64|-2<sup>63</sup>到（2<sup>63</sup>-1）|
      
Byte数据范围表示   
     
|符号位|1|1|1|1|1|1|1|1|
|--|--|--|--|--|--|--|--|--|
|||||||||||

符号位0表示正   范围  00000000~01111111     
符号位1表示负   范围  10000000~11111111（减一取反）
      
代码实例：    
```java
package com.java1234.chap02;

/**
 * @author Yan
 * @date 2019/7/15 13:53
 */
public class Demo1 {
    public static void main(String[] args) {
        //定义一个int类型的变量
        int a;
        //给变量a赋值
        a=1;
        System.out.println(a);

        //定义一个int类型的变量a2
        int a2=1;
        System.out.println("a2="+a2);

        //定义一个byte类型的变量b
        byte b=3;
        System.out.println("b="+b);

        //定义一个short类型的变量
        short s=4;
        System.out.println("s="+s);


        //定义一个long类型的变量l
        long l=5;
        System.out.println("l="+l);

        int a11=1;
        int a22=2;
        int a3=a11+a22;
        System.out.println("a1+a2="+a3);
    }
}
```
      
## 3. 浮点类型

|序号|数据类型|大小/位|可表示的数据范围|
|---|---|---|---|
|1|float(单精度)|32|-3.4E38(-3.4x10<sup>38</sup>) 到 3.4E38(3.4x10<sup>38</sup>))|
|2|double(双精度)|64|-1.7E308(-1.7x10<sup>308</sup>) 到 1.7E308(1.7x10<sup>308</sup>))|
      
代码示例：       
```java
package com.java1234.chap02;

/**
 * @author Yan
 * @date 2019/7/15 14:10
 */
public class Demo2 {
    public static void main(String[] args) {
        //定义一个float类型的变量f
        //小数默认是double类型，所以必须加一个f,来表示float类型
        float f=1.1f;
        System.out.println("f="+f);

        //定义一个double类型变量d
        double d=1.2;
        System.out.println("d="+d);

        //获取float的最大值
        float maxF=Float.MAX_VALUE;
        System.out.println("float最大值："+maxF);
        //获取float的最小值
        float minF=Float.MIN_VALUE;
        System.out.println("float最小值："+minF);
    }
}
```
      
## 4. 字符型
字符型常量有3种表示形式。char     
    1. 直接通过单个字符来指定字符型常量，如‘A’，‘b’，‘5’；
    2. 通过转义字符表示特殊字符型常量，如‘\n’,‘\\’;
    3. 直接使用Unicode值来表示字符型常量，如‘\u66f9’，‘\yu950b’；
        
|转义字符|说明|
|-------|----|
|\b|退格|
|\n|换行|
|\t|制表符|
|\"|双引号|
|\'|单引号|
|\\|反斜杠|
|\r|回车符|
      
代码示例:        
```java
package com.java1234.chap02;

/**
 * @author Yan
 * @date 2019/7/15 14:33
 */
public class Demo3 {
    public static void main(String[] args) {
        //定义一个单个字符
        char c1='A';
        System.out.println("c1="+c1);


        //定义一个反斜杠字符
        char c2='\\';
        System.out.println("c2="+c2);


        //用Unicode编码输出自己的名字
        char c3='\u66f9';
        char c4='\u950b';
        System.out.println("c3="+c3);
        System.out.println("c4="+c4);
    }
}

```
      
## 5. 布尔类型
布尔类型的变量只有true(真)和false(假)两种。  

```java
package com.java1234.chap02;

/**
 * @author Yan
 * @date 2019/7/15 14:51
 */
public class Demo4 {
    public static void main(String[] args) {
        //定义一个布尔类型变量b1
        boolean b1=true;
        System.out.println("b1="+b1);
        //定义一个布尔类型变量b2
        boolean b2=false;
        System.out.println("b2="+b2);
    }
}

```
      
## 6. 基本类型的类型转换
    1. 自动类型转换
    条件： 
         1. 转换前后的数据类型兼容；
         2. 转换后的数据类型的表示范围要比转换前的大；
        
    2. 强制类型转换
      
代码示例：     
```java
package com.java.chap03;

/**
 * @author Yan
 * @date 2019/7/15 15:26
 */
public class Demo5 {
    public static void main(String[] args) {
        //自动类型转换
        short s=1;
        int i;
        //自动类型转换 short类型转成int类型
        i=s;
        System.out.println("i="+i);


        //强制类型转换
        double d=1.333;
        float f;
        //把double类型的数据强制转换成float类型
        f=(float) d;
        System.out.println("f="+f);
    }
}
```
      
# Java运算符与表达式
![](https://live.staticflickr.com/65535/48287869506_1ed621abc2_z.jpg)
       
##  1. 赋值运算符
符号：=（赋值）
```java
package com.java.chap04;

/**
 * @author Yan
 * @date 2019/7/16 13:01
 */
public class Demo1 {
    public static void main(String[] args) {
        //定义变量a
        int a;
        //给变量a赋值
        a=1;
        System.out.println("a="+a);

        //定义变量a，并且给a赋值
        int a2=2;
        System.out.println("a2="+a2);
    }
}
```
     
## 2. 算数运算符
符号：+（加），-（减），*（乘），/（除），%（取模）
```java
package com.java.chap04;

/**
 * @author Yan
 * @date 2019/7/16 13:07
 */
public class Demo2 {
    public static void main(String[] args) {
        int a=10;
        int b=3;

        //+运算符
        System.out.println(a+"+"+b+"="+(a+b));

        //-运算符
        System.out.println(a+"-"+b+"="+(a-b));

        //*运算符
        System.out.println(a+"*"+b+"="+(a*b));

        // /运算符
        System.out.println(a+"/"+b+"="+(a/b));

        //%运算符
        System.out.println(a+"%"+b+"="+(a%b));
    }
}
```
      
## 3. 自增与自减运算符
符号：++（自增），--（自减）       
**重点：a++和++a的区别**
```java
package com.java.chap04;

/**
 * @author Yan
 * @date 2019/7/16 13:13
 */
public class Demo3 {
    public static void main(String[] args) {
        int a = 1;
        //a++表示先做赋值操作，然后自增
        /*
        int b=a++;
        System.out.println("b="+b);
        System.out.println("a="+a);
         */

        //++a表示先自增，然后赋值操作
        int b=++a;
        System.out.println("b="+b);
        System.out.println("a="+a);
    }
}

```
       
## 4. 逻辑运算符
符号：&&（与），&（不短路与），||（或），|（不短路或），!(非)，^（亦或）
       
## 5. 关系运算符
符号：>(大于)，<(小于)，>=（大于等于），<=(小于等于)，==（等于），!=(不等于)
     
## 6. 三目运算符
格式：（表达式）？表达式为true返回值：表达式为false返回值
       





