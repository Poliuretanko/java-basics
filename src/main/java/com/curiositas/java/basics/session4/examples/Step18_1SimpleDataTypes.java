package com.curiositas.java.basics.session4.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class Step18_1SimpleDataTypes {
    public static void main(String[] args) {
        showHowtoUseString();

        showMinimalAndMaximalNumbers();

        showWhichDatesAreExists();

        showBooleanOperators();
    }

    private static void showBooleanOperators() {
        Boolean booleanTrueVariable = true;
        Boolean booleanFalseVariable = false;
        boolean logicalOr = booleanTrueVariable || booleanFalseVariable;
        System.out.println("Logical or is " + logicalOr);
        boolean logicalAnd = booleanTrueVariable && booleanFalseVariable;
        System.out.println("Logical and is " + logicalAnd);
    }

    private static void showWhichDatesAreExists() {
        LocalDate localDateVariable = LocalDate.now();
        System.out.println("LocalDate = " + localDateVariable);

        LocalDateTime localDateTimeVariable = LocalDateTime.now();
        System.out.println("LocalDateTime = " + localDateTimeVariable);

        ZonedDateTime zonedDateTimeVariable = ZonedDateTime.now();
        System.out.println("ZonedDateTime = " + zonedDateTimeVariable);

        Date dateVariable = new Date();
        System.out.println("Date = " + dateVariable);
    }

    private static void showHowtoUseString() {
        String stringVariable = null;
        System.out.println("stringVariable = " + stringVariable);

        stringVariable = "Hello" + " " + "World" + "!";
        System.out.println("stringVariable = " + stringVariable);

        stringVariable = "Hello World!";
        System.out.println("stringVariable = " + stringVariable);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello").append(" ").append("World").append("!");
        stringVariable = builder.toString();
        System.out.println("stringVariable = " + stringVariable);
    }

    private static void showMinimalAndMaximalNumbers() {
        Integer minIntegerValue = Integer.MIN_VALUE;
        Integer maxIntegerValue = Integer.MAX_VALUE;
        System.out.println("Min Integer = " + minIntegerValue);
        System.out.println("Max Integer = " + maxIntegerValue);

        Long minLongValue = Long.MIN_VALUE;
        Long maxLongValue = Long.MAX_VALUE;
        System.out.println("Min Long = " + minLongValue);
        System.out.println("Max Long = " + maxLongValue);

        Float minFloatVariable = Float.MIN_VALUE;
        Float maxFloatVariable = Float.MAX_VALUE;
        System.out.println("Min Float = " + minFloatVariable);
        System.out.println("Max Float = " + maxFloatVariable);

        Double minDoubleVariable = Double.MIN_VALUE;
        Double maxDoubleVariable = Double.MAX_VALUE;
        System.out.println("Min Double = " + minDoubleVariable);
        System.out.println("Max Double = " + maxDoubleVariable);
    }
}
