package com.java.chap10.sec01;

/**
 * @author Yan
 * @date 2019/7/22 16:02
 */
public class C2 {
    private String a;

    public C2(String a) {
        super();
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    /**
     * 打印a的类型
     */
    public void print(){
        System.out.println("a的类型是："+a.getClass().getName());
    }
}
