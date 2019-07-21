package com.java.chap08.sec04;

/**
 * @author Yan
 * @date 2019/7/21 16:12
 */
public class Demo1 {

    /**
     * 运行时异常，编译时不检查，可以不适用try...catch捕获
     * @throws RuntimeException
     */
    public static void testRuntimeException() throws RuntimeException {
        throw new RuntimeException("运行时异常");
    }

    /**
     * Exception异常，编译时异常，必须使用try...catch捕获
     * @throws Exception
     */
    public static void testException() throws Exception{
        throw new Exception("Exception异常");
    }

    public static void main(String[] args) {
        try{
            testRuntimeException();

        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            testException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
