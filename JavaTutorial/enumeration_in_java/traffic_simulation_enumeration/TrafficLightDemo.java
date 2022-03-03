package com.JavaTutorial.enumeration_in_java.traffic_simulation_enumeration;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.RED);
        Thread thrd = new Thread(t1);
        thrd.start();

        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
