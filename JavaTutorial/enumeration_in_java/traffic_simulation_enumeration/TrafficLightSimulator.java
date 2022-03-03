package com.JavaTutorial.enumeration_in_java.traffic_simulation_enumeration;

enum TrafficLightColor {
    RED, GREEN, YELLOW
}

// A computerized traffic light.
public class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc; // holds traffic light color
    private boolean stop = false; // set to true to stop the simulation
    private boolean changed = false; // true when the light has changed

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
    }

    //start up the light
    @Override
    public void run() {
        while (!stop) {
            try {
                switch (tlc) {
                    case GREEN: {
                        Thread.sleep(10000); // sleeps for 10 second
                        break;
                    }
                    case YELLOW: {
                        Thread.sleep(4000); // sleeps for 2 second
                        break;
                    }
                    case RED: {
                        Thread.sleep(12000); // sleeps for 12 second
                        break;
                    }
                }
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            changeColor();
        }
    }

    // change color
    synchronized void changeColor() {
        switch (tlc) {
            case RED: {
                tlc = TrafficLightColor.YELLOW;
                break;
            }
            case YELLOW: {
                tlc = TrafficLightColor.GREEN;
                break;
            }
            case GREEN: {
                tlc = TrafficLightColor.RED;
                break;
            }
        }
        changed = true;
        notify(); // signal that the light has changed
    }

    // wait until a light change occurs
    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait(); // wait for the light to change
            }
            changed = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // return current color
    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    // stop the traffic light
    synchronized void cancel() {
        stop = true;
    }
}
