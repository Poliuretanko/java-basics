package com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic;

import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.BigPackage;
import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.MiddlePackage;
import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.SmallPackage;

public class MailAction {

    public static void main(String[] args) {
        Postbox mailAction = new Postbox();


        SmallPackage smallPackage1 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage1);
        System.out.println("Add SmallPackage");
        System.out.println(mailAction.getHowMuchFreeSpaceLeft());
        System.out.println("Current weight PostBox: " + mailAction.getCurrentWeightPackage());


        BigPackage bigPackage = new BigPackage();
        mailAction.setMailPackagesInBox(bigPackage);
        System.out.println("Add BigPackage");
        System.out.println(mailAction.getHowMuchFreeSpaceLeft());
        System.out.println("Current weight PostBox: " + mailAction.getCurrentWeightPackage());


        mailAction.setPullMailPackages(bigPackage);
        System.out.println("Remove BigPackage");
        System.out.println(mailAction.getHowMuchFreeSpaceLeft());
        System.out.println("Current weight PostBox: " + mailAction.getCurrentWeightPackage());


        MiddlePackage middlePackage1 = new MiddlePackage();
        mailAction.setMailPackagesInBox(middlePackage1);
        System.out.println("Add MiddlePackage");
        System.out.println(mailAction.getHowMuchFreeSpaceLeft());
        System.out.println("Current weight PostBox: " + mailAction.getCurrentWeightPackage());


        mailAction.setPullMailPackages(middlePackage1);
        System.out.println("Remove MiddlePackage");
        System.out.println(mailAction.getHowMuchFreeSpaceLeft());
        System.out.println("Current weight PostBox: " + mailAction.getCurrentWeightPackage());

    }

}
