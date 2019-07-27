package com.java.chap12.sec01;

/**
 * @author Yan
 * @date 2019/7/27 13:19
 */
public class Music extends Thread {
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            try {
                Thread.sleep(100);
                System.out.println("听音乐");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
