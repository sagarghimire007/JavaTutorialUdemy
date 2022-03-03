package com.javaEdureka.stringsinjava;

public class StringDemo {
    public static void main(String[] args) {
        String s = "Edureka";
        String s1 = "EDUREKA";
        String s2 = "rekaa";

        System.out.println("Are String equals(no ignore case) : " + s.equals(s1));
        System.out.println("Are String equals(ignore case) : " + s.equalsIgnoreCase(s1));
        System.out.println("String s1 conatains sequenece of character of string s2 or not : " + s1.contains(s2));
        System.out.println("Upper Case : " + s.toUpperCase());
        System.out.println("Is empty : " + s.isEmpty());
        System.out.println("Comparing Two Strings : " + s.compareTo(s1));
        System.out.println("Length of String : " + s.length());
        System.out.println("SubString of a String : " + s.substring(2));
    }
}
