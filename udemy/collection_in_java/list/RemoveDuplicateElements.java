package com.udemy.collection_in_java.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {

        // 1. using LinkedHashSet

        List<Integer> list = new ArrayList<Integer>(List.of(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 5 , 6 , 7 , 8 , 9));
        LinkedHashSet<Integer> listWithoutDuplicate = new LinkedHashSet<Integer>(list);
        System.out.println(listWithoutDuplicate);

        //2. JDK Stream (Removes duplication element in the list)

        List<Integer> marksList = new ArrayList<Integer>(List.of(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 5 , 6 , 7 , 8 , 9));
        List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
        System.out.println(marksListUnique);
    }
}
