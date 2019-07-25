package com.java.chap11.sec01;

import java.util.LinkedList;

/**
 * @author Yan
 * @date 2019/7/25 14:41
 */
public class Demo {

    public static void main(String[] args) {
        Student student[]=new Student[3];
        Student student1=new Student("张三",1);
        Student student2=new Student("李四",3);
        Student student3=new Student("王五",4);


        LinkedList<Student> list=new LinkedList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);


        /**
         * 遍历集合
         */
        for (int i=0;i<list.size();i++){
            Student student4=list.get(i);
            System.out.println(student4.getName()+":"+student4.getAge());
        }
    }
}
