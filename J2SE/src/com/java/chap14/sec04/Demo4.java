package com.java.chap14.sec04;


import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * @author Yan
 * @date 2019/7/31 23:06
 */
public class Demo4 {
    public static void main(String[] args) throws Exception {
        File file = new File("D://测试文件.txt");
        Writer out = new FileWriter(file,true);
        String str = "我爱中华";
        out.write(str);   //将字符串写入输出流
        out.close();   //关闭输出流
    }
}
