package com.curiositas.java.basics.session7.examples.homework.kosachev;

public class ArrayPurchase {

    private final Purchase[] purchases;

    private int index = -1;

    public ArrayPurchase(int numberOfPurchases){
        purchases = new Purchase[numberOfPurchases];
    }

    public void addOrderProcessing(Purchase purchase){
        index++;
        purchases[index] = purchase;
    }

    public synchronized Purchase pullOrderProcessing(){
        var purchase = purchases[index];
        index--;
        return purchase;
    }

    public boolean hasOrderProcessing(){
        return index > -1;
    }

    public int detOrderProcessingCount(){
        return index + 1;
    }

}
