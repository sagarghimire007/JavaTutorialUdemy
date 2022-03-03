package com.headfirstjava.araylist;

import java.util.ArrayList;

public class EggMain {
    public static void main(String[] args) {

        ArrayList<Egg> myList = new ArrayList<>();
        //append an object in a list
        Egg s = new Egg();
        myList.add(s);

        // append another object in a list
        Egg b = new Egg();
        myList.add(b);

        // find the size of an array list
        int theSize = myList.size();
        System.out.println("Size of an arraylist : "+theSize);

        // find out if it contains something
        boolean isIn = myList.contains(s);
        System.out.println(isIn);

        // find out something is( i.e. its index)
        int indx = myList.indexOf(b);
        System.out.println("index is : " +indx);

        // find out if it is empty
        boolean empty = myList.isEmpty();
        System.out.println(empty);

        // remove something from it
        myList.remove(s);
    }
}
