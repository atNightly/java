package com.java.chap05;

/**
 * @author Yan
 * @date 2019/7/16 15:42
 */
public class Demo4 {
    public static void main(String[] args) {
        for (int i=100;i<=999;i++){
            //求出百位数
            int b=i/100;
            //求出十位数
            int s=(i-b*100)/10;
            //求出个位数
            int g=(i-b*100-s*10);

            if (i==g*g*g+s*s*s+b*b*b){
                System.out.println(i+" ");
            }
        }
    }
}
