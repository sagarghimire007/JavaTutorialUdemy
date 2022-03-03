package com.headfirstjava.araylist;

import com.headfirstjava.simpledotcomgame.GameHelper;
import java.util.ArrayList;
import java.util.List;

public class ThreeDotComGameMain {
    static int j = 0;

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> firstDotComList = new ArrayList<>();
        generateRandomNumber(firstDotComList);


        List<Integer> secondDotComList = new ArrayList<>();
        generateRandomNumber(secondDotComList);

        List<Integer> thirdDotComList = new ArrayList<>();
        generateRandomNumber(thirdDotComList);

        list.add(firstDotComList);
        list.add(secondDotComList);
        list.add(thirdDotComList);

        int numOfGuess = 0;

        GameHelper helper = new GameHelper();
        ThreeDotComGame theDotGame = new ThreeDotComGame();

        theDotGame.setLocation(list);
        Boolean isAlive = true;
        while(isAlive){
            int guess = helper.getUserInput(); // getting a user input
            isAlive = theDotGame.checkYourself(guess);
            numOfGuess++;
        }
        System.out.println("You Took "+ numOfGuess+ " guesses") ;
    }

    public static void generateRandomNumber(List<Integer> listNumber){
        int randomNumber = (int) Math.random() + (j+1);
        int i = 0;
        for(; i < 3; i++){
            listNumber.add(randomNumber + i);
            j = randomNumber + i;
        }
    }
}
