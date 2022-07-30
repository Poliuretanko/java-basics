package com.curiositas.java.basics.session5.examples.tests;

import java.util.Random;

public class DayTime {
    private final Random random = new Random();

    public static DayTime getInstance() {
        return new DayTime();
    }

    public int getCurrentHour() {
        return random.nextInt(0,23);
    }

    public static int getCurrentHourStatic() {
        return getInstance().getCurrentHour();
    }
}
