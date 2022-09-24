package com.curiositas.java.basics.session5.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Step18_1SimpleDataTypes {
    public static void main(String[] args) {
        showHowtoUseString();

        showMinimalAndMaximalNumbers();

        showWhichDatesAreExists();

        showBooleanOperators();
    }

    private static void showBooleanOperators() {
        System.out.println("Logical expression is " + (a() || b() || c()));
    }

    public static boolean a() {
        System.out.println("A");
        return false;
    }

    public static boolean b() {
        System.out.println("B");
        return true;
    }

    public static boolean c() {
        System.out.println("C");
        return true;
    }

    private static void showWhichDatesAreExists() {
        LocalDate localDateVariable = LocalDate.now();
        System.out.println("LocalDate = " + localDateVariable);
        System.out.println(localDateVariable.getYear());

        LocalDateTime localDateTimeVariable = LocalDateTime.now();
        System.out.println("LocalDateTime = " + localDateTimeVariable);

        ZonedDateTime zonedDateTimeVariable = ZonedDateTime.now();
        System.out.println("ZonedDateTime = " + zonedDateTimeVariable);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        System.out.println(formatter.parse("2023-04-04"));
        System.out.println(formatter.format(localDateVariable));
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
        String stringVariable3 = "Hello World!2";
        String stringVariable1 = "Hello World!1";
        String stringVariable2 = "Hello World!1";
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
        Double maxDoubleVariable2 = -Double.MAX_VALUE*2;
        Double minDoubleVariable = Double.MIN_VALUE;
        Double maxDoubleVariable = Double.MAX_VALUE;
        System.out.println("Min Double = " + minDoubleVariable);
        System.out.println("Max Double = " + maxDoubleVariable);
    }
}
