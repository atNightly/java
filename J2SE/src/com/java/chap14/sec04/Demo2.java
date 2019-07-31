package com.java.chap14.sec04;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * @author Yan
 * @date 2019/7/31 23:04
 */
public class Demo2 {
    public static void main(String[] args) throws Exception {
        File file = new File("D://测试文件.txt");
        Reader reader=new FileReader(file);
        char c[]=new char[1024];   //字符数组
        int temp=0;
        int len=0;
        while ((temp=reader.read())!=-1){
            c[len++]= (char) temp;
        }
        reader.close();   //关闭输入流
        System.out.println("读取的内容是："+new String(c,0,len));
    }
}
