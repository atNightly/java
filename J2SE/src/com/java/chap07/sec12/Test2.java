package com.java.chap07.sec12;

/**
 * @author Yan
 * @date 2019/7/20 16:04
 */
public class Test2 extends C implements D {
    @Override
    public void a() {
        System.out.println("a方法");
    }

    @Override
    public void b() {
        System.out.println("b方法");
    }

    @Override
    public void d() {
        System.out.println("d方法");
    }

    public static void main(String[] args) {
        Test2 test = new Test2();
        test.a();
        test.b();
        test.c();
        test.d();
        System.out.println(Test2.TITLEA);
        System.out.println(Test2.TITLEB);
    }


}
