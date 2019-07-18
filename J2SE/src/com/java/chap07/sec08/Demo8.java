package com.java.chap07.sec08;

/**
 * @author Yan
 * @date 2019/7/18 22:12
 */
public class Demo8 {
    public static void main(String[] args) {
        String str="I'm a boy!";
        String upStr=str.toUpperCase();   //转换成大写
        System.out.println("str:"+str);
        System.out.println("upStr:"+upStr);


        String lowerStr=upStr.toLowerCase();  //转换成小写
        System.out.println("lowerStr:"+lowerStr);
    }
}
