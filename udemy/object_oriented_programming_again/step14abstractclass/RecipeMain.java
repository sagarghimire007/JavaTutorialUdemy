package com.udemy.object_oriented_programming_again.step14abstractclass;

public class RecipeMain {
    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        recipe.execute();
        System.out.println();
        MicrowaveRecipe microwaveRecipe = new MicrowaveRecipe();
        microwaveRecipe.execute();
    }
}
