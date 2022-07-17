package com.curiositas.java.basics.session3.examples.inheritance.sockets;

public class AmericanPlug implements Plug {
    @Override
    public boolean isFits(ElectricSocket socket) {
        return socket instanceof AmericanElectricSocket;
    }

    @Override
    public String getName() {
        return "American plug";
    }
}
