package com.curiositas.java.basics.session7.examples.homework.kosachev;

public class OrderProcessingExecutor implements Runnable{


    protected final ArrayPurchase arrayPurchase;

    protected static Integer executedTaskCounter = 0;

    public OrderProcessingExecutor(ArrayPurchase arrayPurchase) {
        this.arrayPurchase = arrayPurchase;
    }

    public Integer getOrderProcessingExecutorTaskCounter() {
        return executedTaskCounter;
    }

    @Override
    public void run() {
        while (arrayPurchase.hasOrderProcessing()) {
            Purchase purchase = arrayPurchase.pullOrderProcessing();
            purchase.orderProcessing();
            synchronized (this) {
                executedTaskCounter++;
            }
        }

    }
}
