package com.curiositas.java.basics.session9.examples.tasks;

public class PrimeNumberDetector {

    public boolean isPrime(int number) {

        int i = 2;
        boolean notPrime = false;
        while (i <= number / 2) {
            if (number % i == 0) {
                notPrime = true;
                break;
            }
            ++i;
        }
        return !notPrime;
    }

}
