package com.curiositas.java.basics.session6.practice.almikele;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BluetoothHeadPhonesActions {
    void turnOn(BluetoothHeadPhones bluetoothHeadPhones) {
        bluetoothHeadPhones.setTurnedOn(true);
        bluetoothHeadPhones.setConnected(false);
    }

    void turnOff(BluetoothHeadPhones bluetoothHeadPhones) {
        bluetoothHeadPhones.setTurnedOn(false);
        bluetoothHeadPhones.setConnected(false);
        bluetoothHeadPhones.setConnectedDeviceName(null);
    }

    String findDeviceToConnect(BluetoothHeadPhones bluetoothHeadPhones) {
        if (!bluetoothHeadPhones.isTurnedOn()) {
            throw new IllegalStateException("Can't connect when headphones are off!");
        }
        List<String> devicesList = getListOfDevicesToConnect();
        if (devicesList == null) {
            throw new IllegalStateException("No devices to connect!");
        } else {
            int randomDeviceIndex = new Random().nextInt(0, devicesList.size() - 1);
            return devicesList.get(randomDeviceIndex);
        }
    }

    List<String> getListOfDevicesToConnect() {
        List<String> devices = new ArrayList<>();
        devices.add("Xiaomi");
        devices.add("iPhone7");
        devices.add("Yamaha");
        return devices;
    }

    void connectToDevice(BluetoothHeadPhones bluetoothHeadPhones, String deviceToConnect) {
        if (deviceToConnect == null) {
            throw new IllegalArgumentException("Nothing to connect!");
        }
        if (deviceToConnect.equals(bluetoothHeadPhones.getConnectedDeviceName())) {
            throw new IllegalStateException("This device already connected!");
        }
        if (!getListOfDevicesToConnect().contains(deviceToConnect)) {
            throw new IllegalArgumentException("No device with name %s in list of devices!".formatted(deviceToConnect));
        }
        bluetoothHeadPhones.setConnected(true);
        bluetoothHeadPhones.setConnectedDeviceName(deviceToConnect);
    }
}
