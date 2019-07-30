package com.java.chap14.sec02;

import java.io.File;
import java.io.IOException;

/**
 * @author Yan
 * @date 2019/7/30 15:43
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file=new File("D://java创建的目录");
        boolean b=file.mkdir();   //创建虚拟目录
        if (b){
            System.out.println("目录创建成功");
            file=new File("D://java创建的目录//java创建的文件.txt");
            boolean b2=file.createNewFile();   //创建文件
            if (b2){
                System.out.println("文件创建成功");
            }else {
                System.out.println("文件创建失败");
            }

        }else {
            System.out.println("目录创建失败");
        }
    }
}
