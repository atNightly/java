package com.java.chap10.sec03;

import com.java.chap10.sec02.Animal;
import com.java.chap10.sec02.Cat;
import com.java.chap10.sec02.Demo;
import com.java.chap10.sec02.Dog;

/**
 * @author Yan
 * @date 2019/7/24 16:23
 */
public class Test {

    /**
     * 通配符泛型
     * @param animal
     */
    private static void take(Demo<?> animal){
        animal.print();
    }
    public static void main(String[] args) {
        Demo<Dog> dog=new Demo<Dog>(new Dog());
        take(dog);

        Demo<Cat> cat=new Demo<Cat>(new Cat());
        take(cat);

        Demo<Animal> animalDemo=new Demo<Animal>(new Animal());
        take(animalDemo);
    }
}
