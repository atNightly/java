package com.java.chap09.sec02;

/**
 * @author Yan
 * @date 2019/7/22 14:01
 */
public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("123");
        sb.append("abc");
        System.out.println(sb);
    }
}
