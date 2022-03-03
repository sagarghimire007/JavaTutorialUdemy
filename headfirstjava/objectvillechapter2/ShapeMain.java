package com.headfirstjava.objectvillechapter2;

public class ShapeMain {
    public static void main(String[] args) {
        Shape t = new Triangle();
        t.rotateShape();
        t.playSound();

        Shape c = new Circle();
        c.rotateShape();
        c.playSound();

        Shape r = new Rectangle();
        r.rotateShape();
        r.playSound();

        Shape ab = new Amoeba();
        ab.rotateShape();
        ab.playSound();
    }
}
