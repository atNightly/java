package com.java.chap12.sec04;

import javax.swing.plaf.TableHeaderUI;

/**
 * @author Yan
 * @date 2019/7/27 14:23
 */
public class Demo1 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            //获取当前线程
            Thread t=Thread.currentThread();
            System.out.println(t.getName()+":"+i);  //返回线程的名称
        }
    }


    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        new Thread(demo1).start();
        new Thread(demo1).start();
        new Thread(demo1,"线程3").start();
    }
}
