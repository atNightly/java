package com.java.chap07.sec11;

/**
 * @author Yan
 * @date 2019/7/20 15:28
 */
public class Test {
    public static void main(String[] args) {
        //抽象类不能被实例化
        //People p=new People();
        Student student=new Student();
        student.profession();


        Teacher teacher=new Teacher();
        teacher.profession();
    }
}
