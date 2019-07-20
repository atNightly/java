package com.java.chap07.sec16;

/**
 * @author Yan
 * @date 2019/7/20 21:35
 */
public class Test {
    public void test(A a){
        a.a();
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.test(new B());

        //匿名内部类
        test.test(new A() {
            @Override
            public void a() {
                System.out.println("匿名内部类，一次性使用");
            }
        });
    }
}
