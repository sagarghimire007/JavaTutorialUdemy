package com.headfirstjava.simpledotcomgame;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleDotComGameMain {
    public static void main(String[] args) {
        int numOfGuess = 0;

        GameHelper helper = new GameHelper();
        SimpleDotComGame theDotGame = new SimpleDotComGame();

//        int random = (int) Math.random() + 4; // generating a random number;
        int random =  4;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(random);
        list.add(random + 1);
        list.add(random + 2);
        //int[] location = {random, random + 1, random + 2}; // incrementing a random number by 1
        theDotGame.setLocation(list);
        boolean isAlive = true;

        while(isAlive){
            int guess = helper.getUserInput(); // getting a user input
            isAlive = theDotGame.checkYourself(guess);
            numOfGuess++;
        }
        System.out.println("You Took "+ numOfGuess+ " guesses") ;
    }

}

