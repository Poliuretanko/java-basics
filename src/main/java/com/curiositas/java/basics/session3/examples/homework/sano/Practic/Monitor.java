package com.curiositas.java.basics.session3.examples.homework.sano.Practic;

public class Monitor implements Parts {

    boolean isPlugged = false;


    public String Working(boolean isWorking) {
        if (isWorking) {
            return "Monitor is Works";
        } else {
            return "OFF";
        }
    }

    public String Plugged(boolean isPlugged) {
        this.isPlugged = isPlugged;
        if (isPlugged) {
            return "Monitor is Plugged";
        } else {
            return "Unplugged";
        }
    }

    public boolean isPlugged() {
        return isPlugged;
    }

    @Override
    public String Breaks(boolean isBreaks) {
        if (isBreaks) {
            return "Monitor is Broken";
        } else {
            return "Monitor is broken";
        }
    }
}
