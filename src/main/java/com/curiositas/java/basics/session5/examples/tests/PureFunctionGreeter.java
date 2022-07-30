package com.curiositas.java.basics.session5.examples.tests;

public class PureFunctionGreeter {
    public String greet(String name, int currentHour) {
        if (currentHour > 5 && currentHour <= 11) {
            return "Good morning " + name;
        }
        if (currentHour > 11 && currentHour <= 18) {
            return "Good afternoon " + name;
        }
        if (currentHour > 18 && currentHour <= 22) {
            return "Good evening " + name;
        }
        return "Good night " + name;
    }
}
