package com.curiositas.java.basics.session4.examples.exceptions;

public class IncorrectDateException extends IllegalStateException {
    public IncorrectDateException(String message, Throwable cause) {
        super(message, cause);
    }
}
