package com.udemy.loops_in_java;

public class BreakAndContinueInJava {
    public static void main(String[] args) {
        String name = "Sagar";
        for(int i = 0; i < name.length(); i++){
            if(i == 1){
                continue;
            }else{
                System.out.print(name.charAt(i));
            }
        }
    }
}
