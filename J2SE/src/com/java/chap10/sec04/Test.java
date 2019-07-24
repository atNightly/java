package com.java.chap10.sec04;

/**
 * @author Yan
 * @date 2019/7/24 19:39
 */
public class Test {


    /**
     * 泛型方法
     * @param t
     * @param <T>
     */
    public static <T> void f(T t){
        System.out.println("T的类型是："+t.getClass().getName());
    }
    public static void main(String[] args) {
        f("");
        f(1);
        f(1.0);
        f(new Object());
    }
}
