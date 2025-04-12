package com.lld.multithreading.introduction;

public class NumberPrinter implements Runnable{
    private int noToPrint;

    public NumberPrinter(int noToPrint) {
        this.noToPrint = noToPrint;
    }
    @Override
    public void run() {
        System.out.println("Number : " + noToPrint+ " printed by " + Thread.currentThread().getName());
    }
}
