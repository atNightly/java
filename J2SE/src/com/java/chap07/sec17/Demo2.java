package com.java.chap07.sec17;

/**
 * @author Yan
 * @date 2019/7/20 22:05
 */
public class Demo2 {
    public static void main(String[] args) {
        Integer i=1;     //自动装箱的过程  自动把基本数据转换成对象
        int i2=i;   //自动拆箱   自动把对象转换成基本数据
        System.out.println("i="+i+",i2="+i2);
    }
}
