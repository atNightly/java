package com.java.chap14.sec04;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * @author Yan
 * @date 2019/7/31 22:31
 */
public class Demo1 {

    /**
     * 缓冲
     *
     * @throws Exception
     */
    public static void bufferStream() throws Exception {
        //定义一个带缓冲的字节输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D://实验报告//android//Android应用开发实验指导书.doc"));
        //定义一个带缓冲的字节输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D://复制的文件2.doc"));
        int b = 0;
        Long startTime = System.currentTimeMillis();  //开始时间
        while ((b = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(b);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
        Long endTime = System.currentTimeMillis();   //结束时间
        System.out.println("缓冲花费的时间：" + (endTime - startTime));
    }


    /**
     * 非缓冲
     *
     * @throws Exception
     */
    public static void stream() throws Exception {
        InputStream inputStream = new FileInputStream("D://实验报告//android//Android应用开发实验指导书.doc");  //定义一个输入流
        OutputStream outputStream = new FileOutputStream("D://复制的文件.doc");
        int b = 0;
        Long startTime = System.currentTimeMillis();  //开始时间
        while ((b = inputStream.read()) != -1) {
            outputStream.write(b);
        }
        inputStream.close();
        outputStream.close();
        Long endTime = System.currentTimeMillis();   //结束时间
        System.out.println("非缓冲花费的时间：" + (endTime - startTime));
    }

    public static void main(String[] args) throws Exception {
        stream();

        bufferStream();
    }
}
