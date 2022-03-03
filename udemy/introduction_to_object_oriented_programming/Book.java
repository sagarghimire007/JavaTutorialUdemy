package com.udemy.introduction_to_object_oriented_programming;

public class Book {
    // state
    private int noOfCopies;

    public Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        if(noOfCopies > 0)
        this.noOfCopies = noOfCopies;
    }

    public void increaseNoOfCopies(int howMuch){
        this.noOfCopies = noOfCopies;
    }

    public void decreaseNoOfCopies(int  howMuch){
        setNoOfCopies(this.noOfCopies - howMuch);
    }
}
