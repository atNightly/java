package com.java.chap12.sec01;

/**
 * @author Yan
 * @date 2019/7/27 13:15
 */
public class Demo1 {

    /**
     * 听音乐
     */
    private static void music(){
        for (int i=0;i<1000;i++){
            System.out.println("听音乐");
        }
    }

    /**
     * 吃饭
     *
     */
    private static void eat(){
        for (int i=0;i<1000;i++){
            System.out.println("吃饭");
        }
    }
    public static void main(String[] args) {
        //music();
        //eat();

        /**
         * 利用多线程实现一边吃饭一边听歌
         */
        Music musicThread=new Music();
        Eat eatThread=new Eat();
        musicThread.start();
        eatThread.start();
    }
}
