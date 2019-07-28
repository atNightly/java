package com.java.chap13.sec02;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yan
 * @date 2019/7/27 15:38
 */
public class JFrameTest {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JFrame窗体");
        /*Container c=jFrame.getContentPane();
        c.setBackground(Color.blue);*/
        jFrame.getContentPane().setBackground(Color.red);   //设置容器的背景颜色
        jFrame.setLocation(300,200);   //设置容器的位置
        jFrame.setSize(500,500);    //设置容器大小
        jFrame.setVisible(true);  //让容器显示
    }
}
