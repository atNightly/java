package com.java.chap07.sec02;

/**
 * @author Yan
 * @date 2019/7/18 13:57
 */
public class People5 {

    //返回类型
    int speak(String name, int age,String ...hobbies) {
        System.out.println("我叫" + name + "我今年" + age + "岁了");
        System.out.println("我的爱好：  ");
        for (String hobby:hobbies){
            System.out.print(hobby+"  ");
        }

        //获取爱好的长度
        int totalHobbies=hobbies.length;
        return totalHobbies;
    }

    public static void main(String[] args) {
        People5 zhangsan = new People5();
        int n=zhangsan.speak("张三", 23,"游泳","唱歌");
        System.out.println("\n有"+n+"个爱好");
    }
}
