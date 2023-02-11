package com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic;

import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.BigPackage;
import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.MiddlePackage;
import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.SmallPackage;

public class MailAction {

    public static void main(String[] args) {

        Postbox mailAction = new Postbox();

        MiddlePackage middlePackage1 = new MiddlePackage();
        mailAction.setMailPackagesInBox(middlePackage1);

        MiddlePackage middlePackage2 = new MiddlePackage();
        mailAction.setMailPackagesInBox(middlePackage2);

        SmallPackage smallPackage1 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage1);

        SmallPackage smallPackage2 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage2);

        System.out.println(mailAction.getHowMuchFreeSpaceLeft());

//        BigPackage bigPackage = new BigPackage();
//        mailAction.setMailPackagesInBox(bigPackage);
//
//        System.out.println(mailAction.getHowMuchFreeSpaceLeft());

        mailAction.setPullAllMailPackages();

        System.out.println(mailAction.getHowMuchFreeSpaceLeft());

    }

}
