package com.company.ZaawJavaSDA.ZaawEnumZad1;

public enum Weekday {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay(){
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday(){
        return this == SATURDAY || this == SUNDAY;
    }

    void wchichIsGreter (Weekday weekday){
        if(this.ordinal() < weekday.ordinal()){
            System.out.println("Before " + weekday);
        } else {
            System.out.println("After " + weekday);
        }
    }


}
