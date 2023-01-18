package com.curiositas.java.basics.session2.homework.KosachevAA.secondWar;

public class Rifle {

    private boolean isMagazineChargedAndInserted = false;
    private boolean isMagazineRetrieved = true;
    private boolean isMagazineEmpty = true;
    private static int numberOfBulletsInMagazine = 0;
    private Magazine magazine;

    public Rifle(int numberOfBulletsInMagazine) {
        this.numberOfBulletsInMagazine = numberOfBulletsInMagazine;
    }

    public boolean getMagazineEmpty(){return isMagazineEmpty;}
    public boolean getMagazineRetrieved(){
        return isMagazineRetrieved;
    }
    public int getNumberOfBulletsInMagazine(){
        return numberOfBulletsInMagazine;
    }
    public void setMagazineChargedAndInserted(){
        this.isMagazineChargedAndInserted = isMagazineChargedAndInserted;
    }



    public static void main(String[] args) {
        Magazine recharge = new Magazine(false, numberOfBulletsInMagazine);

        System.out.println(recharge.getMagazineInfo());

        }

}
