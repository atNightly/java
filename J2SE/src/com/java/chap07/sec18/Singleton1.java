package com.java.chap07.sec18;

/**
 * @author Yan
 * @date 2019/7/21 14:05
 */
public class Singleton1 {

    /**
     * 构造方法私有
     */
    private Singleton1(){

    }

    /**
     * 饿汉式单例实现
     */
    private static final Singleton1 single1=new Singleton1();


    /**
     * 静态工厂方式
     */
    public static Singleton1 getInstance(){
        return single1;
    }
}
