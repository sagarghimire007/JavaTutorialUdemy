package com.headfirstjava.collections_in_java.mountain_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mountain {
    String name;
    int height;

    Mountain(String name , int height) {
        this.name = name;
        this.height = height;
    }

    public String toString() {
        return name + " : " + height;
    }

}

public class TestSort5 {

    static class HeightCompare implements Comparator<Mountain> {

        @Override
        public int compare(Mountain mountain1 , Mountain mountain2) {
            return mountain2.height - mountain1.height;
        }
    }

    public static void main(String[] args) {

        ArrayList<Mountain> mountains = new ArrayList<Mountain>();
        HeightCompare hc = new HeightCompare();

        mountains.add(new Mountain("Sagarmatha" , 8848));
        mountains.add(new Mountain("Lotse" , 8840));
        mountains.add(new Mountain("Mansalu" , 8800));
        mountains.add(new Mountain("Makalu" , 8830));
        mountains.add(new Mountain("Ganesh" , 8400));

        System.out.println("By Height :");
        Collections.sort(mountains , hc);
        System.out.println(mountains);


    }
}
