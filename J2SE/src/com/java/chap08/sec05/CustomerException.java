package com.java.chap08.sec05;

/**
 * 自定义异常，继承自Exception
 * @author Yan
 * @date 2019/7/21 16:18
 */
public class CustomerException extends Exception{


    public CustomerException(String message){
        super(message);
    }



}
