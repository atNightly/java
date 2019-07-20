package com.java.chap07.sec13;

/**
 * @author Yan
 * @date 2019/7/20 16:25
 */
public class Test {
    public static void main(String[] args) {
        /*
        Dog dog=new Dog();
        dog.say();

        Cat cat=new Cat();
        cat.say();
        */

        //父类引用指向Dog类的具体实现
        Animal animal = new Dog();
        animal.say();


        //向下转型
        Dog dog= (Dog) animal;
        dog.say();


        //向下转型2 不安全
        Cat cat= (Cat) animal;
        cat.say();


        /*animal=new Cat();
        animal.say();
         */
    }
}
