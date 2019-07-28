package com.java.chap13.sec06;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yan
 * @date 2019/7/28 16:17
 */
public class JTextAreaTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JTextArea文本域测试");

        jFrame.setLayout(new GridLayout(1, 2, 10, 10));
        JLabel jLabel = new JLabel("描述：");
        JTextArea jTextArea = new JTextArea();
        jFrame.add(jLabel);
        jFrame.add(jTextArea);

        jFrame.getContentPane().setBackground(Color.red);   //设置容器的背景颜色
        jFrame.setLocation(300, 200);   //设置容器的位置
        jFrame.setSize(500, 500);    //设置容器大小
        jFrame.setVisible(true);  //让容器显示
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
