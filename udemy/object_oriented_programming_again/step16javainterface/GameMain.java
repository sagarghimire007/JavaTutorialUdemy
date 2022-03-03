package com.udemy.object_oriented_programming_again.step16javainterface;

public class GameMain {
    public static void main(String[] args) {
        GamingConsole game = new MarioGame();
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
