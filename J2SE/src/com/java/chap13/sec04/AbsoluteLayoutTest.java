package com.java.chap13.sec04;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yan
 * @date 2019/7/28 15:44
 */
public class AbsoluteLayoutTest {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("绝对布局测试");

        jFrame.setLayout(null);
        JButton jButton1=new JButton("按钮1");
        JButton jButton2=new JButton("按钮2");
        jFrame.add(jButton1);
        jFrame.add(jButton2);
        jButton1.setBounds(50,10,100,20);
        jButton2.setBounds(70,40,200,30);


        jFrame.getContentPane().setBackground(Color.red);   //设置容器的背景颜色
        jFrame.setLocation(300,200);   //设置容器的位置
        jFrame.setSize(500,500);    //设置容器大小
        jFrame.setVisible(true);  //让容器显示
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
