package com.java.chap08.sec03;

/**
 * @author Yan
 * @date 2019/7/21 16:07
 */
public class Demo2 {

    public static void testThrow(int a) throws Exception{
        if (a==1){

            //直接抛出一个异常类
            throw new Exception("有异常");

        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        try {
            testThrow(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            testThrow(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
