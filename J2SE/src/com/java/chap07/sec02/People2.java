package com.java.chap07.sec02;

/**
 * @author Yan
 * @date 2019/7/18 13:57
 */
public class People2 {

    //形参，入参
    void speak(String name){
        System.out.println("我叫"+name);
    }

    public static void main(String[] args) {
        People2 zhangsan=new People2();
        zhangsan.speak("张三");
    }
}
