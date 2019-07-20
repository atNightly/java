package com.java.chap07.sec11;

/**
 * 定义一个抽象类People
 * @author Yan
 * @date 2019/7/20 15:25
 */
public abstract class People {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println("我的姓名是："+this.getName());
    }


    /**
     *
     * 定义一个抽象方法职业
     */
    public abstract void profession();

}
