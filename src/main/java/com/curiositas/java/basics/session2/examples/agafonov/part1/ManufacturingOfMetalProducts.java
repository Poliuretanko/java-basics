package com.curiositas.java.basics.session2.examples.agafonov.part1;

import com.curiositas.java.basics.session2.examples.agafonov.part1.MetalHardeningShop.MetalTempering;
import com.curiositas.java.basics.session2.examples.agafonov.part1.MetalMeltingShop.MeltingPouring;
import com.curiositas.java.basics.session2.examples.agafonov.part1.MetalScrapShop.ShipmentMetalIntoTrolley;


import java.util.ArrayList;
import java.util.List;

import static com.curiositas.java.basics.session2.examples.agafonov.part1.MetalHardeningShop.MetalTempering.HardeningCycle;


public class ManufacturingOfMetalProducts {
    public static void main (String args[])
    {
        MetalTempering metalTempering = new MetalTempering(){};
        metalTempering.heat();
        metalTempering.cooldown();

        for (String metalScrap : metalScrapShop()) {
            System.out.println(metalScrap);
        }
        for (String molded : metalMeltingShop()) {
            System.out.println(molded);
        }
        for (int i = 0; i < HardeningCycle; i++){
            System.out.println( metalTempering.heat());
            System.out.println( metalTempering.cooldown());
        }


    }
    static List<String> metalScrapShop() {
        ShipmentMetalIntoTrolley shipmentMetalIntoTrolley = new ShipmentMetalIntoTrolley();
        List<String> metalScrap = new ArrayList<>();
        metalScrap.add(shipmentMetalIntoTrolley.shipment());
        return metalScrap;

    }
    static List<String> metalMeltingShop(){
        MeltingPouring meltingPouring = new MeltingPouring();
        List<String> molded = new ArrayList<>();
        molded.add(meltingPouring.smelting());
        molded.add(meltingPouring.pouring());
        return molded;
    }
    }
