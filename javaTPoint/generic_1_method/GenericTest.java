package com.javaTPoint.generic_1_method;

import java.util.List;

public class GenericTest {
    public void drawShape(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();
        }
    }
}
