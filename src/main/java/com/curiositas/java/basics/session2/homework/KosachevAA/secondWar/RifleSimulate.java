package com.curiositas.java.basics.session2.homework.KosachevAA.secondWar;

public class RifleSimulate {

    public static void main(String[] args) {
        Magazine recharge = new Magazine(5);
        Rifle rifle = new Rifle(recharge);


        Bullet bullet1 = new Bullet();
        Bullet bullet2 = new Bullet();
        Bullet bullet3 = new Bullet();
        Bullet bullet4 = new Bullet();
        Bullet bullet5 = new Bullet();


        var retrieveMagazine = rifle.retrieveMagazine();

        retrieveMagazine.putBullet(bullet1);
        retrieveMagazine.putBullet(bullet2);
        retrieveMagazine.putBullet(bullet3);
        retrieveMagazine.putBullet(bullet4);
        retrieveMagazine.putBullet(bullet4);

        System.out.println(retrieveMagazine.isMagazineCharged());
        //System.out.println(recharge.getMagazineInfo());

    }


}
