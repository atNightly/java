package com.java.chap07.sec07;

/**
 * @author Yan
 * @date 2019/7/18 16:52
 */
public class Demo2 {
    /**
     * 构造块
     * @param args
     */
    {
        System.out.println("通用构造块");
    }

    /**
     * 构造方法一
     */
    public Demo2(){
        System.out.println("构造方法一");
    }
    /**
     * 构造方法二
     */
    public Demo2(int i){
        System.out.println("构造方法二");
    }
    /**
     * 构造方法三
     */
    public Demo2(int i,int j){
        System.out.println("构造方法三");
    }


    public static void main(String[] args) {
        new Demo2();    //实例化一个对象  匿名类
        new Demo2(1);
        new Demo2(1,2);
    }
}
