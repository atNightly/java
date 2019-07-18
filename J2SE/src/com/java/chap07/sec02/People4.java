package com.java.chap07.sec02;

/**
 * @author Yan
 * @date 2019/7/18 13:57
 */
public class People4 {

    //形参，入参,不固定参数
    void speak(String name, int age,String ...hobbies) {
        System.out.println("我叫" + name + "我今年" + age + "岁了");
        System.out.println("我的爱好：  ");
        for (String hobby:hobbies){
            System.out.print(hobby+"  ");
        }
    }

    public static void main(String[] args) {
        People4 zhangsan = new People4();
        zhangsan.speak("张三", 23,"游泳","唱歌");
    }
}
