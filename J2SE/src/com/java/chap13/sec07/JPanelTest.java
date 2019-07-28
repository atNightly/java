package com.java.chap13.sec07;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * @author Yan
 * @date 2019/7/28 16:50
 */
public class JPanelTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JPanel面板测试");

        JPanel jPanel=new JPanel();
        jPanel.setLayout(new GridLayout(3,2,10,10));
        jFrame.add(jPanel);
        jPanel.setBorder(new EmptyBorder(10,10,10,10));   //设置边距


        JLabel jLabel = new JLabel("用户名：");
        JTextField jTextField = new JTextField();
        JLabel jLabe2 = new JLabel("密码：");
        JPasswordField jPasswordField = new JPasswordField();
        JButton jButton=new JButton("登录");
        JButton jButton2=new JButton("重置");

        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jLabe2);
        jPanel.add(jPasswordField);
        jPanel.add(jButton);
        jPanel.add(jButton2);

        jFrame.getContentPane().setBackground(Color.red);   //设置容器的背景颜色
        jFrame.setLocation(300, 200);   //设置容器的位置
        jFrame.setSize(500, 500);    //设置容器大小
        jFrame.setVisible(true);  //让容器显示
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
