package com.java.chap08.sec02;

/**
 * @author Yan
 * @date 2019/7/21 14:32
 */
public class Demo1 {
    public static void main(String[] args) {
        String str="123a";
        try {
            int a=Integer.parseInt(str);
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("aaaa");
    }

}
