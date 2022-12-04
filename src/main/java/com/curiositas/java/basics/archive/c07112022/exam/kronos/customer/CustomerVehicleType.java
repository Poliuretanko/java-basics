package com.curiositas.java.basics.archive.c07112022.exam.kronos.customer;

import com.curiositas.java.basics.archive.c07112022.exam.kronos.vehicle.*;

import java.util.Random;

public class CustomerVehicleType {
    public String defineCustomerVehicleType() {
        Random random = new Random();
        int vehicleTypeRandom = random.nextInt(0, 2);
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle[] customerVehicleType = {car,truck};
        return customerVehicleType[vehicleTypeRandom].InformAboutSelf();
    }
}
