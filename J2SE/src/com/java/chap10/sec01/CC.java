package com.java.chap10.sec01;

/**
 * 定义泛型类
 * @author Yan
 * @date 2019/7/24 15:56
 */
public class CC<T> {

    private T ob;

    public CC(T ob) {
        super();
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }


    /**
     * 打印T的类型
     */
    public void print(){
        System.out.println("T的实际类型"+ob.getClass().getName());;
    }
}
