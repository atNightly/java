package com.java.chap07.sec07;

/**
 * @author Yan
 * @date 2019/7/18 16:49
 */
public class Demo1 {
    public static void main(String[] args) {
        int a=1;
        /**
         * 普通代码块
         */
        {
            a=2;
            System.out.println("普通代码块");
        }
        System.out.println("a="+a);
    }
}
