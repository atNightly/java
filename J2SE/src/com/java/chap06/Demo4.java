package com.java.chap06;

/**
 * @author Yan
 * @date 2019/7/17 14:35
 */
public class Demo4 {
    public static void main(String[] args) {
        //定义一个二维数组,并静态初始化
        int [][]arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        //输出
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();

        }


        //二维数组的动态初始化
        int [][]arr2=new int[3][3];
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2[0].length;j++){
                System.out.print(arr2[i][j]+"  ");
            }
            System.out.println();

        }

    }
}
