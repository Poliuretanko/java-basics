package com.curiositas.java.basics.session2.examples.classes.timesofday;

public enum TimeOfDay {
    MORNING("Good morning!"),
    AFTERNOON("Good afternoon!"),
    EVENING("Good evening!"),
    NIGHT("Good night!");

    private final String greeting;

    TimeOfDay(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }
}
