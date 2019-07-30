package com.java.chap14.sec02;

import java.io.File;
import java.io.IOException;

/**
 * @author Yan
 * @date 2019/7/30 15:43
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file=new File("D://java创建的目录//Java创建的文件.txt");
        if (file.exists()){  //假如目录存在
            boolean b=file.delete();    //删除文件
            if (b){
                System.out.println("删除文件成功");
            }else {
                System.out.println("删除文件失败");
            }
        }
        file=new File("D://java创建的目录");
        if (file.exists()){
            boolean b2=file.delete();   //删除目录
            if (b2){
                System.out.println("删除目录成功");
            }else {
                System.out.println("删除目录失败");
            }
        }
    }
}
