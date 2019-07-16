package com.java.chap03;

/**
 * @author Yan
 * @date 2019/7/15 14:10
 */
public class Demo2 {
    public static void main(String[] args) {
        //定义一个float类型的变量f
        //小数默认是double类型，所以必须加一个f,来表示float类型
        float f=1.1f;
        System.out.println("f="+f);

        //定义一个double类型变量d
        double d=1.2;
        System.out.println("d="+d);

        //获取float的最大值
        float maxF=Float.MAX_VALUE;
        System.out.println("float最大值："+maxF);
        //获取float的最小值
        float minF=Float.MIN_VALUE;
        System.out.println("float最小值："+minF);
    }
}
