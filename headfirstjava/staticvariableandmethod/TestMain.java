package com.headfirstjava.staticvariableandmethod;



public class TestMain {
//    public static final int FOO_X = 25;
    public static final double BAR_SIGN;
    static{
        BAR_SIGN = (double) Math.random();
    }

    public static void main(String[] args) {

        int a = 20;
        Integer iWrap = new Integer(a);
        int i = iWrap.intValue();

        ClassB b = new ClassB();
        b.printA();

        System.out.println("Ceil : " + Math.ceil(-0.4));
        System.out.println("Floor : " + Math.floor(3.6));

        Math.min(5,2);
        System.out.println("Square Root : " + Math.sqrt(0));

//        a.go(30);
//
//        Math.random();
//        System.out.println(Math.abs(-240.5));
//        System.out.println(ClassA.count);
//
//        ClassB.displayA();
//
//        ClassC c = new ClassC(2);
//        c.print();
//
//        System.out.println("Value of PI : " + BAR_SIGN);
    }
}
