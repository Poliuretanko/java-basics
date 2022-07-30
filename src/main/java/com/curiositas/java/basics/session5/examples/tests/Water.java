package com.curiositas.java.basics.session5.examples.tests;

public class Water {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public StateOfAggregation getState() {
        if (temperature <= 0) {
            return StateOfAggregation.ice;
        }
        if (temperature <= 100) {
            return StateOfAggregation.liquid;
        }
        return StateOfAggregation.steam;
    }

    public enum StateOfAggregation {
        ice,
        liquid,
        steam
    }
}
