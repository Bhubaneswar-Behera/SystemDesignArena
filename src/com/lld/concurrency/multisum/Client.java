package com.lld.concurrency.multisum;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        int n = 1_000_000;
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(i % 100);
        }
        int numThreads = Runtime.getRuntime().availableProcessors();
        int chunkSize = n / numThreads;

        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        List<Future<Long>> sumFutures = new ArrayList<>();
        for (int i = 0; i < numThreads ; i++) {
            SumMultiThreadCallable tempTask = new SumMultiThreadCallable(arr, i * chunkSize, (i + 1) * chunkSize);
            Future<Long> future = executorService.submit(tempTask);
            sumFutures.add(future);
        }
        Long sum = 0L;
        for (Future<Long> future : sumFutures) {
            try {
                sum += future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum of array is: " + sum);
    }
}
