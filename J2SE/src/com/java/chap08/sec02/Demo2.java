package com.java.chap08.sec02;

/**
 * @author Yan
 * @date 2019/7/21 15:59
 */
public class Demo2 {

    public static void testFinally(){
        String str="123a";
        try{
            int a=Integer.parseInt(str);
            System.out.println(a);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("exception");
            return;
        }finally {
            System.out.println("final end");
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        testFinally();
    }
}
