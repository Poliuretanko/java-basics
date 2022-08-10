package com.curiositas.java.basics.session3.examples.homework.sano.Practic;

public class Keyboard implements Parts {
    
    boolean isPlugged = false;


    public String Working(boolean isWorking) {
        if (isWorking) {
            return "Keyboard is Works";
        } else {
            return "OFF";
        }
    }

    public String Plugged(boolean isPlugged) {
        this.isPlugged = isPlugged;
        if (isPlugged) {
            return "Keyboard is Plugged";
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
            return "Keyboard is Broken";
        } else {
            return "Keyboard is broken";
        }
    }
}
