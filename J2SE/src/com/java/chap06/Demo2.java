package com.java.chap06;

/**
 * @author Yan
 * @date 2019/7/17 14:14
 */
public class Demo2 {
    public static void main(String[] args) {
        //定义一个数组，并且静态初始化
        int arr[]=new  int[]{1,2,3};

        //普通的遍历数组方式
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("------------");


        //foreach方法遍历数组
        for (int j:arr){
            System.out.println(j);
        }
    }
}
