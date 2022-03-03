package com.headfirstjava.wrapperclass;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10,b;
        b = display(a);
        wrapperOperands();
        System.out.println("Value of b : " + b);
    }

    public static Integer display(Integer a){
        Boolean bool = true;
        if(bool){

        }
//        System.out.println(a);
        Integer b = a + 10;
        return b;
    }

    public static void wrapperOperands(){
        Integer a = new Integer(10);
        System.out.println("Increment of wrapper reference : " + (++a));
    }

}
