package com.curiositas.java.basics.session2.homework.KosachevAA.secondWar;

import java.util.HashSet;
import java.util.Set;

public class Magazine {

    private boolean isFullCharged = false;
    private int magazineCapacity;

    private Rifle rifle;
    // public List<Bullet> bullets;
    public Set<Bullet> bullets;

    public Magazine(int magazineCapacity) { //Rifle rifle
        this.magazineCapacity = magazineCapacity;
        //this.rifle = rifle;
        //this.bullets = new ArrayList<>();
        this.bullets = new HashSet<Bullet>();
    }

    public boolean isMagazineCharged() {

        return bullets.size() == magazineCapacity;

    }

    public void putBullet(Bullet bullet) {

        if (!isMagazineCharged()) {
            bullets.add(bullet);
        }

    }

    public int getNumberOfBullets() {
        return bullets.size();
    }


    public String getMagazineInfo() {
        // putBullet();
        return "Current magazine size: " + Integer.toString(getNumberOfBullets()) + "\n";
    }
}
