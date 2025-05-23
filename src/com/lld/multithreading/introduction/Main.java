package com.lld.multithreading.introduction;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Main Thread is executing : "+Thread.currentThread().getName());
        Thread thread = new Thread(new HelloWorldPrinter());
        //thread.start();
        //HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i <= 100 ; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            //using conventional thread to print numbers
            //Thread thread1 = new Thread(numberPrinter);
            //thread1.start();

            //using executorService to manage threads
            //executorService.execute(numberPrinter);
            executorService.shutdown();
        }

        ExecutorService executorService1 = Executors.newCachedThreadPool();
        Future<Integer> future = executorService1.submit(new FibonacciNumber(10));
        System.out.println(future.get());
        executorService1.shutdown();
    }
}
