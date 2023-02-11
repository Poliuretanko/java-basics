package com.curiositas.java.basics.session6.practice.almikele;

public class BluetoothHeadPhones {
    private boolean turnedOn = false;
    private boolean connected = false;
    private String connectedDeviceName;

    public BluetoothHeadPhones() {
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public String getConnectedDeviceName() {
        return connectedDeviceName;
    }

    public void setConnectedDeviceName(String connectedDeviceName) {
        this.connectedDeviceName = connectedDeviceName;
    }
}
