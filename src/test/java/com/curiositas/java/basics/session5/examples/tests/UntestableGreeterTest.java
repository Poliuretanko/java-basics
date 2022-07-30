package com.curiositas.java.basics.session5.examples.tests;

import org.junit.jupiter.api.Test;

class UntestableGreeterTest {

    @Test
    void testGreet() {
        UntestableGreeter greeter = new UntestableGreeter();
        greeter.greet("John");
    }
}