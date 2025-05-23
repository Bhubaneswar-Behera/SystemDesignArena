package com.lld.multithreading.introduction;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciNumber implements Callable<Integer> {
    int n;

    public FibonacciNumber(int n) {
        this.n = n;
    }

    int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    @Override
    public Integer call() throws Exception {
        if (n <= 1) {
            return n;
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> firstFuture = executorService.submit(new FibonacciNumber(n - 1));
        Future<Integer> secondFuture = executorService.submit(new FibonacciNumber(n - 2));

        int x = firstFuture.get();
        int y = secondFuture.get();
        return x+y;
    }
}
