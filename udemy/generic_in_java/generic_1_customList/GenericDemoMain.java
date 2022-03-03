package com.udemy.generic_in_java.generic_1_customList;

public class GenericDemoMain {
    public static void main(String[] args) {

        GenericCustomList<String> list = new GenericCustomList<String>();
        list.addElement("Element 1");
        list.addElement("Element 2");

        GenericCustomList<Integer> list2 = new GenericCustomList<Integer>();
        list2.addElement(Integer.valueOf(1));
        list2.addElement(Integer.valueOf(2));
        list2.addElement(Integer.valueOf(3));

        Integer n = (Integer) list2.getElement(0);

        System.out.println(list.toString());
        System.out.println(list2.toString());
    }
}
