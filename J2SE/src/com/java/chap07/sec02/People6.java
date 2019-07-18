package com.java.chap07.sec02;

/**
 * 三围类
 * @author Yan
 * @date 2019/7/18 14:08
 */
class Sanwei{
    int b;   //胸围
    int w;   //腰围
    int h;   //臀围
}


public class People6 {


    /**
     * 报三围
     * @param age 年龄
     * @param sanwei  三围
     */
    void speak(int age,Sanwei sanwei){
        System.out.println("我今年"+age+"岁了,我的三围是"+sanwei.b+","+sanwei.w+","+sanwei.h);
        age=24;
        sanwei.b=80;
    }

    public static void main(String[] args) {
        People6 xiaoli=new People6();
        int age=23;
        Sanwei sanwei=new Sanwei();
        sanwei.b=90;
        sanwei.w=60;
        sanwei.h=90;
        //age传递的是值，sanwei传递的是引用（地址）,c里叫指针
        xiaoli.speak(age,sanwei);
        System.out.println(age);
        System.out.println(sanwei.b);
    }
}
