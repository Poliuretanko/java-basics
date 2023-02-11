package com.curiositas.java.basics.Kosachev;

import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.Postbox;
import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.BigPackage;
import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.MiddlePackage;
import com.curiositas.java.basics.session4.examples.homework.kosachev.forPractic.mailPackage.SmallPackage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PostBoxTest {

    @Test
    public void testSmallBox(){

        Postbox mailAction = new Postbox();

        SmallPackage smallPackage1 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage1);

        SmallPackage smallPackage2 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage2);

        SmallPackage smallPackage3 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage3);

        SmallPackage smallPackage4 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage4);

        SmallPackage smallPackage5 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage5);

        SmallPackage smallPackage6 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage6);

        SmallPackage smallPackage7 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage7);

        SmallPackage smallPackage8 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage8);

        SmallPackage smallPackage9 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage9);

        SmallPackage smallPackage10 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage10);

        var postBoxWeight = mailAction.getCurrentWeightPackage();

        assertEquals(10,postBoxWeight);

    }


    @Test
    public void testSmallBox2(){

        Postbox mailAction = new Postbox();
        for (int i = 1; i <= 10; i++){
            SmallPackage smallPackage = new SmallPackage();
            mailAction.setMailPackagesInBox(smallPackage);
        }
        var postBoxWeight = mailAction.getCurrentWeightPackage();
        assertEquals(10,postBoxWeight);

    }

    @Test
    public void testMiddleBox(){

        Postbox mailAction = new Postbox();
        for (int i = 1; i <= 3; i++){
            MiddlePackage middlePackage = new MiddlePackage();
            mailAction.setMailPackagesInBox(middlePackage);
        }
        var postBoxWeight = mailAction.getCurrentWeightPackage();
        assertEquals(9,postBoxWeight);
    }

    @Test
    public void testMixBox(){

        Postbox mailAction = new Postbox();
        MiddlePackage middlePackage1 = new MiddlePackage();
        mailAction.setMailPackagesInBox(middlePackage1);

        MiddlePackage middlePackage2 = new MiddlePackage();
        mailAction.setMailPackagesInBox(middlePackage2);

        SmallPackage smallPackage1 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage1);

        SmallPackage smallPackage2 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage2);

        var postBoxWeight = mailAction.getCurrentWeightPackage();
        assertEquals(8,postBoxWeight);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException(){
        Postbox mailAction = new Postbox();
        SmallPackage smallPackage = null;
        mailAction.setMailPackagesInBox(smallPackage);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException2(){
        Postbox mailAction = new Postbox();
        MiddlePackage middlePackage = new MiddlePackage();
        mailAction.setMailPackagesInBox(middlePackage);
        BigPackage bigPackage = new BigPackage();
        mailAction.setMailPackagesInBox(bigPackage);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException3(){
        Postbox mailAction = new Postbox();
        BigPackage bigPackage1 = new BigPackage();
        mailAction.setMailPackagesInBox(bigPackage1);
        BigPackage bigPackage2 = new BigPackage();
        mailAction.setMailPackagesInBox(bigPackage2);
    }

    @Test
    public void testMixBoxPutPull(){

        Postbox mailAction = new Postbox();
        MiddlePackage middlePackage1 = new MiddlePackage();
        mailAction.setMailPackagesInBox(middlePackage1);

        MiddlePackage middlePackage2 = new MiddlePackage();
        mailAction.setMailPackagesInBox(middlePackage2);

        SmallPackage smallPackage1 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage1);

        SmallPackage smallPackage2 = new SmallPackage();
        mailAction.setMailPackagesInBox(smallPackage2);

        var postBoxWeight = mailAction.getCurrentWeightPackage();
        assertEquals(8,postBoxWeight);

        mailAction.setPullAllMailPackages();

        var postBoxEmpty = mailAction.getCurrentWeightPackage();
        assertEquals(0,postBoxEmpty);
    }

    @Test
    public void testMiddleBoxPutGetLeftFreeSpace(){

        Postbox mailAction = new Postbox();
        for (int i = 1; i <= 3; i++){
            MiddlePackage middlePackage = new MiddlePackage();
            mailAction.setMailPackagesInBox(middlePackage);
        }
        var postBoxWeight = mailAction.getCurrentWeightPackage();
        assertEquals(9,postBoxWeight);

        int PostBoxFreeSpace =  mailAction.leftFreeSpace();

        assertEquals(1,PostBoxFreeSpace);
    }


}
