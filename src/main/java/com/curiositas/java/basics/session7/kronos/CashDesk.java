package com.curiositas.java.basics.session7.kronos;

import java.util.Random;

public class CashDesk implements Runnable{
    Random customBill = new Random();
    int customerNumber;

    public CashDesk(int customer){
        this.customerNumber=customer;
    }

    @Override
    public void run(){
        int customerBill = customBill.nextInt(1,1700);
        System.out.println("Customer #" + customerNumber + " paid " + customerBill + " dollars");
    }

}
