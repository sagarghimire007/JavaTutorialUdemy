package com.javaEdureka.constructor_in_java.calculator;

// constructor are special method that has no return type and must have same as class name
// it is to initialize the instance variable of the object
// default constructor = no parameters
// parameterized constructor = with parameters


public class Calculator {
    int insatanceVariable;

    Calculator() {
        insatanceVariable = 100;
    }

    Calculator(int a) {
        insatanceVariable = a;
    }

}
