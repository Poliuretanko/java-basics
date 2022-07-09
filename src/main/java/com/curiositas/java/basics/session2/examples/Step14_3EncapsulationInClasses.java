package com.curiositas.java.basics.session2.examples;

import com.curiositas.java.basics.session2.examples.encapsulation.*;

public class Step14_3EncapsulationInClasses {
    public static void main(String[] args) {
        Output output = new OutputToConsole();
        Input input = new InputFromConsole();

        output.write("Input your name");
        var userName = input.read();

        output.write("Input the current hour");

        String currentHourAsString = input.read();
        var currentHour = Integer.parseInt(currentHourAsString);

        GreetingMessagePreparer greetingMessagePreparer = new GreetingMessagePreparer(userName, currentHour);
        var greeting = greetingMessagePreparer.getGreetingMessage();
        output.write(greeting);
    }
}
