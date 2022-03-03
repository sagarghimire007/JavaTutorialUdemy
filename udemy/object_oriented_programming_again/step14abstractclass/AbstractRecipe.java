package com.udemy.object_oriented_programming_again.step14abstractclass;

public abstract class AbstractRecipe {
    // all the three steps are mandatory so used in abstract class

    public void execute() {
        getReady();
        doTheDish();
        cleanUp();
    }

    abstract void getReady();

    abstract void doTheDish();

    abstract void cleanUp();
    //prepare
    // recipe
    //cleanup

}
