package com.curiositas.java.basics.exam.kronos.customer;

import com.curiositas.java.basics.exam.kronos.clean.*;

import java.util.*;

public class CustomerCleanChose {

    public String makeVehicleOwnerChose() {
        Random random = new Random();
        int vehicleOwnerCleanChose = random.nextInt(0, 4);
        Clean wash = new Wash();
        Clean washPlusDry = new WashPlusDry();
        Clean washPlusDryPlusPolishing = new WashPlusDryPlusPolishing();
        Clean washPlusPolishing = new WashPlusPolishing();
        Clean[] optionList = {wash,washPlusDry,washPlusDryPlusPolishing,washPlusPolishing};
        return optionList[vehicleOwnerCleanChose].cleanType();
    }
}

