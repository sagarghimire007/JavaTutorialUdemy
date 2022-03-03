package com.JavaTutorial.annotation_in__java.annotation_example_1;

import java.lang.annotation.Annotation;

public class SampleMain {
    public static void main(String[] args) {
        SampleClass sc = new SampleClass();

        Class<?> c = sc.getClass();
        Annotation annoClass = c.getAnnotation(MyAnno.class);
        System.out.println(annoClass);
    }
}
