package com.curiositas.java.basics.session5.examples.tests;

import java.util.Random;

public class PrecipitationForecast {

    private final Random random = new Random();

    public int getRainProbability() {
        return random.nextInt(100);
    }
}
