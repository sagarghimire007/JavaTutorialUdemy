package com.headfirstjava.innerclassinjava;

public class JavaStaticClassExample {
       static String name = "Sagar Ghimire";

      class StaticNestedClass{

        public void display(){
            JavaStaticClassExample a = new JavaStaticClassExample();
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
          JavaStaticClassExample a = new JavaStaticClassExample();
          JavaStaticClassExample.StaticNestedClass b = a.new StaticNestedClass();
          b.display();

    }
}
