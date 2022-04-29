package com.company.ZaawJavaSDA.ZaawEnumZad1;

public class Main {
    public static void main(String[] args) {

        System.out.println(Weekday.SATURDAY.isHoliday());
        System.out.println((Weekday.FRIDAY.isHoliday()));
        System.out.println("Monday is holiday: " + Weekday.MONDAY.isHoliday());
        System.out.println("Sunday is weekday: " + Weekday.SUNDAY.isWeekDay());
        System.out.println("Saturday is holiday: " + Weekday.SATURDAY.isHoliday());
        System.out.println("1------------");
        System.out.println(Weekday.TUESDAY.isWeekDay());
        Weekday.TUESDAY.wchichIsGreter(Weekday.FRIDAY);





    }
}
