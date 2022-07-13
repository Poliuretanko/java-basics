package com.curiositas.java.basics.session2.examples;

import com.curiositas.java.basics.session2.examples.classes.timesofday.TimeOfDay;

public class Step8_2TimeOfDay {
    public static void main(String[] args) {
        writeGreetingsOnTheDifferentTimesOfDay();
    }

    private static void writeGreetingsOnTheDifferentTimesOfDay() {
        for (var timeOfDay : TimeOfDay.values()) {
            System.out.println(timeOfDay.getGreeting());
        }
    }
}
