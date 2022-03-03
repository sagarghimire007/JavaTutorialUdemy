package com.udemy.introduction_to_object_oriented_programming;

public class BookMain {

    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book(200);
        Book effectiveJava = new Book(100);
        Book cleanCode = new Book(50);

//        artOfComputerProgramming.setNoOfCopies(100);
//        artOfComputerProgramming.increaseNoOfCopies(100);
//        artOfComputerProgramming.decreaseNoOfCopies(200);
        System.out.println("No of Copies of Art Of Computer Programming : " + artOfComputerProgramming.getNoOfCopies());

//        effectiveJava.setNoOfCopies(50);
//        effectiveJava.increaseNoOfCopies(100);
//        effectiveJava.decreaseNoOfCopies(200);
        System.out.println("No of Copies of Effective Java : " + effectiveJava.getNoOfCopies());

//        cleanCode.setNoOfCopies(45);
//        cleanCode.increaseNoOfCopies(100);
//        cleanCode.decreaseNoOfCopies(200 );
        System.out.println("No Of Copies of Clean Code : " + cleanCode.getNoOfCopies());
    }
}
