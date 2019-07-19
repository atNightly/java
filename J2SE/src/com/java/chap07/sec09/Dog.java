package com.java.chap07.sec09;

/**
 *
 * 定义Dog类，继承自Animal类
 * @author Yan
 * @date 2019/7/19 17:25
 */
public class Dog extends Animal{


    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("Pick");
        dog.setAge(1);
        dog.say();
    }
}
