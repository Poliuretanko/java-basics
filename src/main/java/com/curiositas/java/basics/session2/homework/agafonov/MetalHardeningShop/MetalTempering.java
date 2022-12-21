package com.curiositas.java.basics.session2.homework.agafonov.MetalHardeningShop;

public abstract class MetalTempering implements MetalHardingShop{
    public static final int HardeningCycle = 3;

    @Override
    public String heat() {return "metal heated to one thousand degrees";}

    @Override
    public String cooldown() {return "metal cool down to one thousand degrees";}
}
