package com.udemy.object_oriented_programming_again.step16javainterface;

public class MarioGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Goes into the hole");
    }

    @Override
    public void left() {

    }

    @Override
    public void right() {
        System.out.println("Goes forward");
    }
}
