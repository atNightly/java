package com.java.chap11.sec04;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Yan
 * @date 2019/7/25 16:02
 */
public class TestHashSet {

    public static void main(String[] args) {
        /**
         * 1. HashSet是无序的
         * 2. 不允许有重复值
         */
        HashSet<String> hashSet=new HashSet<String>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("5");
        hashSet.add("4");
        hashSet.add("2");

        /**
         * 用Iterator遍历集合
         */
        Iterator<String> iterator=hashSet.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s+" ");
        }


    }
}
