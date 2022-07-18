package com.curiositas.java.basics.session4.examples;

import com.curiositas.java.basics.session4.examples.overloading.OperationUtils;

public class Step16_2Overloading {
    public static void main(String[] args) {

        System.out.println("\nSummarizing numbers");
        short shortValue1 = 5; // Can be from -32,768 to 32,767
        short shortValue2 = 10;
        long shortSum = OperationUtils.sum(shortValue1, shortValue2);
        System.out.println("Short sum = " + shortSum);

        int intValue1 = 6; // Can be from -2^31 to 2^31-1
        int intValue2 = 11;
        long intSum = OperationUtils.sum(intValue1, intValue2);
        System.out.println("Int sum = " + intSum);

        long longValue1 = 7; // Can be from -2^63 to 2^63-1
        long longValue2 = 12;
        long longSum = OperationUtils.sum(longValue1, longValue2);
        System.out.println("Long sum = " + longSum);

        System.out.println("\nChecking values is false");
        String isFalseStringValue = "0";
        char isFalseCharValue = '0';
        int isFalseIntValue = 0;
        boolean isFalseBooleanValue = false;
        OperationUtils.isFalse(isFalseStringValue);
        OperationUtils.isFalse(isFalseCharValue);
        OperationUtils.isFalse(isFalseIntValue);
        OperationUtils.isFalse(isFalseBooleanValue);

        System.out.println("\nConcatenate chars");
        System.out.println(OperationUtils.concatenate('a', 'b'));
        System.out.println(OperationUtils.concatenate('a', 'b', 'c'));
    }
}
