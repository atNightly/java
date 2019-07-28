package com.java.chap13.sec04;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yan
 * @date 2019/7/28 15:39
 */
public class GridLayoutTest {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("GridLayout测试");


        jFrame.setLayout(new GridLayout(4,5,5,5));
        JButton jButton=null;
        for (int i=0;i<19;i++){
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
