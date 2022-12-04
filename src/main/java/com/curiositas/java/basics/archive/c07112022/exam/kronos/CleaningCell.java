package com.curiositas.java.basics.archive.c07112022.exam.kronos;

import com.curiositas.java.basics.archive.c07112022.exam.kronos.customer.CustomerCleanChose;
import com.curiositas.java.basics.archive.c07112022.exam.kronos.customer.CustomerVehicleType;
public class CleaningCell implements Runnable {
    int vehicleNumber;

    public CleaningCell(int vehicle){
        this.vehicleNumber=vehicle;
    }

    @Override
    public void run(){
        CustomerVehicleType vehicleType = new CustomerVehicleType();
        CustomerCleanChose customerCleanChose = new CustomerCleanChose();
        System.out.println("Vehicle #" + vehicleNumber + " with type " + vehicleType.defineCustomerVehicleType()
                + " is processed with option \"" + customerCleanChose.makeVehicleOwnerChose() + "\"");
    }
}
