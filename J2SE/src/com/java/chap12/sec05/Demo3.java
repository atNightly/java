package com.java.chap12.sec05;

/**
 * @author Yan
 * @date 2019/7/27 14:54
 */
public class Demo3 implements Runnable {

    private int baoZi = 10;

    @Override
    public void run() {
        /**
         * 同步块
         */
        synchronized (this) {
            while (baoZi > 0) {
                System.out.println(Thread.currentThread().getName() + "吃了第" + baoZi + "包子");
                baoZi--;
            }

        }
    }


    public static void main(String[] args) {
        Demo3 demo1 = new Demo3();
        new Thread(demo1, "张三").start();
        new Thread(demo1, "李四").start();
        new Thread(demo1, "王五").start();
    }
}
