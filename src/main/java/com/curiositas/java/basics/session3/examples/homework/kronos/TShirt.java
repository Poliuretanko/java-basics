package com.curiositas.java.basics.session3.examples.homework.kronos;

public class TShirt implements Clothes{
    long MAX_TIMES_OF_WEARING = 2;
    long MAX_TIMES_BEFORE_UTILIZATION = 20;
    public String Dressed(boolean isDressed) {
        if (isDressed) {return "TShirt is Put On";} else {return "TShirt is Unused";}
    }
    public String Cleaned(boolean isCleaned) {
        if (isCleaned) {return "TShirt is Fresh";} else {return "TShirt is Dirty";}
    }
    @Override
    public String Utilized(boolean isUtilized) {
        if (isUtilized) {return "Utilized";} else {return "Kept";}
    }

}
