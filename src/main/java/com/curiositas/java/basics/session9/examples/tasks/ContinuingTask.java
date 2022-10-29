package com.curiositas.java.basics.session9.examples.tasks;

import java.util.Random;

public class ContinuingTask extends Task {

    private static final Random random = new Random();
    private int temperature = 25;

    @Override
    public void run() {
        while (true) {
            doTask();
        }
    }

    protected void doTask() {
        if (temperature <= -5) {
            temperature = temperature + random.nextInt(2);
        } else if (temperature > 25) {
            temperature = temperature - random.nextInt(2);
        } else {
            temperature = temperature + random.nextInt(5) - 2;
        }

        System.out.println("Today's temperature = " + temperature + " C");
    }

}
