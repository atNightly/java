package com.java.chap13.sec08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Yan
 * @date 2019/7/28 22:11
 */

class JButtonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        JOptionPane.showMessageDialog(null,"我被点击了");
    }
}

public class EventTest1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Swing事件");
        JButton jButton=new JButton("我是一个按钮");

        JButtonListener jButtonListener=new JButtonListener();
        jButton.addActionListener(jButtonListener);  //添加/注册事件监听

        jFrame.add(jButton);


        jFrame.getContentPane().setBackground(Color.red);   //设置容器的背景颜色
        jFrame.setLocation(300, 200);   //设置容器的位置
        jFrame.setSize(500, 500);    //设置容器大小
        jFrame.setVisible(true);  //让容器显示
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
