package com.lld.multithreading.adder.substracter;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable {

    //int x;
    Value x;
    Lock lock;;

    public Adder(Value x , Lock lock) {
        this.x = x;
        this.lock = lock;
    }

    @Override
    public Object call() throws Exception {
        add();
        return null;
    }

    private void add(){
        for (int i = 0; i < 100 ; i++) {
            lock.lock();
            x.setX(x.getX()+1);
            //x = x + 1;
            System.out.println("Added value = " + x.getX());
            lock.unlock();
        }
    }
    }
