package com.java.chap11.sec03;

import com.java.chap11.sec01.Student;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Yan
 * @date 2019/7/25 15:57
 */
public class TestForeach {
    public static void main(String[] args) {
        LinkedList<Student> list=new LinkedList<Student>();
        list.add(new Student("张三",10));
        list.add(new Student("李四",20));
        list.add(new Student("王五",30));


        /**
         * 用Foreach遍历集合
         */
        for (Student s:list){
            System.out.println("姓名："+s.getName()+"   年龄："+s.getAge());

        }

    }
}
