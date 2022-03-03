package com.headfirstjava.araylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("Sagar");
        name.add("Ghimire");
        name.add("Sagar Ghimire");
        name.add("Nissan");
        name.add("Nissan GC");
        name.add("Nabin") ;
        name.add("Nabin Ghimire");
        for(int i = 0 ; i < name.size(); i++){
            if(name.get(i).contains(" ")){
                name.remove(i);
            }
        }
        System.out.println(name);
//
//        ArrayList<String> name = new ArrayList<>();
//
//        name.add("Sagar");
//        name.add("Nissan");
//        name.add("Anupama");
//        name.add("Nabin");
//
//        name.remove("Sagar"); // removes the object from the list
//        System.out.println(name.size());
//
//        System.out.println("Is List Empty : "+name.isEmpty());
//
//        System.out.println(name.contains("Nabin"));
//        System.out.println(name.indexOf("Nabin"));
//        System.out.println(name.get(2));
//        for(int i = 0; i < name.size(); i++){
//            System.out.println(name);
//        }
    }

    private static void printAL(ArrayList<String> a) {
        for(String element : a){
            System.out.print(element + " ");
        }
    }
}
