package com.balaguruswamy.exception_in_java.custom_exception;

public class CustomExceptionMain {
    public static void main(String[] args) {

        String county = "india";
        try {
            if (!county.equals("india")) {
                throw new MyException("NoMatchException");
            } else {
                System.out.println("No Exception Occurred");
            }
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
