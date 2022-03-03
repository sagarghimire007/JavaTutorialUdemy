package com.headfirstjava.numberformatting;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatting {
    public static void main(String[] args) {

        int d = DateFormat.display();
        System.out.println("d : " + d);
        Date today = new Date();
        Calendar cal = Calendar.getInstance();

//        cal.set(2004,0,7,15,40);
//        System.out.println(cal);
        System.out.println(cal.getTime());
        Date dateTime = cal.getTime();

        long day1  = cal.getTimeInMillis();
        System.out.println("Time in millisecond : " + day1);
        cal.setTimeInMillis(day1);
        System.out.println(cal.getTimeInMillis());

//        System.out.println(cal.get(cal.HOUR_OF_DAY));
//        cal.add(cal.DATE, 45);
//        System.out.println(cal.getTime());
//        cal.roll(cal.DATE , 35);

//        System.out.println(cal.get(cal.DAY_OF_MONTH));
//        System.out.println(String.format("%tr", today));
//
//        System.out.println(String.format("%tA, %<tB %<td", today))   ;
    }
}
