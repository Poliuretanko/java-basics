package com.curiositas.java.basics.session2.examples.inheritance.sockets;

public class EuropeanElectricSocket implements ElectricSocket {
    private Plug connectedPlug;

    @Override
    public void connect(Plug plug) throws Exception {
        ElectricSocket.super.connect(plug);
        connectedPlug = plug;
    }

    @Override
    public void disconnect() {
        connectedPlug = null;
    }

    @Override
    public String getName() {
        return "European socket";
    }
}
