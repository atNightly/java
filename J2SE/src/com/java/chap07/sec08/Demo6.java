package com.java.chap07.sec08;

/**
 * @author Yan
 * @date 2019/7/18 22:03
 */
public class Demo6 {
    public static void main(String[] args) {
        //indexOf方法使用示例
        String str="abcdefghdijklmnopqrstuvwxyz";
        System.out.println("d在字符串str中第一次出现的索引位置："+str.indexOf("d"));
        System.out.println("d在字符串str中第一次出现的索引位置,从索引4开始："+str.indexOf("d",4));
    }
}
