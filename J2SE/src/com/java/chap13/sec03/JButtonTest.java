package com.java.chap13.sec03;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yan
 * @date 2019/7/27 16:18
 */
public class JButtonTest {

    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JButton测试");
        JButton jButton=new JButton("这是一个按钮");
        jFrame.add(jButton);


        jFrame.getContentPane().setBackground(Color.red);   //设置容器的背景颜色
        jFrame.setLocation(300,200);   //设置容器的位置
        jFrame.setSize(500,500);    //设置容器大小
        jFrame.setVisible(true);  //让容器显示
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
