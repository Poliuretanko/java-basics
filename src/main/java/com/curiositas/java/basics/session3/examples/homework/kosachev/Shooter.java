package com.curiositas.java.basics.session3.examples.homework.kosachev;

public class Shooter {

    public static void main(String[] args) {
        Magazine recharge = new Magazine(3);
        Rifle rifle = new Rifle(recharge);
        var retrieveMagazine = rifle.retrieveMagazine();

        System.out.println("Is magazine charged: "+retrieveMagazine.isMagazineCharged());

        while (!retrieveMagazine.isMagazineCharged()){ //Каждый раз будет инициализироваться новая пуля класса HeavyBullet
            HeavyBullet bullet = new HeavyBullet();
            System.out.println(bullet.insertBullet());
            retrieveMagazine.putBullet(bullet);
        }

        System.out.println("Is magazine charged: "+retrieveMagazine.isMagazineCharged());
        System.out.println("Number of bullets in magazine: "+retrieveMagazine.getNumberOfBullets());

    }
}
