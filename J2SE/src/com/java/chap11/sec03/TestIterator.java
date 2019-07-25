package com.java.chap11.sec03;

import com.java.chap11.sec01.Student;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Yan
 * @date 2019/7/25 15:51
 */
public class TestIterator {

    public static void main(String[] args) {
        LinkedList<Student> list=new LinkedList<Student>();
        list.add(new Student("张三",10));
        list.add(new Student("李四",20));
        list.add(new Student("王五",30));


        /**
         * 用Iterator遍历集合
         */
        Iterator<Student> iterator=list.iterator();   //返回一个迭代器
        while(iterator.hasNext()){
            Student s=iterator.next();    //返回迭代的下一个元素
            System.out.println("姓名："+s.getName()+"   年龄："+s.getAge());
        }

    }
}
