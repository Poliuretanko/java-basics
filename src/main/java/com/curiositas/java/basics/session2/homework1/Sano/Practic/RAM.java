package com.curiositas.java.basics.session2.homework1.Sano.Practic;

public class RAM implements Parts {

        int MAX_TIMES_OF_WORKING = 20;
        int MAX_TIMES_OF_BREAKS = 45;


        public String Working(boolean isWorking) {if (isWorking) {return "RAM is Works";} else {return "OFF";}}

        public String Plugged(boolean isPlugged) {if (isPlugged) {return "RAM is Plugged";} else {return "Unplugged";}}
        @Override
        public String Breaks(boolean isBreaks) {if (isBreaks){return "RAM is Broken";} else {return "CPU is broken";}}
}
