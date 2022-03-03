package com.udemy.strings_in_java;

import jdk.swing.interop.SwingInterOpUtils;

public class NotString {


    public static void main(String[] args) {
        String someString = "This is a lot of text again";
        String[] s = someString.split("\\s");
        for(String a : s){
            System.out.println(a);
        }
//        for(int i = 0; i < someString.length(); i++){
//            System.out.println(someString.charAt(i));
//        }


    }
}
