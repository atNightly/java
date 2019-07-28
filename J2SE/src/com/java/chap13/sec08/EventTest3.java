package com.java.chap13.sec08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * @author Yan
 * @date 2019/7/28 22:24
 */

//class MyWindowAdapter extends WindowAdapter{
//    @Override
//    public void windowClosing(WindowEvent e) {
//        super.windowClosing(e);
//        System.out.println("窗口关闭。。。。。。。");
//    }
//}

public class EventTest3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Swing事件");

        //MyWindowAdapter myWindowAdapter=new MyWindowAdapter();
        //jFrame.addWindowListener(myWindowAdapter);


        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("窗口关闭。。。。");
            }
        });

        jFrame.getContentPane().setBackground(Color.red);   //设置容器的背景颜色
        jFrame.setLocation(300, 200);   //设置容器的位置
        jFrame.setSize(500, 500);    //设置容器大小
        jFrame.setVisible(true);  //让容器显示
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
