package com.balaguruswamy.package_in_java.import_circle_package;

import com.balaguruswamy.package_in_java.circle.NewCircle;

public class ImportClass extends NewCircle {
    public static void main(String[] args) {
        ImportClass im = new ImportClass();
        System.out.println(im.a);
        NewCircle n = new NewCircle();
        n.draw();
        System.out.println("Hello World");
    }
}
