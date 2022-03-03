package com.headfirstjava.exception_in_java;

public class TestException {
    public static void main(String[] args) {
        try {

            String test = "yes";
            System.out.println("Start try");
            doRisky(test);
            System.out.println("end try");
        } catch (Exception ex) {
            System.out.println("scary exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("End of Main");
    }

    public static void doRisky(String test) throws Exception {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new Exception();
        }
        System.out.println("end risky");
        return;
    }
}
