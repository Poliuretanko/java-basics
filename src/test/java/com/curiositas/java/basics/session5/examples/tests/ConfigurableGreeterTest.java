package com.curiositas.java.basics.session5.examples.tests;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ConfigurableGreeterTest {

    @Test
    void testGreet() {
        DayTime dayTime = mock(DayTime.class);
        when(dayTime.getCurrentHour()).thenReturn(12);

        Output output = mock(Output.class);

        ConfigurableGreeter greeter = new ConfigurableGreeter(dayTime, output);
        greeter.greet("John");

        verify(output, times(1)).write("Good afternoon John");
    }

    @Test
    void testGreetFail() {
        DayTime dayTime = mock(DayTime.class);
        when(dayTime.getCurrentHour()).thenReturn(12);

        Output output = mock(Output.class);

        ConfigurableGreeter greeter = new ConfigurableGreeter(dayTime, output);
        greeter.greet("John");

        verify(output, times(1)).write("Good morning John");
    }
}