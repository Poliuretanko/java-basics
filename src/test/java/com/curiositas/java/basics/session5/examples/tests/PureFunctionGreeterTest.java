package com.curiositas.java.basics.session5.examples.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PureFunctionGreeterTest {

    public static Stream<Arguments> dataGreet() {
        return Stream.of(
                Arguments.of(12, "Good afternoon John", "John"),
                Arguments.of(19, "Good evening John", "John"),
                Arguments.of(5, "Good night Mary", "Mary")
        );
    }

    @ParameterizedTest
    @MethodSource("dataGreet")
    void testGreet(Integer currentHour, String expectedMessage, String name) {
        PureFunctionGreeter greeter = new PureFunctionGreeter();
        String greetingMessage = greeter.greet(name, currentHour);
        assertEquals(expectedMessage, greetingMessage);
    }
}