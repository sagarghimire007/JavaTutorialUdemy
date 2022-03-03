package com.JavaTutorial.annotation_in__java.annotation_example_2;

@Deprecated
class MyClass {
    private String msg;

    MyClass(String m) {
        msg = m;
    }

    //deprecate a method within a class
    @Deprecated
    String getMsg() {
        return msg;
    }
}

public class AnnoDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass("test");
        System.out.println(obj.getMsg());
    }
}
