package com.curiositas.java.basics.session3.examples.homework.kronos;

public class Jeans implements Clothes {
    long MAX_TIMES_OF_WEARING = 5;
    long MAX_TIMES_BEFORE_UTILIZATION = 60;
    @Override
    public String Dressed(boolean isDressed) {if (isDressed) {return "Jeans is Put On";} else {return "Без штанов";}}
    @Override
    public String Cleaned(boolean isCleaned) {if (isCleaned) {return "Jeans is Fresh";} else {return "Jeans is Dirty";}}
    @Override
    public String Utilized(boolean isUtilized) {
        if (isUtilized) {return "Jeans is Utilized";} else {return "Jeans is Kept";}
    }

}
