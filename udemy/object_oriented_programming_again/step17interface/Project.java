package com.udemy.object_oriented_programming_again.step17interface;

public class Project {
    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new DummyAlgorithm();
        System.out.println(algorithm.complexAlgorithm(10 , 20));
    }
}
