package com.lld.multithreading.introduction;

public class HelloWorldPrinter implements Runnable{

    public void print() {
        System.out.println("Hello World");
        System.out.println("HelloWorldPrinter is executing : "+Thread.currentThread().getName());
    }
    @Override
    public void run() {
        print();
    }
}
