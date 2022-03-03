package com.balaguruswamy.threads_in_java.pyramid_using_thread;

public class Pyramid {

    synchronized void drawPyramid(char ch) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 5 - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = (2 * i) - 1; j > 0; j--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
