package com.headfirstjava;

import com.sun.security.jgss.GSSUtil;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"Java", "PHP",".NET", "Python", "Ruby"};
        String[] wordListTwo = {"best", "worst", "better", "good"};
        String[] wordListThree = {"developer", "programmer", "student", "teacher"};

        //find the length of an these array
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // finding random value
        int rand1 = (int)Math.random() * oneLength;
        int rand2 = (int)Math.random() * twoLength;
        int rand3 = (int)Math.random() * threeLength;

        System.out.println(rand1+" "+rand2+" "+rand3);

        //build a new phrase
        String phrase = wordListOne[rand1]+ " is "+ wordListTwo[rand2]+  " for "+wordListThree[rand3];
        System.out.println(phrase);
    }
}
