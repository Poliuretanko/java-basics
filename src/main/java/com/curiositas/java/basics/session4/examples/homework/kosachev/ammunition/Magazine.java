package com.curiositas.java.basics.session4.examples.homework.kosachev.ammunition;

import com.curiositas.java.basics.session4.examples.homework.kosachev.bullets.Bullet;
import com.curiositas.java.basics.session4.examples.homework.kosachev.bullets.ExpansiveBullet;
import com.curiositas.java.basics.session4.examples.homework.kosachev.bullets.HeavyBullet;

import java.util.HashSet;
import java.util.Set;

public class Magazine {

    private int magazineCapacity;

    private final static int minimalMagazineCapacity = 0;
    private final static int maximalMagazineCapacity = 5;

    public Set<Bullet> bullets;

    public Magazine(int magazineCapacity) {
        this.magazineCapacity = magazineCapacity;
        this.bullets = new HashSet<Bullet>();
    }

    public boolean isMagazineCharged() {

        return bullets.size() == magazineCapacity;

    }

    public void putBullet(HeavyBullet bullet) {

        if (!isMagazineCharged()) {
            bullets.add(bullet);
        }
    }

    public void putBullet(ExpansiveBullet bullet) {

        if (bullets.size() < minimalMagazineCapacity) { //в принципе невозможная ситуация, т.к. Set никогда не вернет size() -1, но все же...
            throw new IllegalArgumentException("Magazine cannot contain bullets less than " + minimalMagazineCapacity);
        }
        if (bullets.size() >= maximalMagazineCapacity) {
            throw new IllegalArgumentException("Magazine cannot contain more " + maximalMagazineCapacity + " bullets");
        }
        bullets.add(bullet);
    }

    public int getNumberOfBullets() {
        return bullets.size();
    }

}
