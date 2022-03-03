package com.headfirstjava.objectasparameter;

public class TutorialBook {
    int height;
    int width;

    TutorialBook(int height, int width){
        this.height = height;
        this.width = width;
    }

    TutorialBook(TutorialBook t){
        this.height = t.height;
        this.width = t.width;
    }

    void display(){
        System.out.println("Height : " + height + " , Width : " +width);
    }

    boolean isEqual(TutorialBook t){
        if(this.height == t.height && this.width == t.width) {
            return true;
        }
        return false;
    }

    TutorialBook duplicate(){
        TutorialBook temp = new TutorialBook(this);
        return temp;
    }
}
