package com.java.chap07.sec15;

/**
 * @author Yan
 * @date 2019/7/20 21:18
 */
public class Test {

    public static void doSomeThing(Animal animal){
        animal.say();
        if (animal instanceof Dog){
            ((Dog)animal).f2();
        }
        if (animal instanceof Cat){
            ((Cat)animal).f2();
        }
    }

    public static void main(String[] args) {
        Animal dog=new Dog();
        System.out.println("dog对象是否属于Animal类："+(dog instanceof Animal));
        System.out.println("dog对象是否属于Dog类："+(dog instanceof Dog));
        System.out.println("dog对象是否属于Cat类："+(dog instanceof Cat));

        doSomeThing(new Dog());
        doSomeThing(new Cat());
    }
}
