package com.udemy.primitive_datatype_and_alternatives.big_decimal.character_datatype;

public class MyChar {

    private char ch;
    char[] character = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    MyChar(char ch){
        this.ch = ch;
    }
    // checking is given character vowel or not
    public boolean isVowel(){
        for(int i = 0; i < character.length; i++){
            if(ch == character[i]){
                return  true;
            }
        }
        return  false;
    }

    // checking is given character is alphabet or not
    public boolean isAlphabet(){
        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
            return  true;
        }
        return false;
    }

    // checking is given character is Consonant or not
    public boolean isConsonant(){
        if(!isVowel() && isAlphabet()){ // if the given character is not a vowel  and is a alphabet than it's a consonant
            return true;
        }
        return  false;
    }

    // checking is given character is a digit
    public boolean isDigit(){
         if(ch >= 47 && ch <= 58){
             return true;
         }
         return false;
    }

    // converting character into lower case
    public void printLowerCaseAlphabets(){
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(Character.toLowerCase(ch) + " ");
        }
    }

    // converting character into uppercase
    public void printUpperCaseAlphabets(){
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(Character.toUpperCase(ch) + " ");
        }
        System.out.println();
    }

}
