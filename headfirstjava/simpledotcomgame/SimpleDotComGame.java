package com.headfirstjava.simpledotcomgame;

import java.util.ArrayList;

public class SimpleDotComGame {
    private ArrayList<Integer> location;

    public void setLocation(ArrayList<Integer> location) {
        this.location = location;
    }

    public boolean checkYourself(int stringGuess) {
        String result = "miss";
//        if (location.isEmpty()) { // returns true if the array list is empty
//            result = "kill";
//        }
        int index = location.indexOf(stringGuess); // gives the index of the element if exists else gives -1
        if (index >= 0) {
            location.remove(index); // removing the element if it is in the array list

            if (location.isEmpty()) { // returns true if the array list is empty
                result = "kill";
            } else {
                result = "hit";
            }
        }
        System.out.println(result);
        return result.equals("kill");
    }
}

