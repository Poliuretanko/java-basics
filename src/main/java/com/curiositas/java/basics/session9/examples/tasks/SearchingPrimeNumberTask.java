package com.curiositas.java.basics.session9.examples.tasks;

import java.util.Random;

public class SearchingPrimeNumberTask implements Runnable {

    private final Random random = new Random();
    private final PrimeNumberDetector detector = new PrimeNumberDetector();

    @Override
    public void run() {
        while(true) {
            var number = random.nextInt();
            boolean prime = detector.isPrime(number);
        }
    }


}
