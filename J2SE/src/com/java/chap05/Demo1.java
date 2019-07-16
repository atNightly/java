package com.java.chap05;

/**
 * @author Yan
 * @date 2019/7/16 15:16
 */
public class Demo1 {
    public static void main(String[] args) {
        int a=-1;
        // if语句
        if (a>0){
            System.out.println(a+"是正数");
        }

        //if...else语句
        if (a>0){
            System.out.println(a+"是正数");
        }else {
            System.out.println(a+"不是正数");
        }

        //if...else if...else
        if (a>0){
            System.out.println(a+"是正数");
        }else if (a<0){
            System.out.println(a+"是负数");
        }else{
            System.out.println(a+"是0");
        }
    }
}
