package com.java.chap14.sec03;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author Yan
 * @date 2019/7/31 14:36
 */
public class Demo3 {

    public static void main(String[] args) throws Exception {
        File file=new File("D://测试文件.txt");
        InputStream inputStream=new FileInputStream(file);   //实例化FileInputStream
        int fileLength= (int) file.length();
        byte b[]=new byte[fileLength];
        int temp=0;
        int len=0;
        while ((temp=inputStream.read())!=-1){
            //一个字节一个字节读取，放到b字节数组里
            b[len++]= (byte) temp;
        }
        inputStream.close();   //关闭输出流
        System.out.println("读取的内容："+new String(b));
    }
}
