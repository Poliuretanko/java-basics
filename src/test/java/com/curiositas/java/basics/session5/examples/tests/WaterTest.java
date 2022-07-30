package com.curiositas.java.basics.session5.examples.tests;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.curiositas.java.basics.session5.examples.tests.Water.StateOfAggregation.*;
import static org.junit.Assert.assertEquals;

public class WaterTest {

    //One test - one case
    @Test
    public void testWaterIsIce() {
        var water = new Water();
        water.setTemperature(-50);
        var state = water.getState();
        assertEquals(ice, state);
    }

    @Test
    public void testWaterIsLiquid() {
        var water = new Water();
        water.setTemperature(50);
        var state = water.getState();
        assertEquals(liquid, state);
    }

    @Test
    public void testWaterIsSteam() {
        var water = new Water();
        water.setTemperature(150);
        var state = water.getState();
        assertEquals(steam, state);
    }

    @Test
    public void testWaterIsIceOnMinusOneGrad() {
        var water = new Water();
        water.setTemperature(-1);
        var state = water.getState();
        assertEquals(ice, state);
    }

    @Test
    public void testWaterIsIceOnZeroGrad() {
        var water = new Water();
        water.setTemperature(0);
        var state = water.getState();
        assertEquals(ice, state);
    }

    //One test - a lot of cases
    @Test
    public void testWaterStates() {
        var water = new Water();
        int[] temperatures = {-50, -1, 0, 1, 50, 99, 100, 101, 150};
        Water.StateOfAggregation[] expectedStates = {ice, ice, ice, liquid, liquid, liquid, liquid, steam, steam};

        for (int i = 0; i < temperatures.length; i++) {
            var temperature = temperatures[i];
            var expectedState = expectedStates[i];
            water.setTemperature(temperature);
            var state = water.getState();
            assertEquals(expectedState, state);
        }
    }

    @Test
    public void testWaterStatesFail() {
        var water = new Water();
        int[] temperatures = {-50, -1, 0, 1, 50, 99, 100, 101, 150};
        Water.StateOfAggregation[] expectedStates = {ice, ice, ice, liquid, liquid, liquid, steam, steam, steam};

        for (int i = 0; i < temperatures.length; i++) {
            var temperature = temperatures[i];
            var expectedState = expectedStates[i];
            water.setTemperature(temperature);
            var state = water.getState();
            assertEquals(expectedState, state);
        }
    }


    public static Stream<Arguments> dataWaterState() {
        return Stream.of(
                Arguments.of(-50, ice),
                Arguments.of(-1, ice),
                Arguments.of(0, ice),
                Arguments.of(1, liquid),
                Arguments.of(50, liquid),
                Arguments.of(99, liquid),
                Arguments.of(100, liquid),
                Arguments.of(101, steam),
                Arguments.of(150, steam)
        );
    }

    @ParameterizedTest
    @MethodSource("dataWaterState")
    public void testWaterState(int temperature, Water.StateOfAggregation expectedState) {
        var water = new Water();
        water.setTemperature(temperature);
        var state = water.getState();
        assertEquals(expectedState, state);
    }



    public static Stream<Arguments> dataWaterStateFail() {
        return Stream.of(
                Arguments.of(-50, ice),
                Arguments.of(-1, ice),
                Arguments.of(0, ice),
                Arguments.of(1, liquid),
                Arguments.of(50, liquid),
                Arguments.of(99, liquid),
                Arguments.of(100, steam),
                Arguments.of(101, steam),
                Arguments.of(150, steam)
        );
    }

    @ParameterizedTest
    @MethodSource("dataWaterStateFail")
    public void testWaterStateFail(int temperature, Water.StateOfAggregation expectedState) {
        Water water = new Water();
        water.setTemperature(temperature);
        Water.StateOfAggregation state = water.getState();
        assertEquals(expectedState, state);
    }

}
