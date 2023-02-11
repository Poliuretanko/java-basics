package com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic;

import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.MailPackage;

import java.util.HashSet;
import java.util.Set;

public class Postbox {

    private final int maxWeightPackage = 10;
    public int currentWeightPackage = 0;
    public Set<MailPackage> mailPackages;

    public Postbox() {
        this.mailPackages = new HashSet<MailPackage>();
    }

    public int getCurrentWeightPackage() {
        return currentWeightPackage;
    }

    public String getHowMuchFreeSpaceLeft() {
        return "Current free space in post box: " + (maxWeightPackage - currentWeightPackage) + " volume units.";
    }

    public int leftFreeSpace() {
        return maxWeightPackage - currentWeightPackage;
    }

       public void setMailPackagesInBox(MailPackage mailPackage) {
        if (mailPackage == null) {
            throw new IllegalArgumentException("Can't be put into the postbox of the void");
        }

        if (leftFreeSpace() >= mailPackage.getWeightPackage()) {
            mailPackages.add(mailPackage);
            currentWeightPackage = currentWeightPackage + mailPackage.getWeightPackage();
        } else {
            throw new IllegalArgumentException("Postbox can't contain more SmallPackage! Left free space: " + leftFreeSpace() + " volume units. SmallPackage weight "
                    + mailPackage.getWeightPackage() + " volume units.");
        }
    }

    public void setPullAllMailPackages() {
        if (currentWeightPackage > 0) {
            mailPackages.clear();
            currentWeightPackage = 0;
        }
    }

    public void setPullMailPackages(MailPackage mailPackage) {
        if (currentWeightPackage > 0) {
            mailPackages.remove(mailPackage);
            currentWeightPackage = currentWeightPackage - mailPackage.getWeightPackage();
        }
    }

}
