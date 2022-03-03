package com.JavaTutorial.annotation_in__java.annotation_example_1;

// annotation can have only method and no body

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String show();

    int value();
}
