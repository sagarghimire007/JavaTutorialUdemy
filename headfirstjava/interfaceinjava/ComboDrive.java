package com.headfirstjava.interfaceinjava;

public class ComboDrive implements CDBurner,DVDBurner{

    public static void main(String[] args) {
        ComboDrive c = new ComboDrive();
        c.burn();
    }

    @Override
    public void burn() {
        CDBurner cd = new CDBurner() {
            @Override
            public void burn() {
                System.out.println("CD Burner");
            }
        };

        DVDBurner d = new DVDBurner() {
            @Override
            public void burn() {
                System.out.println("DVD Burner");
            }
        };
    }
}
