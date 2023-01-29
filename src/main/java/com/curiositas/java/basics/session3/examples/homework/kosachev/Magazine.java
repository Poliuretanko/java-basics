package com.curiositas.java.basics.session3.examples.homework.kosachev;

import java.util.HashSet;
import java.util.Set;

public class Magazine {

    private int magazineCapacity;

    public Set<HeavyBullet> bullets;

    public Magazine(int magazineCapacity) {
        this.magazineCapacity = magazineCapacity;
        this.bullets = new HashSet<HeavyBullet>();
    }

    public boolean isMagazineCharged() {

        return bullets.size() == magazineCapacity;

    }

    public void putBullet(HeavyBullet bullet) {

        if (!isMagazineCharged()) {
            bullets.add(bullet);
        }

    }

    public int getNumberOfBullets() {
        return bullets.size();
    }

}
