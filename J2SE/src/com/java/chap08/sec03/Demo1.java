package com.java.chap08.sec03;

/**
 * @author Yan
 * @date 2019/7/21 16:03
 */
public class Demo1 {
    /**
     * 把异常向外抛
     * @throws NumberFormatException
     */
    public static void testThrows() throws NumberFormatException {
        String str = "123a";
        int a = Integer.parseInt(str);
        System.out.println(a);
    }


    public static void main(String[] args) {
        try {

            testThrows();
        }catch (Exception e){
            System.out.println("在这里处理异常");
            e.printStackTrace();
        }
        System.out.println("I'm here");
    }
}
