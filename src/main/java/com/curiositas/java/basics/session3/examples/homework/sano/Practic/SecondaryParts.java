package com.curiositas.java.basics.session3.examples.homework.sano.Practic;

import java.util.ArrayList;

public  class SecondaryParts {

    Monitor monitor;
    Keyboard keyboard;
    ArrayList parts= new ArrayList<Parts>();

    public SecondaryParts(Monitor monitor, Keyboard keyboard) {
        this.monitor = monitor;
        this.keyboard = keyboard;

    }

    public void plugSecondaryParts(boolean plug){
        System.out.println(keyboard.Plugged(plug));
        System.out.println(monitor.Plugged(plug));

    }
}
