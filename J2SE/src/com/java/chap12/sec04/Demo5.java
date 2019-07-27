package com.java.chap12.sec04;

/**
 * @author Yan
 * @date 2019/7/27 14:35
 */
public class Demo5 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                //获取当前线程
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + ":" + i);  //返回线程的名称
                if (i==5){
                    System.out.println("线程礼让");
                    Thread.currentThread().yield();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        new Thread(demo5, "线程A").start();
        new Thread(demo5, "线程B").start();

    }
}
