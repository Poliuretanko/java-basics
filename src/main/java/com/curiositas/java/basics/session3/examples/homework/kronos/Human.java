package com.curiositas.java.basics.session3.examples.homework.kronos;

import java.util.Random;

public class Human {

    static Random rd = new Random();
    private static final boolean isHumanWeared = rd.nextBoolean();
    private static final boolean willBeWashed = rd.nextBoolean();
    static Wear wear = buyClothes();

    public static void main(String[] args) {
        putOnWear();
        if (!isHumanWeared) {
            throw new IllegalStateException("Underwear is forbidden!!");
        };
        if(wear.shouldBeCleaned() && willBeWashed) {
            washClothes();
        } else {
            throw new IllegalStateException("Wear should be cleaned");
        }
        if (!wear.shouldBeUtilized()){
        utilizeClothes();}
    }
    static private Wear buyClothes(){
        Jeans jeans = new Jeans();
        TShirt tShirt = new TShirt();
        return new Wear(jeans,tShirt);
   }
    static void putOnWear(){
        wear.wearIsWeared(isHumanWeared);
    }
    static void washClothes(){
        System.out.println(wear.jeans.Cleaned(willBeWashed));
        System.out.println(wear.tShirt.Cleaned(willBeWashed));
    }

    static void utilizeClothes(){
        System.out.println(wear.jeans.Utilized(true));
        System.out.println(wear.tShirt.Utilized(true));
    }
}
