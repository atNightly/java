package com.java.chap12.sec01;

/**
 * @author Yan
 * @date 2019/7/27 13:18
 */
public class Eat extends Thread {
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            try {
                Thread.sleep(100);
                System.out.println("吃饭");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
