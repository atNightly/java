package com.java.chap07.sec18;

/**
 * @author Yan
 * @date 2019/7/21 14:06
 */
public class TestSingleton {
    public static void main(String[] args) {
        //Singleton1 singleton1=new Singleton1();

        Singleton1 singleton1=Singleton1.getInstance();
        Singleton1 singleton2=Singleton1.getInstance();
        System.out.println("饿汉式："+(singleton1==singleton2));

        TestSingleton testSingleton=new TestSingleton();
        TestSingleton testSingleton2=new TestSingleton();
        System.out.println(testSingleton==testSingleton2);



        Singleton2 singleton3=Singleton2.getInstance();
        Singleton2 singleton4=Singleton2.getInstance();
        System.out.println("懒汉式："+(singleton3==singleton4));
    }
}
