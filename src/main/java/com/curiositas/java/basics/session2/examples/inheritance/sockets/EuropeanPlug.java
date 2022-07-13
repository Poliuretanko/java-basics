package com.curiositas.java.basics.session2.examples.inheritance.sockets;

public class EuropeanPlug implements Plug {
    @Override
    public boolean isFits(ElectricSocket socket) {
        return socket instanceof EuropeanElectricSocket;
    }

    @Override
    public String getName() {
        return "European plug";
    }
}
