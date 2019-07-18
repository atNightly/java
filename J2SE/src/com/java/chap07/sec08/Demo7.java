package com.java.chap07.sec08;

/**
 * @author Yan
 * @date 2019/7/18 22:08
 */
public class Demo7 {
    public static void main(String[] args) {
        //subString方法使用
        String str="不开心每一天,不可能";
        String newStr=str.substring(1);
        String newStr2=str.substring(1,6);
        System.out.println(str);
        System.out.println(newStr);
        System.out.println(newStr2);
    }
}
