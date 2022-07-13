package com.curiositas.java.basics.session2.examples.inheritance.sockets;

public interface ElectricSocket {
    default void connect(Plug plug) throws Exception {
        if (!plug.isFits(this)) {
            String exceptionMessage = this.getName() + " doesn't fit to " + plug.getName();
            throw new Exception(exceptionMessage);
        }
        System.out.println(plug.getName() + " connected to " + this.getName());
    }

    void disconnect();

    String getName();
}
