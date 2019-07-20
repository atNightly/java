package com.java.chap07.sec13;

/**
 * @author Yan
 * @date 2019/7/20 16:25
 */
public class Test2 {
    public static void main(String[] args) {


        //父类引用指向Dog类的具体实现  向上转型
        Animal2 animal2 = new Dog2();
        animal2.say2();


        animal2=new Cat2();
        animal2.say2();


        //向下转型
        Dog2 dog2= (Dog2) animal2;
        dog2.say2();


        //向下转型2 不安全
        Cat2 cat2= (Cat2) animal2;
        cat2.say2();

    }
}
