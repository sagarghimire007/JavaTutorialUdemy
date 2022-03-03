package com.udemy.object_oriented_programming_again.step16javainterface;

public class ChessGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Move Upward");
    }

    @Override
    public void down() {
        System.out.println("Move Downward");
    }

    @Override
    public void left() {
        System.out.println("Move left");
    }

    @Override
    public void right() {
        System.out.println("Move Right");
    }
}
