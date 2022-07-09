package com.curiositas.java.basics.session2.examples.encapsulation;

public class GreetingMessagePreparer {
    private final String name;
    private final int hour;

    public GreetingMessagePreparer(String name, int hour) {
        this.name = name;
        this.hour = hour;
    }

    public String getGreetingMessage() {
        var timeOfDay = TimeOfDay.get(hour);
        var wish = timeOfDay.getWish();
        return wish + ", " + name;
    }
}
