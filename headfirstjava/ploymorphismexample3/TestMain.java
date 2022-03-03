package com.headfirstjava.ploymorphismexample3;

public class TestMain {
    public static void main(String[] args) {
        A a = new B();
        A aa = new C();
        a.display();
        System.out.println(a.isEqual());
        aa.display();
    }
}
