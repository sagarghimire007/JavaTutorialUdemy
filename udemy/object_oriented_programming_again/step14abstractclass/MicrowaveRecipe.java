package com.udemy.object_oriented_programming_again.step14abstractclass;

public class MicrowaveRecipe extends AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("Get the stuff ready");
        System.out.println("Put it in the microwave");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean up the Utensils");
        System.out.println("Switch off the microwave");
    }
}
