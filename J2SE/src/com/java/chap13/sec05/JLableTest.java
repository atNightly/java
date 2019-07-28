package com.java.chap13.sec05;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yan
 * @date 2019/7/28 16:02
 */
public class JLableTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JLable测试");

        JLabel jLabel = new JLabel("JLable组件", JLabel.CENTER);
        jFrame.add(jLabel);


        jFrame.getContentPane().setBackground(Color.red);   //设置容器的背景颜色
        jFrame.setLocation(300, 200);   //设置容器的位置
        jFrame.setSize(500, 500);    //设置容器大小
        jFrame.setVisible(true);  //让容器显示
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
