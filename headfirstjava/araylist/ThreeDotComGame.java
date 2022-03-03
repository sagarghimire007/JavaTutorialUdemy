package com.headfirstjava.araylist;

import java.util.*;


public class ThreeDotComGame {
    int numOfHits;
    private List<List<Integer>> location;

    private Set<Integer> emptyDotComSet = new HashSet<>();

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }
    boolean isAllKilled = false;

//    removedAfterKilled.add(0);
//    removedAfterKilled.add(0);
//    removedAfterKilled.add(0);

    public boolean checkYourself(int guess) {

        String result = "miss";
//        if (location.isEmpty()) { // returns true if the array list is empty
//            result = "kill";
//        }
        int index = -1;
        int listIndex = -1;
        int i = 0;
        for(; i < location.size(); i++) {
            List<Integer> list = location.get(i);
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).equals(Integer.valueOf(guess))) {
                    listIndex = i;
                    index = j;
                    break;
                }
            }
        }

        if(listIndex >= 0 && index >= 0) {
                location.get(listIndex).remove(index);
                result = "hit " + (listIndex) + " .com";
        }

        for(int  k = 0; k < location.size(); k++) {
            if(location.get(k).isEmpty()) {
                if(!emptyDotComSet.contains(k)){
                    result = "kill " + (k) + " .com";
                    emptyDotComSet.add(k);
                }
            }
        }
        System.out.println(result);
        return location.size() != emptyDotComSet.size();
    }
}
