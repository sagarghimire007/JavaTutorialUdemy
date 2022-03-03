package com.JavaTutorial.generics_in_java.generic_question_3;

class GenericFlight<T, V> {
    private T flightName;
    private V flightShift;

    GenericFlight(T ob1 , V ob2) {
        flightName = ob1;
        flightShift = ob2;
    }

    public T displayFlight() {
        return flightName;
    }

    public V displayShift() {
        return flightShift;
    }

}

public class FlightSchedule {
    public static void main(String[] args) {

        GenericFlight<String, String> obj = new GenericFlight<String, String>("USA" , "Morning");
        System.out.println("Flight Details : ");
        System.out.println(obj.displayFlight());
        System.out.println(obj.displayShift());
    }
}
