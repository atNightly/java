package com.java.chap10.sec02;

/**
 * @author Yan
 * @date 2019/7/24 16:11
 */
public class Test {
    public static void main(String[] args) {
        Demo<Dog> demo=new Demo<Dog>(new Dog());
        Dog dog=demo.getOb();
        dog.print();

        Demo<Cat> demo2=new Demo<Cat>(new Cat());
        Cat cat=demo2.getOb();
        cat.print();


        //Demo<Integer> demo3=new Demo<Integer>(2);
        Demo<Animal> demo3=new Demo<Animal>(new Animal());
    }
}
