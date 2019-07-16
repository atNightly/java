package com.java.chap05;

/**
 * @author Yan
 * @date 2019/7/16 15:57
 */
public class Demo7 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            if (i==4){
                continue;
            }
            System.out.print("i="+i+"  ");
        }
    }
}
