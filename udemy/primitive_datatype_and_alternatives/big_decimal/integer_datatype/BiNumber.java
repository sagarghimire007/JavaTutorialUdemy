package com.udemy.primitive_datatype_and_alternatives.big_decimal.integer_datatype;

public class BiNumber {
    private int a;
    private int b;

    public BiNumber(int a , int b) {
        this.a = a ;
        this.b = b;
    }

    public int add(){
        return a + b;
    }

    public int multiply(){
        return (a * b);
    }

    public void doubleNumbers(){
        this.a *= 2;
        this.b *= 2;
    }

    public int getNumber1(){
        return this.a;
    }

    public int getNumber2(){
        return this.b;
    }
}
