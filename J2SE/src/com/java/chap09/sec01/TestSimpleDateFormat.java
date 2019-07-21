package com.java.chap09.sec01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yan
 * @date 2019/7/21 21:05
 */
public class TestSimpleDateFormat {

    /**
     * 将日期对象格式为指定格式的日期字符串
     * @param date 传入的日期对象
     * @param format  格式
     * @return
     */
    public static String formatDate(Date date,String format){
        String result="";
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        if (date!=null){
            result=sdf.format(date);
        }
        return result;
    }

    /**
     * 将日期字符串转换成一个日期对象
     * @param dataStr 日期字符串
     * @param format 格式
     * @return
     */
    public static Date formatDate(String dataStr,String format) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(format);

        return sdf.parse(dataStr);
    }

    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.println(sdf.format(date));

        String dataStr="2010-07-21 21:12:26";
        Date date1=formatDate(dataStr,"yyyy-MM-dd HH:mm:ss");

        System.out.println(formatDate(date,"yyyy-MM-dd HH:mm:ss"));


        System.out.println(formatDate(date1,"yyyy-MM-dd HH:mm:ss"));
    }
}
