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
