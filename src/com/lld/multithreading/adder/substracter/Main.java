package com.lld.multithreading.adder.substracter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
public static void main(String[] args) throws Exception {
    //int x = 0;
    Value x = new Value(0);
    Lock lock = new ReentrantLock();
    Adder adder = new Adder(x , lock);
    Substracter substracter = new Substracter(x, lock);
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    Future<?> adderFuture = executorService.submit(adder);
    Future<?> substracterFuture = executorService.submit(substracter);
    adderFuture.get();
    substracterFuture.get();

    System.out.println(x);
    }
}
