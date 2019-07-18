package com.java.chap07.sec04;

/**
 * @author Yan
 * @date 2019/7/18 15:56
 */
public class People {

    // String 类属性默认值是null
    private String name;
    //int 类属性默认值是0
    private int age;


    /**
     * 默认构造方法
     */
    People(){
        System.out.println("默认构造方法");
    }

    /**
     * 有参数的构造方法   构造方法的重载
     */
    People(String name2,int age2){
        name=name2;
        age=age2;
        System.out.println("有参数的构造方法");
    }

    public void say(){
        System.out.println("我叫："+name+"，我今年："+age+"岁了");
    }

    public static void main(String[] args) {
        //People people=new People();
        People people2=new People("张三",23);
        people2.say();
    }
}
