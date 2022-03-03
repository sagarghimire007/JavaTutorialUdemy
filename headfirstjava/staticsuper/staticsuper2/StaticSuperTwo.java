package com.headfirstjava.staticsuper.staticsuper2;

import jdk.dynalink.beans.StaticClass;

class StaticSuperTwo {
    static {
        System.out.println("Super static block");
    }

    StaticSuperTwo() {
        System.out.println("This is in super constructor");
    }
}

class StaticTest extends StaticSuperTwo {

    static {
        System.out.println("Child static block");
    }

     StaticTest(){
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
//        System.out.println("In main");
//        StaticTest st = new StaticTest();
        int  i = 10;
        Integer iwrap = new Integer(i);
//        int a  = i.intValue();
    }
}
