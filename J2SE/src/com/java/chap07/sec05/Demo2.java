package com.java.chap07.sec05;


import com.java.chap07.sec02.People;

/**
 * @author Yan
 * @date 2019/7/18 16:19
 */
public class Demo2 {
    public static void main(String[] args) {

        //不同包，则需要导入相关类
        People people=new People();
        //在同一个包中，则不需要导入相关类
        Demo1 demo1=new Demo1();
    }
}
