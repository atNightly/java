package com.java.chap07.sec02;

/**
 * @author Yan
 * @date 2019/7/18 13:54
 */
public class People {
    /**
     * 最简单的一个方法定义
     */
    void speak(){
        System.out.println("我叫张三");
    }

    public static void main(String[] args) {
        People zhangsan=new People();
        zhangsan.speak();
    }
}
