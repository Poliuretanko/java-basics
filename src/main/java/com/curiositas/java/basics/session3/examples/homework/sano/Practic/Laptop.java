package com.curiositas.java.basics.session3.examples.homework.sano.Practic;

import java.util.ArrayList;
import java.util.Random;

public class Laptop {

    static Random candtion = new Random();

    private static final boolean isPowerOFF = candtion.nextBoolean();
    private static final boolean isCPUPlugged = candtion.nextBoolean();
    private static final boolean isRAMPlugged = candtion.nextBoolean();
    private static final boolean isWorking  = true;
    private static final int MAX_TIME_OF_WORKING = 100;

    private static final boolean IS_BROKEM = true;



    public static void main (String args[]){

        CPU cpu = new CPU();
        RAM ram = new RAM();
        cpu.Plugged(isCPUPlugged);
        ram.Plugged(isRAMPlugged);

        ArrayList parts = new ArrayList<Parts>();
        parts.add(cpu);
        parts.add(ram);
        MainParts mainParts = new MainParts(parts);

        if(cpu.isPlugged() && ram.isPlugged()){
            System.out.println("Everything is plugged");

        } else {
            throw new IllegalStateException("Some parts is off.");
        }


        for(int work=1; work <= MAX_TIME_OF_WORKING; work++){
            System.out.println(cpu.Working(isWorking) + " \n " + ram.Working(isWorking));
        }
        System.out.println(cpu.Breaks(IS_BROKEM));
        System.out.println(ram.Breaks(IS_BROKEM));
        throw new IllegalStateException(ram.Breaks(IS_BROKEM));

    }

}
