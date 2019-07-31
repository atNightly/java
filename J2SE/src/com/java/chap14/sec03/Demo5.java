package com.java.chap14.sec03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author Yan
 * @date 2019/7/31 15:38
 */
public class Demo5 {
    public static void main(String[] args) throws Exception {
        File file=new File("D://测试文件.txt");
        OutputStream outputStream=new FileOutputStream(file,true);  //true追加
        String str="你好，我好，大家好";
        byte b[]=str.getBytes();
        outputStream.write(b);   //将b字节数组写入到输出流中
        outputStream.close();   //关闭输出流
    }
}
