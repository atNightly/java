package com.java.chap06;

/**
 * @author Yan
 * @date 2019/7/17 14:46
 */
public class Demo5 {
    public static void main(String[] args) {
        int temp;
        int []arr={4,21,0,-12,-3};

        //循环的次数n-1次
        for (int i=0;i<arr.length-1;i++){
            //比较次数n-1-i
            for (int j=0;j<arr.length-1-i;j++){
                //假如前面一个数大于后面一个数，则交换数据
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i:arr){
            System.out.print(i+"  ");
        }
    }
}
