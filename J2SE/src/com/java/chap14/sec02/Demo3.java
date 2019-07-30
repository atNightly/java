package com.java.chap14.sec02;

import java.io.File;

/**
 * @author Yan
 * @date 2019/7/30 17:21
 */
public class Demo3 {
    public static void main(String[] args) {
        File file=new File("D://图书");
        File files[]=file.listFiles();    //遍历目录
        for (int i=0;i<files.length;i++){
            System.out.println(files[i]);
        }
    }
}
