package com.lld.multithreading.adder.substracter;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Substracter implements Callable {
    //int x;
    Value x;
    Lock lock;

    public Substracter(Value x, Lock lock) {
        this.x = x;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        subtract();
        return null;
    }
    private void subtract(){
        for (int i = 0; i < 100 ; i++) {
            lock.lock();
            x.setX(x.getX() - 1);
            //x = x + 1;
            System.out.println("Substracted value = " + x.getX());
            lock.unlock();
        }
    }
}
