package com.udemy.loops_in_java;

public class WhileNumberPlayer {
    private int limit;

    public WhileNumberPlayer(int limit) {
        this.limit = limit;
    }

    public void printSquareUptoLimit(){
        int i = 1;
        while(i * i < limit){
            System.out.println(i * i + " ");
            i++;
        }
        System.out.println();
    }

    public void printCubesUptoLimit(){
        int i = 1;
        while(i * i * i < limit){
            System.out.println(i * i * i+ " ");
            i++;
        }
        System.out.println();
    }
}
