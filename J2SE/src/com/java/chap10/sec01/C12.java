package com.java.chap10.sec01;

/**
 * @author Yan
 * @date 2019/7/22 16:09
 */
public class C12 {
    private Object object;

    public C12(Object object) {
        super();
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    /**
     * 打印object的类型
     */
    public void print(){
        System.out.println("a的类型是："+object.getClass().getName());
    }
}
