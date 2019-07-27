package com.java.chap12.sec04;

/**
 * @author Yan
 * @date 2019/7/27 14:35
 */
public class Demo3 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
                //获取当前线程
                Thread t=Thread.currentThread();
                System.out.println(t.getName()+":"+i);  //返回线程的名称
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Demo3 demo2=new Demo3();
        Thread t1=new Thread(demo2);
        t1.start();
    }
}
