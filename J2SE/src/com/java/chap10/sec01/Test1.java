package com.java.chap10.sec01;

/**
 * @author Yan
 * @date 2019/7/22 16:03
 */
public class Test1 {

    public static void main(String[] args) {
        //begin test c1
        C1 c1=new C1(1);
        c1.print();

        int i=c1.getA();
        System.out.println("i="+i);

        //end test c1

        //begin test c2
        C2 c2=new C2("Hi");
        c2.print();
        String s1=c2.getA();
        System.out.println("s1="+s1);
        //end test c2


        //begin test c12
        C12 c12=new C12(1);   //向上转型
        c12.print();
        int i12= (Integer) c12.getObject();   //向下转型
        System.out.println("i12="+i12);

        C12 c121=new C12("你好");  //向上转型
        c121.print();
        String i121=(String) c121.getObject();  //向下转型
        System.out.println("i121="+i121);
        //end test c12


        //begin test CC
        CC<Integer> cc=new CC<Integer>(1);
        cc.print();
        int icc=cc.getOb();
        System.out.println("icc="+icc);
        //end test CC

        //begin test CC
        CC<String> cc1=new CC<String>("你好");
        cc1.print();
        String icc1=cc1.getOb();
        System.out.println("icc1="+icc1);
        //end test CC
    }
}
