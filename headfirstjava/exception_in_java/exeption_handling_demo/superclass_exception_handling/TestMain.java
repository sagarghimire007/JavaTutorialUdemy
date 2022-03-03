package com.headfirstjava.exception_in_java.exeption_handling_demo.superclass_exception_handling;

/*
Rules for exception handling in method overriding
Rule 1 : if the superclass method does not declare the exception than the subclass  over-ridden method cannot declare the
        checked exception

Rule 2 : if the superclass method does not declare the exception than the subclass  over-ridden method cannot declare the
        checked exception but can declare unchecked exception.
 */

public class TestMain {
    public static void main(String[] args) {

        try {
            TestExceptionChild obj = new TestExceptionChild();
            obj.msg();
        } catch (RuntimeException re) {
            System.out.println("Runtime Exception");
        }
    }
}
