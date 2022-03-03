package com.headfirstjava.collections_in_java.array_list.adding_array_list_elements;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("sagar");
        list.add("ghimire");
        list.add("sagar");
        list.add("nissan");

        // printing duplicate values
        System.out.println(list);

        // removing duplicates in the list
        Set<String> stringList = new LinkedHashSet<String>(list);
        System.out.println(stringList);
    }
}
