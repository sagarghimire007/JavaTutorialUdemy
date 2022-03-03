package com.headfirstjava.datemanipulation;

import javax.sound.midi.Soundbank;
import java.util.Calendar;
import java.util.Date;

import static java.lang.System.out;

public class FullMoon {
    static int DAY_IM = 18615 * 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
           Calendar cal = Calendar.getInstance();
////        cal.set(2004,0,7,15,40);
           long timeMilli2 = cal.getTimeInMillis();
//
//        out.println(day1);
//        out.println(DAY_IM);
//        for(int i = 0 ; i < 60; i++){
//            day1 += (DAY_IM * 29.52);
//            cal.setTimeInMillis(day1);
//            out.println(String.format((i+1)+". " +"Full moon %tc" ,cal));
//        }

        Date date = new Date();
        long timeMilli = date.getTime();
        out.println(date.getTime());
        out.println("Time in milliseconds using Date Class : " + timeMilli);
        out.println("Time in milliseconds using Calendar Class : " + timeMilli2);
    }
}
