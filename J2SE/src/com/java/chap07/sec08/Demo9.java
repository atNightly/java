package com.java.chap07.sec08;

/**
 * @author Yan
 * @date 2019/7/18 22:18
 */
public class Demo9 {
    public static void main(String[] args) {
        String str="  aB23 2&*  &*   s2  ";
        //去掉前面和后面的空白
        String newStr=str.trim();
        System.out.println("str:"+str);
        System.out.println("newStr:"+newStr);


        int yingWen=0;
        int kongGe=0;
        int shuZi=0;
        int qiTa=0;

        for (int i=0;i<newStr.length();i++){
            char c=newStr.charAt(i);
            if (c>='a'&&c<='z'||(c>='A'&&c<='Z')){
                //判断英文字符
                yingWen++;
                System.out.println("英文字符："+c);
            }else if (c>='0'&&c<='9'){
                //判断数字
                shuZi++;
                System.out.println("数字："+c);
            }else if (c==' '){
                //判断空格
                kongGe++;
                System.out.println("空格："+c);
            }else {
                //判断其他
                qiTa++;
                System.out.println("其他："+c);
            }
        }
        System.out.println();
        System.out.println("英文总数："+yingWen);
        System.out.println("数字总数："+shuZi);
        System.out.println("空格总数："+kongGe);
        System.out.println("其他总数："+qiTa);
    }
}
