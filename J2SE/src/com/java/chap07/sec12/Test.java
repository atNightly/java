package com.java.chap07.sec12;

/**
 * @author Yan
 * @date 2019/7/20 16:04
 */
public class Test extends C implements A, B {
    @Override
    public void a() {
        System.out.println("a方法");
    }

    @Override
    public void b() {
        System.out.println("b方法");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.a();
        test.b();
        test.c();
        System.out.println(Test.TITLEA);
        System.out.println(Test.TITLEB);
    }


}
