package com.curiositas.java.basics.session5.examples.tests;

public class ConfigurableGreeter {

    private final DayTime dayTime;
    private final Output output;

    public ConfigurableGreeter(DayTime dayTime, Output output) {
        this.dayTime = dayTime;
        this.output = output;
    }

    public void greet(String name) {
        // Here we prepare an input for our logic
        int currentHour = dayTime.getCurrentHour();
        // Here we call the business logic
        String greetMessage;
        if (currentHour > 5 && currentHour <= 11) {
            greetMessage = "Good morning " + name;
        } else if (currentHour > 11 && currentHour <= 18) {
            greetMessage = "Good afternoon " + name;
        } else if (currentHour > 18 && currentHour <= 22) {
            greetMessage = "Good evening " + name;
        } else {
            greetMessage = "Good night " + name;
        }
        // Here we output results
        output.write(greetMessage);
    }
}
