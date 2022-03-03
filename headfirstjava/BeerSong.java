package com.headfirstjava;

public class BeerSong {
    public static void main(String[] args) {
        //beerCountA(5);
       // beerCountB(3);
        beerCountC(3);
        // beerCountB(5);
    } // end main method

    public static void beerCountA(int beerNum) {

        while (beerNum > 1) {
            printBeerSong(beerNum, "bottles");
            beerNum = beerNum - 1;
        } // end while loop

        printBeerSong(beerNum, "bottle");

//        while (beerNum > 0){
//            if(beerNum == 1){
//                printBeerSong(beerNum, "bottle");
//            }
//            beerNum = beerNum - 1;
//        }

        System.out.println("No more bottles of beer on the wall");

    }

    public static void beerCountB(int beerNum) {
        String word = "bottles";
        while (beerNum >= 0) {
            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println(beerNum + " " + word + " of beer.");
                System.out.println("Take one down.");
                System.out.println("Pass it around.");


            } else {
                System.out.println("No more bottles of beer on the wall");
            } // end else
            beerNum = beerNum - 1;
        } // end while loop
    }

    public static void printBeerSong(int beerNum, String word) {
        System.out.println(beerNum + " " + word + " of beer on the wall");
        System.out.println(beerNum + " " + word + " of beer.");
        System.out.println("Take one down.");
        System.out.println("Pass it around.");
    }

    public static void beerCountC(int beerNum){
        String word = "bottles";
        while (beerNum >= 0) {
            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }
            printBeerSong(beerNum, word);
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } // end else
            beerNum = beerNum - 1;
        } // end while loop
    }
}
