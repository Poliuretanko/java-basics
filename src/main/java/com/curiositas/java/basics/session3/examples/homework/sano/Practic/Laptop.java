package com.curiositas.java.basics.session3.examples.homework.sano.Practic;



import java.util.Random;

public class Laptop {

    static Random condition = new Random();


    private static final boolean isCPUPlugged = condition.nextBoolean();
    private static final boolean isRAMPlugged = condition.nextBoolean();
    private static final boolean isWorking = true;
    private static final int MAX_TIME_OF_WORKING = 100;

    private static final boolean IS_BROKEN = true;
    private static final SecondaryParts secondaryParts = attachSecondaryParts();




    public static void main(String[] args) {

        CPU cpu = new CPU();
        RAM ram = new RAM();
        cpu.Plugged(isCPUPlugged);
        ram.Plugged(isRAMPlugged);
        secondaryParts.plugSecondaryParts(true);


        if (cpu.isPlugged() && ram.isPlugged()) {
            System.out.println("Everything is plugged");

        } else {
            throw new IllegalStateException("Some parts is off.");
        }


        for (int work = 1; work <= MAX_TIME_OF_WORKING; work++) {
            System.out.println(cpu.Working(isWorking) + " \n " + ram.Working(isWorking));
        }
        System.out.println(cpu.Breaks(IS_BROKEN));
        System.out.println(ram.Breaks(IS_BROKEN));
        throw new IllegalStateException(ram.Breaks(IS_BROKEN));

    }

    static private SecondaryParts attachSecondaryParts() {
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        return new SecondaryParts(monitor, keyboard);
    }
}
