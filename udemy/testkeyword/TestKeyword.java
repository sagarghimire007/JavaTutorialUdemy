package com.udemy.testkeyword;
/*
6 usage of this keyword
1. refer to the instance variable of current class
 so whenever a instance variable and local variable have same name than to determine the instance variable we use
 this keyword.

2. this keyword is used to invoke a current class method

 */
public class TestKeyword {
    int a;

    TestKeyword(){}
    TestKeyword(int a){
        this.a = a; // used for determining instance variable of current class
    }
    public void displayResult(){
        System.out.println("a : "+a);
    }
     public void displayM(){
         System.out.println("Display M");
     }

     public void displayN(){
         System.out.println("Display N");
         this.displayM(); // invoking current class method
     }

}
