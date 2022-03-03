package com.udemy.object_oriented_programming_again.step17interface;

public class DummyAlgorithm implements ComplexAlgorithm {
    @Override
    public int complexAlgorithm(int number1 , int number2) {
        return number1 + number2;
    }
}
