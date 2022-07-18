package com.curiositas.java.basics.session4.examples.overloading;

public class OperationUtils {

    public static long sum(short x, short y) {
        System.out.println("Summarizing short");
        return x + y;
    }

    public static long sum(int x, int y) {
        System.out.println("Summarizing int");
        return x + y;
    }

    public static long sum(long x, long y) {
        System.out.println("Summarizing long");
        return x + y;
    }

    public static boolean isFalse(String value) {
        System.out.println("Checking string is false");
        return "false".equalsIgnoreCase(value) || "f".equalsIgnoreCase(value) || "0".equalsIgnoreCase(value);
    }

    public static boolean isFalse(boolean value) {
        System.out.println("Checking boolean is false");
        return !value;
    }

    public static boolean isFalse(int value) {
        System.out.println("Checking int is false");
        return value == 0;
    }

    public static boolean isFalse(char value) {
        System.out.println("Checking char is false");
        return value == 'f' || value == '0';
    }

    public static String concatenate(char value1, char value2) {
        System.out.println("Concatenate 2 chars");
        return String.valueOf(value1) + value2;
    }

    public static String concatenate(char value1, char value2, char value3) {
        System.out.println("Concatenate 3 chars");
        return String.valueOf(value1) + value2 + value3;
    }
}
