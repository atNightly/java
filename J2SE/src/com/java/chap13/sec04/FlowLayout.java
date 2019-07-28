package com.java.chap13.sec04;

import javax.swing.*;
import java.awt.*;

/**
 * FlowLayout流式布局
 * @author Yan
 * @date 2019/7/27 16:26
 */
public class FlowLayout {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("FlowLayout测试");

        //jFrame.setLayout(new java.awt.FlowLayout());
        //jFrame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jFrame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT,15,15));
        JButton jButton=null;
        for(int i=0;i<9;i++){
            jButton=new JButton("JButton"+i);
            jFrame.add(jButton);
        }

        jFrame.getContentPane().setBackground(Color.red);   //设置容器的背景颜色
        jFrame.setLocation(300,200);   //设置容器的位置
        jFrame.setSize(500,500);    //设置容器大小
        jFrame.setVisible(true);  //让容器显示
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
