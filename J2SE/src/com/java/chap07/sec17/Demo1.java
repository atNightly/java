package com.java.chap07.sec17;

/**
 * @author Yan
 * @date 2019/7/20 22:02
 */
public class Demo1 {
    public static void main(String[] args) {
        int a=1;
        Integer i=new Integer(a);    //装箱  把基本变量变成对象变量
        int b=i.intValue();   //拆箱  把对象变量变成基本变量
        System.out.println("a="+a+",i="+i+",b="+b);
    }
}
