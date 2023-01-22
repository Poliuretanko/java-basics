package com.curiositas.java.basics.session2.homework.KosachevAA.secondWar;

import com.curiositas.java.basics.session2.homework.KosachevAA.rifleMagazine.Bullets;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private boolean isMagazineCharged = false;
    private boolean isFullCharged = false;
    private int numberOfBullets = 0;

    private Rifle rifle;
    public List<Bullet> bullets;

    public Magazine(boolean isMagazineCharged, int numberOfBullets) {
        this.isMagazineCharged = isMagazineCharged;
        this.numberOfBullets = numberOfBullets;
        //this.rifle = rifle;
        this.bullets = new ArrayList<>();
    }
    public boolean getMagazineCharged(){
        return isMagazineCharged;
    }

    public void putBullet(){
        Bullet bullet = new Bullet();

        while (!isFullCharged) {
            if (bullets.size() == 5) {
                isFullCharged = true;
            } else {
                bullets.add(bullet);
            }
        }
        this.numberOfBullets = bullets.size();
    }

    public int getNumberOfBullets(){
        return bullets.size();
    }

    public String getMagazineInfo(){
        putBullet();
        return "Current magazine size: " + Integer.toString(numberOfBullets) + "\n";
    }
}
