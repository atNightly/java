package com.java.chap10.sec02;

/**
 * @author Yan
 * @date 2019/7/24 16:08
 */

public class Demo <T extends Animal>{
    private T ob;

    public Demo(T ob) {
        super();
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public void print(){
        System.out.println("T的类型是： "+ob.getClass().getName());
    }
}
