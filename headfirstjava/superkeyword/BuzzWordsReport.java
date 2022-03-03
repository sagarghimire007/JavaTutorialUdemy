package com.headfirstjava.superkeyword;

public class BuzzWordsReport extends Report{

   public void runReport(){ // overrides the superclass method
        super.runReport(); // invokes the superclass method within a subclass
        printReprt();
    }

    void printReprt(){
        System.out.println("Buzzwords Report Printing");
    }

    public static void main(String[] args) {
        BuzzWordsReport br = new BuzzWordsReport();
        br.runReport();
    }
}
