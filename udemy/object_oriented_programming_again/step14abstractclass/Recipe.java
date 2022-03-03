package com.udemy.object_oriented_programming_again.step14abstractclass;

public class Recipe extends AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("G et the raw materials");
        System.out.println("Get the utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("Do the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean up the Utensils");
    }
}
