package com.java.chap07.sec08;

/**
 * @author Yan
 * @date 2019/7/18 22:00
 */
public class Demo5 {
    public static void main(String[] args) {
        String name="张三";
        char ming=name.charAt(1);
        System.out.println(ming);

        String srt="我是中国人";

        //遍历字符串
        for (int i=0;i<srt.length();i++){
            System.out.println(srt.charAt(i));
        }
    }
}
