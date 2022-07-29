package com.curiositas.java.basics.session3.examples.homework.kronos;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Wear {
    Jeans jeans;
    TShirt tShirt;
    int MAX_TIME_APPLICABLE_FOF_WEARING = 60;
    private static final Random random = new Random();
    int wearTime = random.nextInt(MAX_TIME_APPLICABLE_FOF_WEARING);
    int wearLifecycle = random.nextInt(MAX_TIME_APPLICABLE_FOF_WEARING);
    public Wear(Jeans jeans,TShirt tShirt) {
        this.jeans = jeans;
        this.tShirt = tShirt;
    }

    boolean tShirtShouldBeCleaned(){
        return wearTime <= tShirt.MAX_TIMES_OF_WEARING;
    }

    boolean jeansShouldBeCleaned(){
        return wearTime <= jeans.MAX_TIMES_OF_WEARING;
    }
    boolean tShirtShouldBeUtilized(){
        return wearLifecycle >= tShirt.MAX_TIMES_BEFORE_UTILIZATION;
    }
    boolean jeansShouldBeUtilized(){
        return wearLifecycle >= jeans.MAX_TIMES_BEFORE_UTILIZATION;
    }

    void wearIsWeared(boolean wearState){
        System.out.println(jeans.Dressed(wearState));
        System.out.println(tShirt.Dressed(wearState));
    }

}

