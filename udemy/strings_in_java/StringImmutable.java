package com.udemy.strings_in_java;

public class StringImmutable {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Sagar");
        s.append(" Ghimire");
        System.out.println(s);
        String str = "This is again a lot of text";
        String[] a = str.split(" ");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
