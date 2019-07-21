package com.java.chap08.sec05;

/**
 * @author Yan
 * @date 2019/7/21 16:19
 */
public class TestCustomerException {

    public static void test() throws CustomerException{
        throw new CustomerException("自定义异常");
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (CustomerException e) {
            e.printStackTrace();
        }
    }
}
