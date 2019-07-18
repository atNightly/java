package com.java.chap07.sec01;

/**
 * @author Yan
 * @date 2019/7/18 13:39
 * Person类
 */
public class Person {
    String name;    //在类中，定义一个姓名name字符串属性
    int age;         //在类中，定义一个年龄age属性


    public void speak(){
        System.out.println("我叫"+name+"我今年"+age+"岁了");
    }

    public static void main(String[] args) {
        //定义一个Person类的对象zhangsan
        Person zhangsan;
        //实例化对象
        zhangsan=new Person();
        //给对象的name属性赋值
        zhangsan.name="张三";
        zhangsan.age=23;
        zhangsan.speak();
    }
}
