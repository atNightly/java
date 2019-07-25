package com.java.chap11.sec05;

import com.java.chap11.sec01.Student;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Yan
 * @date 2019/7/25 16:08
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, Student> hashMap=new HashMap<String,Student>();
        hashMap.put("1号",new Student("张三",10));
        hashMap.put("2号",new Student("李四",20));
        hashMap.put("3号",new Student("王五",30));

        // 通过key获取value
        Student student=hashMap.get("1号");
        System.out.println(student.getName()+":"+student.getAge());

        Iterator<String> iterator=hashMap.keySet().iterator();  //获取key的集合，再获取迭代器
        while (iterator.hasNext()){
            String key=iterator.next();    //获取key
            Student student1=hashMap.get(key);   //通过key获取value
            System.out.println("key="+key+"value=["+student1.getName()+","+student1.getAge()+"]");
        }
    }
}
