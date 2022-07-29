package com.curiositas.java.basics.session3.examples.homework.kronos;

import java.util.Random;

public class Human {

    static Random rd = new Random();
    private static final boolean isHumanNude = rd.nextBoolean();
    private static final boolean willBeWashed = rd.nextBoolean();
    static Wear wear = buyClothes();

    public static void main(String[] args) {
        putOnWear();
        if (isHumanNude) {
            throw new IllegalStateException("Голый мужик!!");
        };
        if (wear.jeansShouldBeCleaned() && willBeWashed) {
            washClothes(wear.jeans.Cleaned(true));
        } else if (wear.tShirtShouldBeCleaned() && willBeWashed) {
            washClothes(wear.tShirt.Cleaned(true));
        } else {
            throw new IllegalStateException("Wear should be cleaned");
        }
        if (wear.jeansShouldBeUtilized()){ //fix
            utilizeClothes(wear.jeans.Utilized(true));}
        else if (wear.tShirtShouldBeUtilized()) {
            utilizeClothes(wear.tShirt.Utilized(true));
        }
    }
    static private Wear buyClothes(){
        Jeans jeans = new Jeans();
        TShirt tShirt = new TShirt();
        return new Wear(jeans,tShirt);
   }
    static void putOnWear(){
        wear.wearIsWeared(!isHumanNude);
    }
    static void washClothes(String actionForWear){
        System.out.println(actionForWear);
    }

    static void utilizeClothes(String actionForWear){
        System.out.println(actionForWear);
    }
}
