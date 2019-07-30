package com.java.chap14.sec02;

import java.io.File;

/**
 * @author Yan
 * @date 2019/7/30 17:45
 */
public class Demo4 {

    /**
     * 打印文件
     * @param file
     */
    public static void listFile(File file) {
        if (file != null) {
            if (file.isDirectory()) {  //是目录
                File files[]=file.listFiles();   //遍历目录
                if (files!=null){
                    for (int i=0;i<files.length;i++){
                        listFile(files[i]);   //递归调用
                    }
                }
            } else {    //是文件
                System.out.println(file);    //是文件，直接打印文件的路径
            }
        }
    }

    public static void main(String[] args) {
        File file=new File("D://实验报告");
        listFile(file);
    }
}
