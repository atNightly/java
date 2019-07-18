package com.java.chap07.sec03;

/**
 * @author Yan
 * @date 2019/7/18 15:38
 */
public class Demo3 {


    /**
     * 非递归
     * @param n
     * @return
     */
    static long notDiGui(int n){
        long result=1;
        for (int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }

    /**
     * 递归
     * @param n
     * @return
     */
    static long DiGUi(int n){
        if (n==1){
            return 1;
        }
        return DiGUi(n-1)*n;
    }



    public static void main(String[] args) {
        System.out.println("非递归："+Demo3.notDiGui(5));
        System.out.println("递归:"+Demo3.DiGUi(5));
    }
}
