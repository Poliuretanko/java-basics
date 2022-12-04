package com.curiositas.java.basics.archive.c07112022.exam.kronos;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WashStation {

    static Random random = new Random();
    static int vehiclesInLine = random.nextInt(12,281);

    public static void main(String[] args) {
        int CLEANING_CELL = 4;
        ExecutorService executor = Executors.newFixedThreadPool(CLEANING_CELL);
        System.out.println("Number of vehicle in line:" + vehiclesInLine);
        for (int i = 0; i < vehiclesInLine; i++) {
            executor.execute(new CleaningCell(i));
        }
        executor.shutdown();
    }
}
