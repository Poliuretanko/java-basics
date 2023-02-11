package com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic;

import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.BigPackage;
import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.MailPackage;
import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.MiddlePackage;
import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.SmallPackage;

import java.util.HashSet;
import java.util.Set;

public class Postbox {

    private final static int maxWeightPackage = 10;
    public static int currentWeightPackage = 0;
    public Set<MailPackage> mailPackages;

    public Postbox() {
        this.mailPackages = new HashSet<MailPackage>();
    }

    public int getCurrentWeightPackage() {
        return currentWeightPackage;
    }

    public static int getMaxWeightPackage() {
        return maxWeightPackage;
    }

    public String getHowMuchFreeSpaceLeft(){
        return "Current free space in post box: "+(maxWeightPackage-currentWeightPackage)+" volume units.";
    }

    public int leftFreeSpace(){
        return maxWeightPackage-currentWeightPackage;
    }

    public void setCurrentWeightPackage(int currentWeightPackage) {
        this.currentWeightPackage = currentWeightPackage;
    }

    public void setMailPackagesInBox(BigPackage mailPackage) {
       if (leftFreeSpace()>mailPackage.getWeightPackage()){
        mailPackages.add(mailPackage);
        this.currentWeightPackage = this.currentWeightPackage+mailPackage.getWeightPackage();
        } else {
           throw new IllegalArgumentException("Postbox can't contain more BigPackage! Left free space: "+leftFreeSpace()+" volume units. BigPackage weight "+mailPackage.getWeightPackage()+" volume units.");
       }
    }

    public void setMailPackagesInBox(MiddlePackage mailPackage) {
        if (leftFreeSpace()>mailPackage.getWeightPackage()){
            mailPackages.add(mailPackage);
            this.currentWeightPackage = this.currentWeightPackage+mailPackage.getWeightPackage();
        } else {
            throw new IllegalArgumentException("Postbox can't contain more MiddlePackage! Left free space: "+leftFreeSpace()+" volume units. MiddlePackage weight "+mailPackage.getWeightPackage()+" volume units.");
        }
    }

    public void setMailPackagesInBox(SmallPackage mailPackage) {
        if (leftFreeSpace()>mailPackage.getWeightPackage()){
            mailPackages.add(mailPackage);
            this.currentWeightPackage = this.currentWeightPackage+mailPackage.getWeightPackage();
        }else {
            throw new IllegalArgumentException("Postbox can't contain more SmallPackage! Left free space: "+leftFreeSpace()+" volume units. SmallPackage weight "+mailPackage.getWeightPackage()+" volume units.");
        }
    }

    public void setPullAllMailPackages() {
        if (currentWeightPackage>0){
            mailPackages.clear();
            this.currentWeightPackage = 0;
        }
    }

}
