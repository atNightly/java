package com.java.chap07.sec02;

/**
 * @author Yan
 * @date 2019/7/18 13:57
 */
public class People3 {

    //形参，入参
    void speak(String name, int age) {
        System.out.println("我叫" + name+"我今年"+age+"岁了");
    }

    public static void main(String[] args) {
        People3 zhangsan = new People3();
        zhangsan.speak("张三", 23);
    }
}
