package com.udemy.primitive_datatype_and_alternatives.big_decimal.character_datatype;

public class MyCharMain {

    public static void main(String[] args) {
        MyChar mychar = new MyChar('2');
        System.out.println("Is Vowel : " +mychar.isVowel());
        System.out.println("Is Consonant : " + mychar.isConsonant());
        System.out.println("Is Alphabet : " + mychar.isAlphabet());
        System.out.println("Is Digit : " + mychar.isDigit());
        mychar.printUpperCaseAlphabets();
        mychar.printLowerCaseAlphabets();
        char s = 'A';

    }
}
