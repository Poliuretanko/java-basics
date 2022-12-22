package com.curiositas.java.basics.session2.homework.KosachevAA;

import com.curiositas.java.basics.session2.homework.KosachevAA.rifle.Shutter;
import com.curiositas.java.basics.session2.homework.KosachevAA.rifleMagazine.Bullets;
import java.util.ArrayList;
import java.util.List;

import static com.curiositas.java.basics.session2.homework.KosachevAA.rifleMagazine.Bullets.fullMagazine;

public class RifleReload {

    public static void main(String[] args) {

        for (String startReload : reload()) {
            System.out.println(startReload);
        }
        for (String rifleReloaded : pullShutter()) {
            System.out.println(rifleReloaded);
        }

    }

    static List<String> reload(){
        Bullets bullet = new Bullets() {};
        List<String> ammoPackage = new ArrayList<>();
        ammoPackage.add(bullet.openPackage());
        for (int i = 0; i < fullMagazine; i++) {
            ammoPackage.add(bullet.insertBullet());
        }
        ammoPackage.add(bullet.chargedMagazine());
        return ammoPackage;
    }

    static List<String> pullShutter(){
        Shutter shutter = new Shutter() {};
        List<String> rifleShutter = new ArrayList<>();
        rifleShutter.add(shutter.pullShutter());
        return rifleShutter;
    }

}
