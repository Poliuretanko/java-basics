package com.curiositas.java.basics.session6.practice.almikele;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class BluetoothHeadPhonesTest {
    private final BluetoothHeadPhonesActions bluetoothHeadPhonesActions = new BluetoothHeadPhonesActions();

    @Test
    public void turnOnPhones() {
        BluetoothHeadPhones bluetoothHeadPhones = newSwitchedOnHeadPhones();
        assertTrue(bluetoothHeadPhones.isTurnedOn());
        assertFalse(bluetoothHeadPhones.isConnected());
    }

    @Test
    public void turnOffPhones() {
        BluetoothHeadPhones bluetoothHeadPhones = new BluetoothHeadPhones();
        bluetoothHeadPhonesActions.turnOff(bluetoothHeadPhones);
        assertFalse(bluetoothHeadPhones.isTurnedOn());
        assertFalse(bluetoothHeadPhones.isConnected());
        assertNull(bluetoothHeadPhones.getConnectedDeviceName());
    }

    @Test
    public void successConnectionToDevice() {
        BluetoothHeadPhones bluetoothHeadPhones = newSwitchedOnHeadPhones();
        String device = bluetoothHeadPhonesActions.findDeviceToConnect(bluetoothHeadPhones);
        bluetoothHeadPhonesActions.connectToDevice(bluetoothHeadPhones, device);
        assertTrue(bluetoothHeadPhones.isTurnedOn());
        assertTrue(bluetoothHeadPhones.isConnected());
        assertNotNull(bluetoothHeadPhones.getConnectedDeviceName());
    }

    @Test(expected = IllegalStateException.class)
    public void wrongStatePhones() {
        BluetoothHeadPhones bluetoothHeadPhones = new BluetoothHeadPhones();
        bluetoothHeadPhonesActions.turnOff(bluetoothHeadPhones);
        bluetoothHeadPhonesActions.findDeviceToConnect(bluetoothHeadPhones);
    }

    @Test(expected = IllegalStateException.class)
    public void wrongStateConnection() {
        BluetoothHeadPhones bluetoothHeadPhones = newSwitchedOnHeadPhones();
        String device = bluetoothHeadPhonesActions.findDeviceToConnect(bluetoothHeadPhones);
        bluetoothHeadPhonesActions.connectToDevice(bluetoothHeadPhones, device);
        bluetoothHeadPhonesActions.connectToDevice(bluetoothHeadPhones, device);
    }

    public static Stream<Arguments> dataWaterStateFail() {
        return Stream.of(
                Arguments.of("qwe"),
                Arguments.of((Object) null));
    }

    @ParameterizedTest
    @MethodSource("dataWaterStateFail")
    public void wrongDeviceConnection(String device) {
        BluetoothHeadPhones bluetoothHeadPhones = newSwitchedOnHeadPhones();
        assertThrows(
                IllegalArgumentException.class,
                () -> bluetoothHeadPhonesActions.connectToDevice(bluetoothHeadPhones, device));
    }

    @NotNull
    private BluetoothHeadPhones newSwitchedOnHeadPhones() {
        BluetoothHeadPhones bluetoothHeadPhones = new BluetoothHeadPhones();
        bluetoothHeadPhonesActions.turnOn(bluetoothHeadPhones);
        return bluetoothHeadPhones;
    }
}
