package com.java.chap07.sec06;

/**
 * @author Yan
 * @date 2019/7/18 16:38
 */
public class Outer2 {
    private int a = 1;

    /**
     * 定义内部类
     */
    class Inner {
        public void show() {
            System.out.println(a);
        }
    }


    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();   //实例化外部类对象
        Outer2.Inner inner = outer2.new Inner();    //实例化内部类对象
        inner.show();
    }
}
