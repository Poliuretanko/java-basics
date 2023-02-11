package com.curiositas.java.basics.session4.examples.homework.kosachev;

import com.curiositas.java.basics.session4.examples.homework.kosachev.ammunition.Gun;
import com.curiositas.java.basics.session4.examples.homework.kosachev.ammunition.Magazine;
import com.curiositas.java.basics.session4.examples.homework.kosachev.ammunition.Rifle;
import com.curiositas.java.basics.session4.examples.homework.kosachev.bullets.ExpansiveBullet;
import com.curiositas.java.basics.session4.examples.homework.kosachev.bullets.HeavyBullet;

public class Shooter {

    public static void main(String[] args) {
        Magazine recharge = new Magazine(5);
        Gun rifle = new Rifle(recharge);
        var retrieveMagazine = rifle.retrieveMagazine();

        System.out.println("Is magazine charged: "+retrieveMagazine.isMagazineCharged());

        while (!retrieveMagazine.isMagazineCharged()){ //Каждый раз будет инициализироваться новая пуля класса HeavyBullet
            HeavyBullet bullet = new HeavyBullet();
            retrieveMagazine.putBullet(bullet);
            System.out.println(bullet.insertBullet());
        }

        System.out.println("Is magazine charged: "+retrieveMagazine.isMagazineCharged());
        System.out.println("Number of bullets in magazine: "+retrieveMagazine.getNumberOfBullets());

        ExpansiveBullet expansivebullet = new ExpansiveBullet();
        retrieveMagazine.putBullet(expansivebullet);
        System.out.println(expansivebullet.insertBullet());

    }
}
