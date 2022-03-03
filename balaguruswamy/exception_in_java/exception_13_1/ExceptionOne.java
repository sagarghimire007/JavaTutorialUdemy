package com.balaguruswamy.exception_in_java.exception_13_1;

import com.balaguruswamy.exception_in_java.custom_exception.MyException;

public class ExceptionOne {
    public static void main(String[] args) {
        try {
            if (args[0] == "Hello") {
                System.out.println("String is right");
            } else {
                try {
                    throw new MyException("Invalid String");
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("array index out of bound exception");
        }
    }
}
