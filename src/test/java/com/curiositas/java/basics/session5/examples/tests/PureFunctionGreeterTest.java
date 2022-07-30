package com.curiositas.java.basics.session5.examples.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PureFunctionGreeterTest {

    @Test
    void testGreet() {
        PureFunctionGreeter greeter = new PureFunctionGreeter();
        String greetingMessage = greeter.greet("John", 12);
        assertEquals("Good afternoon John", greetingMessage);
    }
}