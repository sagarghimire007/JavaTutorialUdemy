package com.JavaTutorial.annotation_in__java.annotation_example_1;

public class SampleClass {

    @MyAnno(show = "Print Message", value = 10)
    void myMeth(int i , String str) {
        System.out.println(i + " " + str);
    }
}

