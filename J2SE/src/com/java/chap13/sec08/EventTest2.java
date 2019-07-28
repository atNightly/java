package com.java.chap13.sec08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author Yan
 * @date 2019/7/28 22:17
 */

//class MyWindowListener implements WindowListener {
//
//    @Override
//    public void windowOpened(WindowEvent e) {
//        System.out.println("窗口被打开");
//    }
//
//    @Override
//    public void windowClosing(WindowEvent e) {
//        System.out.println("窗口关闭");
//    }
//
//    @Override
//    public void windowClosed(WindowEvent e) {
//        System.out.println("窗口被关闭");
//    }
//
//    @Override
//    public void windowIconified(WindowEvent e) {
//        System.out.println("窗口最小化");
//    }
//
//    @Override
//    public void windowDeiconified(WindowEvent e) {
//        System.out.println("窗口从最小化恢复");
//    }
//
//    @Override
//    public void windowActivated(WindowEvent e) {
//        System.out.println("窗口被选中");
//    }
//
//    @Override
//    public void windowDeactivated(WindowEvent e) {
//        System.out.println("窗口选中被取消");
//    }
//}

public class EventTest2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Swing事件");

        //MyWindowListener myWindowListener=new MyWindowListener();
        //jFrame.addWindowListener(myWindowListener);

        jFrame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("窗口被打开");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("窗口关闭");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("窗口被关闭");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("窗口最小化");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("窗口从最小化恢复");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("窗口被选中");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("窗口选中被取消");
            }
        });

        jFrame.getContentPane().setBackground(Color.red);   //设置容器的背景颜色
        jFrame.setLocation(300, 200);   //设置容器的位置
        jFrame.setSize(500, 500);    //设置容器大小
        jFrame.setVisible(true);  //让容器显示
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
