package com.java.chap07.sec14;

/**
 * @author Yan
 * @date 2019/7/20 21:04
 */
public class People {

    private String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        String name=((People)obj).getName();
        System.out.println(name);
        return this.name==name;
    }

    public static void main(String[] args) {
        People people=new People("张三");
        People people1=new People("张三");
        People people3=new People("李四");
        System.out.println("people.equals(people1)"+people.equals(people1));
        System.out.println("people1.equals(people3)"+people1.equals(people3));
        System.out.println(people);
        System.out.println(people.toString());
    }
}
