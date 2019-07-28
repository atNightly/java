package com.java.chap13.sec06;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yan
 * @date 2019/7/28 16:42
 */
public class JPasswordFiledTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JPasswordFiled密码框测试");

        jFrame.setLayout(new GridLayout(2, 2, 10, 10));
        JLabel jLabel = new JLabel("用户名：");
        JTextField jTextField = new JTextField();
        JLabel jLabe2 = new JLabel("密码：");
        JPasswordField jPasswordField = new JPasswordField();
        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jLabe2);
        jFrame.add(jPasswordField);

        jFrame.getContentPane().setBackground(Color.red);   //设置容器的背景颜色
        jFrame.setLocation(300, 200);   //设置容器的位置
        jFrame.setSize(500, 500);    //设置容器大小
        jFrame.setVisible(true);  //让容器显示
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
