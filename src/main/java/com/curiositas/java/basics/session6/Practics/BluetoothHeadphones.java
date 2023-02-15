package com.curiositas.java.basics.session6.Practics;

import java.util.Scanner;

public class BluetoothHeadphones {
    private static boolean modeOfBluetoothHeadphone = false;
    private static String BluetoothStatus;

    private static String DeviceName;


    public static void main(String Args[]) throws Exception {
        operationTurnOff();
        operationTurnOn();
        operationSearchDevicesToConnect();
        operationGetListOfDevicesAvailableToConnect();
        operationConnectionToDevice();
        operationTurnOff();
    }

    private static void operationTurnOff() {
        setModeOfBluetoothHeadphone(false);
    }


    private static void operationTurnOn() throws Exception {
        setModeOfBluetoothHeadphone(true);
        statusNotConnectedYet();
    }

    private static void operationSearchDevicesToConnect() throws Exception {
        statusSearchingDevices();
    }

    private static void operationGetListOfDevicesAvailableToConnect() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name of Device:");
        DeviceName = in.nextLine();
    }

    private static void operationConnectionToDevice() throws Exception {
        statusConnectedToDevice();
        System.out.println("You connect to " + DeviceName);
    }

    private static void statusNotConnectedYet() throws Exception {
        if (modeOfBluetoothHeadphone = true) {
            setBluetoothStatus("NotConnect");
        } else {
            throw new Exception("Device Turn off");
        }
    }

    private static void statusSearchingDevices() throws Exception {
        if (modeOfBluetoothHeadphone = true) {
            setBluetoothStatus("SearchingDevices");
        } else {
            throw new Exception("Device Turn off");
        }
    }

    private static void statusConnectedToDevice() throws Exception {
        if (modeOfBluetoothHeadphone = true) {
            setBluetoothStatus("ConnectedToDevice");
        } else {
            throw new Exception("Device Turn off");
        }
    }

    public static void setModeOfBluetoothHeadphone(boolean modeOfBluetoothHeadphone) {
        BluetoothHeadphones.modeOfBluetoothHeadphone = modeOfBluetoothHeadphone;
    }


    public static void setBluetoothStatus(String bluetoothStatus) {
        BluetoothStatus = bluetoothStatus;
    }

}
