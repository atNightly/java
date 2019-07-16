package com.java.chap05;

import java.util.Scanner;

/**
 * @author Yan
 * @date 2019/7/16 15:22
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        //定义一个系统输入对象
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        //System.out.println(n);
        switch (n){
            case 1:{
                System.out.println("用户输入的是1");
                break;
            }
            case 2:{
                System.out.println("用户输入的是2");
                break;
            }
            default:{
                System.out.println("用户输入的是其他数字");
            }
        }
    }
}


