package com.curiositas.java.basics.session3.examples.homework.kosachev;

public class Shooter {

    public static void main(String[] args) {
        Magazine recharge = new Magazine(3);
        Rifle rifle = new Rifle(recharge);


        HeavyBullet bullet1 = new HeavyBullet();
        HeavyBullet bullet2 = new HeavyBullet();
        HeavyBullet bullet3 = new HeavyBullet();


        var retrieveMagazine = rifle.retrieveMagazine();

        retrieveMagazine.putBullet(bullet1);
        retrieveMagazine.putBullet(bullet2);
        retrieveMagazine.putBullet(bullet3);


        System.out.println("Is magazine charged: "+retrieveMagazine.isMagazineCharged());
        System.out.println("Number of bullets in magazine: "+retrieveMagazine.getNumberOfBullets());

    }
}
